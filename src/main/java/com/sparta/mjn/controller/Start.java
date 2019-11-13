package com.sparta.mjn.controller;

import com.sparta.mjn.model.Calculator;
import com.sparta.mjn.view.CalculatorView;

/**
 * Hello world!
 *
 */
public class Start
{
    public static void main( String[] args )
    {
        CalculatorView theView = new CalculatorView();
        Calculator theModel = new Calculator();
        CalculatorController theController = new CalculatorController(theView,theModel);

        theView.setVisible(true);

    }
}
