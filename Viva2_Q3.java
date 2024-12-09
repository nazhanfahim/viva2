/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva2_q3;
import java.util.Scanner;

/**
 *
 * @author phuax
 */
public class Viva2_Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare and initialize variables
        Scanner s = new Scanner(System.in);
        int choice;
        int bookcount=0;
        boolean found = false;
        
        String [] bookname = new String[100];
        String[] bookauthor = new String[100];
        String bookname_tofind;        

        do{
        //asking for action
        System.out.print("""
                         Choose an action:
                         1. Add a book
                         2. View book details
                         3. View all books
                         4. Exit
                         """);
        System.out.println("Choice of action: ");
        choice = s.nextInt();   
        s.nextLine();
        
        
        switch(choice) {
            case 1:
                System.out.print("Enter book title: ");
                bookname[bookcount] = s.nextLine();
                System.out.print("Enter book author: ");
                bookauthor[bookcount] = s.nextLine();
                bookcount++;
                System.out.println("");
                break;
                
            case 2:
                System.out.print("Enter book title: ");
                bookname_tofind = s.nextLine() ;
                for (int i=0; i<bookcount; i++) {
                    if (bookname[i].equalsIgnoreCase(bookname_tofind)){
                        System.out.println("Book Details: " + bookname[i] + " by " + bookauthor[i]);
                        found  = true;
                        break;
                    }
                }
                if (found == false) {
                    System.out.println("Book not found.");
                }
                System.out.println("");
                break;
            
            case 3:
                for (int i=0; i<bookcount; i++) {
                    System.out.println(bookname[i] + " by " + bookauthor[i]);
                }
                System.out.println("");
                break;
                
            case 4:
                System.out.println("Program ending...");
                break;
                
        }

        } while (choice != 4);
    }
        
}
