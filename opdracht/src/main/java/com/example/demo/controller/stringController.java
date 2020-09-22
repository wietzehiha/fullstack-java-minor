package com.example.demo.controller;

/*
    A controller to do stuff with the given input.
 */
public class stringController {

    /*
        Check what the length is of the given input.
     */
    public static int checkCaracters(String input) {
        return input.length();
    }

    /*
       A static function to reverse the given input.
     */
    public static String reverse(String input) {
        if (input == null) {
            return input;
        }
        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }

        return output;
    }

}
