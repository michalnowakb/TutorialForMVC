package com.sparta.mjn.controller;

import com.sparta.mjn.model.Calculator;
import com.sparta.mjn.view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorView theView;
    private Calculator theModel;

    public CalculatorController(CalculatorView theView, Calculator theModel){
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalculateListner());
    }

    class CalculateListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;

            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addTwoNumbers(firstNumber,secondNumber);

                theView.setCalcSolution(theModel.getCalculationValue());
            }
            catch(NumberFormatException ex){
                theView.displayErrorMessage("You need to Enter 2 Integers");
            }
        }
    }
}
