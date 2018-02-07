package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int addition = 7;
        int substraction = 3;

        if(calculator.add(4,3) == addition){
            System.out.println("addition test OK");
        } else {
            System.out.println("addition test failed!");
        }

        if(calculator.substract(7,4) == substraction){
            System.out.println("substraction test OK");
        } else {
          System.out.println("substraction test failed!");
        }
    }
}
