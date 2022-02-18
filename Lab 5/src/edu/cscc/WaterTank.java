package edu.cscc;

public class WaterTank {
    private int current;
    private int maxCapacity;

    public WaterTank (int current, int maxCapacity) {
        this.current = current;
        this.maxCapacity = maxCapacity;
        if (this.current > maxCapacity) {
            this.current = maxCapacity;
        }

    }

    //getters
    public int getCurrent() {
        return current;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    //add water
    public void add(int volume) {
        this.current = current + volume;
        if (this.current > maxCapacity) {
            this.current = maxCapacity;
        }
    }

    //drain water
    public void drain(int volume) {
        this.current = current - volume;
        if (this.current < 0) {
            this.current = 0;
        }
    }

    //print current volume of tank
    public void print() {
        System.out.println("The tank volume is " + current + " gallons");
    }



}
