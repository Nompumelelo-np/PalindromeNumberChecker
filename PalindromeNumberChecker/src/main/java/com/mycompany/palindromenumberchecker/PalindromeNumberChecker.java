/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromenumberchecker;

import java.util.Scanner;

/**
 *
 * @author Acer-User
 */
public class PalindromeNumberChecker {
    static int reverseNumber(int num)
    {
        int reversedNum = 0;
        while (num > 0) {
            reversedNum = reversedNum* 10 + num % 10;
            num = num / 10;
        }
        return reversedNum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = input.nextInt();
        int reverseN = reverseNumber(n);
        System.out.println("Reverse of n = " + reverseN);
        if (n == reverseN)
        {
          System.out.println("Number is a Palindrome");
        }
        else
        {
           System.out.println("Number is not a Palindrome");
        }
        
        
    }
}
