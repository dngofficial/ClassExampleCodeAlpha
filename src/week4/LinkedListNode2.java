package week4;

public class LinkedListNode2<T> {
    public T value;
    public LinkedListNode2<T> next;

    public LinkedListNode2(T val, LinkedListNode2<T> next) {
        this.value = val;
        this.next = next;
    }


    public T getValue() {
        return this.value;
    }

    public void setNext(LinkedListNode2<T> node) {
        this.next = node;
    }

    public LinkedListNode2<T> getNext() {
        return this.next;
    }

    public int size() {
        if (this.next == null) {
            return 1;
        } else {
            return 1 + this.next.size();
        }
    }

    public String toString() {
        String out = "";
        out += this.value;
        if (this.next != null) {
            out += " " + this.next.toString();
        }
        return out;
    }

    public LinkedListNode2<T> find(T value) {
        if (this.value.equals(value)) {
            return this;
        } else if (this.next == null) {
            return null;
        } else {
            return this.next.find(value);
        }
    }

    public void append(T value) {
        if (this.next == null) {
            this.next = new LinkedListNode2<>(value, null);
        } else {
            this.next.append(value);
        }
    }

    public void insert(T value, int loc) {
        if (loc == 0) {
            this.next = new LinkedListNode2<>(this.value, this.next);
            this.value = value;
        } else {
            this.next.insert(value, loc - 1);
        }
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> first = new LinkedListNode<>(1, null);
        first = new LinkedListNode<>(2, first);
        first = new LinkedListNode<>(3, first);
        String out = first.toString();
        System.out.println(out);
        first.insert(4, 1);
        first.append(5);
        out = first.toString();
        System.out.println(out);
    }
}
