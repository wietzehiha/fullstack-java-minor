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

    public static int countWords(String input) {
        int wordCount = 0;

        if(input == null) {
            return wordCount;
        }

        //remove leading and trailing white spaces first
        input = input.trim();

        //if string contained all the spaces, word count is 0
        if(input.equals("")) {
            return wordCount;
        }

        wordCount = 1;

        for(int i = 0; i < input.length(); i++){

            //if character is a space, increase the word count
            if( input.charAt(i) == ' ' ){
                wordCount++;
            }
        }

        return wordCount;
    }

}
