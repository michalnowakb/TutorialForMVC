package com.sparta.mjn.model;

public class Calculator {

    private int calculationValue;

    public void addTwoNumbers(int firstNumber,int secondNUmber){

        calculationValue = firstNumber + secondNUmber;
    }

    public int getCalculationValue(){

        return calculationValue;
    }
}
