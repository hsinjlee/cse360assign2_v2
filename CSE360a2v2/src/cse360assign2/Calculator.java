package cse360assign2;

/**
 * Student name : Hsin-Jung Lee
 * Class ID: 451
 * Assignment 2
 * Description: This program will calculator numbers and print history.
 * https://github.com/hsinjlee/cse360assign2_v2.git
 */

/**
 * class Calculator contains a private integer total, a private StringBuffer
 * callHistory,and calculator numbers.
 */
public class Calculator {

    private int total;
    private StringBuffer calHistory = new StringBuffer();

    /**
     * class constructor
     */
    public Calculator() {
        total = 0;
        calHistory.append("0");
    }

    /**
     * getTotal method get total
     *
     * @return integer total
     */
    public int getTotal() {
        return total;
    }

    /**
     * add method add integer value and append " + " sign and value
     *
     * @param value
     */
    public void add(int value) {
        total = total + value;
        calHistory.append(" + " + value);
    }

    /**
     * subtract method subtract integer value and append " - " sign and value
     *
     * @param value
     */
    public void subtract(int value) {
        total = total - value;
        calHistory.append(" - " + value);
    }

    /**
     * multiply method multiply integer value and append " * " sign and value
     *
     * @param value
     */
    public void multiply(int value) {
        total = total * value;
        calHistory.append(" * " + value);
    }

    /**
     * divide method divide integer value and append " / " sign and value.
     * It only shows integer division
     * if value equals 0, total will be 0;
     *
     * @param value
     */
    public void divide(int value) {
        if (value == 0) {
            total = 0;
        } else {
            total = (total / value);
        }
        calHistory.append(" / " + value);
    }

    /**
     * getHistory method get history data
     *
     * @return String calHistory
     */
    public String getHistory() {
        return this.calHistory.toString();
    }
}
