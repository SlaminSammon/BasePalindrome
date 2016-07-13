/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package google;
import java.util.Scanner;
/**
 *
 * @author Chuck
 */
public class Google {

    /**
     * @param args the command line arguments
     */
    /*To help Beta Rabbit crack the lock, 
      write a function answer(n) which returns the smallest positive integer base b, 
      at least 2, in which the integer n is a palindrome. 
      The input n will satisfy "0 <= n <= 1000."
      */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This program takes every value from 0 and 1000\n"
                + "and finds the lowest base where it is a palindrome.\n"
                +"Number:Lowest Base:Palindrome Value");
        pressEnterToContinue();
        int base = 2;
        for(int j = 0; j < 1000; ++j){
        String number = Integer.toString(j);
        String palindrome = "";
        for(int i = 2; i <=10; ++i){
            palindrome = baseConverter(number, i);
            base = i;
            if(isPalindrome(palindrome)) break;
        }
        System.out.println(j + ":" + base+ ":" + palindrome);
        base = 2;
        }
    }
    public static String baseConverter(String number, int newBase){
        //Converts number to any base n.
        return Integer.toString(Integer.parseInt(number, 10), newBase);
    }
    public static boolean isPalindrome(String number){
        //Checks if it's a palindrome.
        if(number.equals(new StringBuffer().append(number).reverse().toString())) return true;
        else return false;
    }
    public static void pressEnterToContinue()
 { 
        System.out.println("Press enter to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
 }
}

