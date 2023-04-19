package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {



    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void addInValuesToNumbers(int in) {
        if (!isNumbersClear() && in > peekaboo())
            totalRejected++;
        else
            super.addInValuesToNumbers(in);
    }
}
