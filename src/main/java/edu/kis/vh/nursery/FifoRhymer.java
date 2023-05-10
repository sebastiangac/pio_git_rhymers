package edu.kis.vh.nursery;

public class FifoRhymer extends defaultCountingOutRhymer {

    public final defaultCountingOutRhymer temp = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!isNumbersClear())
            temp.addInValuesToNumbers(super.countOut());

        int ret = temp.countOut();

        while (!temp.isNumbersClear())
            addInValuesToNumbers(temp.countOut());

        return ret;
    }
}
