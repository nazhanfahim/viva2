/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.viva2q4;
import java.util.*;
/**
 *
 * @author Dell
 */
public class Viva2q4 {

    public static void main(String[] args) {
        Scanner kb=new Scanner (System.in);
        System.out.print("Enter total number of ISBN 10 numbers: ");
        int size=kb.nextInt();
        String[] WOW=new String[size];
       
        for(int i=0;i<size;i++){
            System.out.print("Enter ISBN 10 number: ");
            WOW[i]=kb.next();
            
       }
        validateISBNList(WOW);
        
    }
    
    public static int isValidISBN(int num, int lastdigit){ //made sure to take a number as input instead of String
        int check=0;
        int position = 9;
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            check += position * digit; // (position * digit)
            num /= 10; // Remove the last digit
            position--; // Move to the next position
        }
        check=check%11;
        if(check==lastdigit){
            return 1; //returns result like truth table
        }
        else{
            return 0;
        }   
    }
    
    public static void validateISBNList(String[] num){ //question requires for an array of Strings to be passed thru
        boolean [] result=new boolean [num.length]; //question requires to store the result in a boolean array
        int hold;
        int lastdigit;
        char checking;
        for(int i=0;i<num.length;i++){
            String haha=num[i];
            if(haha.length()!=10){ //checks if number entered is 10 digits
                result[i]=false;
            }
            else{
                hold=0;
            checking=num[i].charAt(9);
            for(int j=0,count=8; j<=8;j++){ //changes String to Integer
                int a=Character.getNumericValue(num[i].charAt(j)); //cant use parseInt because a number ending with the digit X would be an invalid integer
                hold+=a*Math.pow(10,count);
                if(count>0)
                    count--;
                
            }
            if (checking=='X'){ //assigns number 10 to the last digit
            lastdigit=10;
        }
        else {
            lastdigit=checking-'0';  //changes char checking into int lastdigit
        }
            
            if(isValidISBN(hold,lastdigit)==1){
                result[i]=true; //assign the results into a boolean array
            }
            else{
                result[i]=false;
            }
            }
            }
                System.out.print("Result: "); //prints out the boolean array
               for(int i=0;i<num.length;i++){
                   System.out.print(result[i]+" ");
               } 
        }
        
    }

