import java.util.TreeSet;

public class LinearProbingHashMap<Key, Value> {

    private final int capacity;
    private int size;
    //инициируем объекты удаленных ключа и значения
    private final Key DELETED_KEY = (Key) Integer.valueOf(Integer.MIN_VALUE);//(Key) new Object();
    private final Value DELETED_VALUE = (Value) "DELETED";//(Value) new Object();

    private final Key[] keys;
    private final Value[] values;

    private TreeSet<String> set = new TreeSet<>();

    LinearProbingHashMap(int capacity) {
        this.capacity = capacity;
        size = 0;
        keys = (Key[]) new Object[capacity];
        values = (Value[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    private void isKeyNotNull(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Key null");
        }
    }

    void put(Key key, Value value) {
        isKeyNotNull(key);
        if (size == capacity - 1) {
            throw new ArrayIndexOutOfBoundsException("size == capacity -1");
        }
        int h = hash(key);


        set.add("" + h + ":" + key + "(" + value + ")");


        if(isEmpty()){
            keys[h] = key;
            values[h] = value;
            size++;
            return;
        }

        int index = -1;
        int n = 0;
        int i;
        for (i = h; keys[i] != null; i = (i + 1) % capacity) {
            if(n >= keys.length){
                return;
            }

            if (keys[i].equals(key)) {
                values[i] = value;
                return;
            }

            if(keys[i].equals(DELETED_KEY) && index == -1){
                index = i;
            }
            n++;
        }

        if(index == -1){
            keys[i] = key;
            values[i] = value;
        } else{
            keys[index] = key;
            values[index] = value;
        }
        size++;
    }

    public Value get(Key key) {
        isKeyNotNull(key);
        int n = 0;//дополнительный счетчик, чтобы выйти, если проверили весь массив
        for (int i = hash(key); keys[i] != null; i = (i + 1) % capacity) {
            if(n >= keys.length){
                break;
            }
            if (keys[i].equals(key)) {
                return values[i];
            }
            n++;
        }
        return null;
    }

    Value delete(Key key){
        isKeyNotNull(key);
        if(isEmpty()){
            return null;
        }
        int n =0;
        int h = hash(key);
        for (int i = h; keys[i] != null; i = (i + 1) % capacity){
            if(n >= keys.length){
                break;
            }
            if(keys[i].equals(key)){
                Value tempValue = values[i];
                keys[i] = DELETED_KEY;
                values[i] = DELETED_VALUE;
                size--;
                return tempValue;
            }
            n++;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("***LinearProbingHashMap***\n");
        sb.append("[");
        for (int i = 0; i < capacity; i++) {
            sb.append(keys[i]).append("(").append(values[i]).append(")");
            if(i != keys.length - 1){
                sb.append(", ");
            }
        }
        sb.append("]\n");
        return sb.toString();
    }

    TreeSet<String> getSet() {
        return set;
    }
}
