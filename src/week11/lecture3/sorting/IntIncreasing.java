package week11.lecture3.sorting;

public class IntIncreasing implements Comparator<Integer> {

    @Override
    public boolean compare(Integer a, Integer b) {
        return a < b;
    }
}
