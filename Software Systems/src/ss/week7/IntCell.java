package ss.week7;

public class IntCell {
    private int contents = 0;

    public void add(int amount) {
        contents = contents + amount;
    }
    public int get() {
        return contents;
    }

    public static void main(String[] args) {
        IntCell cell = new IntCell();
        Adder a1 = new Adder(cell, 1);
        Adder a2 = new Adder(cell, 2);
        a1.start();
        a2.start();
        try {
            a1.join();
            a2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(cell.get());
    }
}

class Adder extends Thread {
    private IntCell cell;
    private int amount;

    public Adder(IntCell cellArg, int amountArg) {
        this.cell = cellArg;
        this.amount = amountArg;
    }
    public synchronized void run() {
        cell.add(amount);
    }
}
/*
 * 7.20.1) 1 in the case that old amount is taken while thread-1 is ahead.
 * 		   2 in the case that old amount is taken while thread-0 is ahead.
 * 		   3 in the case new amount is taken when second calculation starts.
 * 7.20.2) start makes thread, run just runs the codeblock. So with run it will
 * 		   executed sequentially.
 * 7.20.3) We don't wait for the threads to finish so the amount becomes even
 * 		   more unreliable as the threads could still be calculating when the
 * 		   result is printed. Result could be 0, 1, 2, 3.
 * 7.20.4) the threads won't overlap so the result will always be 3.
 * 
 */

