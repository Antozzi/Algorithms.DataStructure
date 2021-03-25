package hw4;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        NewLinkedList<String> ll = new NewLinkedList<>();

        //Add 3 items first
        ll.insertFirst("What");
        ll.insertFirst("is");
        ll.insertFirst("love");
        System.out.println(ll);

        //get last item
        System.out.println(ll.getLast());

        //remove last item
        System.out.println(ll.removeLast());

        //get first item
        System.out.println(ll.getFirst());

        //remove first item
        System.out.println(ll.removeFirst());

        //add 3 items last
        ll.insertLast("baby");
        ll.insertLast("dont");
        ll.insertLast("heart");
        System.out.println(ll);

        //remove "What"
        ll.remove("What");
        System.out.println(ll);

        //print with for and iterator
        for (String s : ll) {
            System.out.print(s + " ");
        }
        System.out.println();

        //print with while and remove items from 2
        ListIterator<String> li = ll.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
            if (li.hasPrevious()) {
                li.remove();
            }
        }
        System.out.println();
        System.out.println(ll);

        ll.insertLast("no");
        ll.insertLast("more");

//print upside down
        li = ll.listIterator(ll.size());
        while (li.hasPrevious()) {
            System.out.print(li.previous() + " ");
            if (li.previousIndex() == 1) {
                li.add("ouho");
            }
        }
        System.out.println();
        System.out.println(ll);
    }
}

