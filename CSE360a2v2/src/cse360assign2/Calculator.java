
package cse360assign2;

/**
 * Student name : Hsin-Jung Lee
 * Class ID: 451
 * Assignment 2
 * Description: This program will calculator numbers.
 */

/**
 * class Calculator contains integer total and calculator numbers.
 */
public class Calculator {

    private int total;

    /**
     * class constructor
     */
    public Calculator() {
        total = 0;
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
     * add method add integer value
     *
     * @param value
     */
    public void add(int value) {
        total = total + value;
    }

    /**
     * subtract method subtract integer value
     *
     * @param value
     */
    public void subtract(int value) {
        total = total - value;
    }

    /**
     * multiply method multiply integer value
     *
     * @param value
     */
    public void multiply(int value) {
        total = total * value;
    }

    /**
     * divide method divide integer value
     *
     * @param value
     */
    public void divide(int value) {
        if (value == 0) {
            total = 0;
        } else {
            total = (int) (total / value);
        }
    }

    /**
     * getHistory method get history data
     *
     * @return String history
     */
    public String getHistory() {
        return "";
    }
}
