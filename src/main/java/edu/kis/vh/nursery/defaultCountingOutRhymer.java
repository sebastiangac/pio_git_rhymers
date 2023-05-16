package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int EMPTY = -1;

    public static final int ERRORCODE = -1;
    public static final int MAX = SIZE - 1;
    private final int[] numbers = new int[SIZE];

    private int total = -1;

    public void addInValuesToNumbers(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isNumbersClear() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX;
    }

    protected int peekaboo() {
        if (isNumbersClear())
            return ERRORCODE;
        return numbers[total];
    }

    public int countOut() {
        if (isNumbersClear())
            return ERRORCODE;
        return numbers[total--];
    }

}
