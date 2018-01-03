package com.pluralsight.calcengine;

public class Adder extends CalculateBase {
    //region Constructors
    public Adder(){}

    public Adder(double leftVal, double rightVal)
    {
        super(leftVal, rightVal);
    }
    //endregion

    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
