package com.earthchen.state.gumball;

/**
 * 糖果机
 */
public class GumballMachine {
    /**
     * 糖果售罄
     */
    final static int SOLD_OUT = 0;

    /**
     * 没有钱
     */
    final static int NO_QUARTER = 1;

    /**
     * 有钱
     */
    final static int HAS_QUARTER = 2;

    /**
     * 售出糖果
     */
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 当有钱投进来，执行该方法
     */
    public void insertQuarter() {
        // 如果已经投入过钱
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter");
        } else if (state == NO_QUARTER) { // 如果没有投入过钱，我们就接受当前投入的钱，病转换状态到有钱的状态
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        } else if (state == SOLD_OUT) { // 如果糖果已经售罄
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (state == SOLD) { // 如果用户刚刚才买了糖果
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    /**
     * 如果用户尝试退回投入的钱
     */
    public void ejectQuarter() {
        if (state == HAS_QUARTER) { // 如果有投入的钱，即退钱，并回到没有投入钱的状态
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) { // 如果没有投入的钱
            System.out.println("You haven't inserted a quarter");
        } else if (state == SOLD) {  // 如果用户已经购买了糖果
            System.out.println("Sorry, you already turned the crank");
        } else if (state == SOLD_OUT) { //如果糖果售罄
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        }
    }

    /**
     * 如果试着转动曲柄
     */
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball!");
        } else if (state == NO_QUARTER) {
            System.out.println("You turned but there's no quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned, but there are no gumballs");
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    /**
     * 发放糖果方法
     */
    public void dispense() {
        // 如果在正在售出状态，
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) { // 当数量为0，则糖果售罄，改变状态
                System.out.println("Oops, out of gumballs!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }


}
