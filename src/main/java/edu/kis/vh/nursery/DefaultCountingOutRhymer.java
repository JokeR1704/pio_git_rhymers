package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int DEFAULT_TOTAL = -1;
    public static final int SIZE_OF_NUMBERS = 12;
    public static final int LAST_ELEMENT = 11;
    private int[] numbers = new int[SIZE_OF_NUMBERS];

    public int total = DEFAULT_TOTAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_TOTAL;
    }

    public boolean isFull() {
        return total == LAST_ELEMENT;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_TOTAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_TOTAL;
        return numbers[total--];
    }

}
