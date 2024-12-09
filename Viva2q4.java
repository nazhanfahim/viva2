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
        String[] WOW=new String[3];
       
        for(int i=0;i<3;i++){
            System.out.print("Enter ISBN 10 number: ");
            WOW[i]=kb.next();
        }
        
        validateISBNList(WOW);
        
    }
    
    public static void isValidISBN(int num, int lastdigit){
        int check=0;
        for(int i=0;i<9;i++){
            for(int j=8;j>=1;j--)
            check+=((num/(Math.pow(10,j)))-((num/(Math.pow(10,j+1)))*10))*(i+1);
            
        }
        System.out.println(check);
    }
    
    public static void validateISBNList(String[] num){
        int hold=0;
        int lastdigit;
        char checking;
        for(int i=0;i<num.length;i++){
             checking=num[i].charAt(9);
            hold=0;
            for(int j=0,count=9; j<=8;j++){
                int a=Character.getNumericValue(num[i].charAt(j));
                hold+=a*Math.pow(10,count);
                if(count>0)
                    count--;
                
            }
            System.out.println(hold);
            if (checking=='X'){
            lastdigit=10;
        }
        else {
            lastdigit=checking-0;
        }
            isValidISBN(hold,lastdigit);
                
                
            
            
            
         
            
        }
        
    }
}

