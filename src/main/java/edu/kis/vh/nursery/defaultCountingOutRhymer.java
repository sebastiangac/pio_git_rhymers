package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static int NUM1 = 1;
    public static int NUM2 = 12;
    private int[] NUMBERS = new int[NUM2];

    public int total = -NUM1;

    public void addInValuesToNumbers(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean isNumbersClear() {
        return total == -NUM1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (isNumbersClear())
            return -NUM1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (isNumbersClear())
            return -NUM1;
        return NUMBERS[total--];
    }

}
