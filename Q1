/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingsystem;
import java.util.*;

/**
 *
 * @author User
 */
public class BankingSystem {
    
    private double balance;
    private ArrayList<String> transactions;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner=new Scanner(System.in);
        BankingSystem bank=new BankingSystem();
        
        while(true){
            System.out.print("Welcome to the Bank!\n"
                    + "1. Check Balance\n"
                    + "2. Deposit Money\n"
                    + "3. Withdraw Money\n"
                    + "4. View Transaction History\n"
                    + "5. Exit\n"
                    + "Choose an option:");
               int option=scanner.nextInt();
               
               switch(option){
                   
            case 1:
                bank.checkBalance();
                System.out.println();
                break;
                
            case 2: 
                System.out.print("Enter amount to deposit: RM");
                double depositAmount=scanner.nextDouble();
                bank.deposit(depositAmount);
                bank.checkBalance();
                System.out.println();
                break;
                
            case 3: 
                System.out.print("Enter withdrawal amount: RM");
                double withdrawal=scanner.nextDouble();
                bank.withdraw(withdrawal);
                bank.checkBalance();
                System.out.println();
                break;
                
            case 4: 
                bank.printTransactions();
                System.out.println();
                break; 
                
            case 5: 
                System.out.println("Thank you for using our banking system! ");
                System.out.printf("Your final balance is: RM%.2f\n",bank.balance);
               
                return;
                
            default:
                System.out.println("Invalid choice! Please try again.");
                System.out.println();
                
        }
        }
        
        
        
        
        
    }
    
    
    //Constructor 
    public BankingSystem(){
        balance=0.0;
        transactions=new ArrayList<>();
    }
    
    //Method to check balance 
    public void checkBalance(){
        System.out.printf("Current Balance: RM%.2f\n ",balance);
    }
    
    //Method to deposit money
    public void deposit(double amount){
        balance +=amount;
        transactions.add ("Deposited: RM "+amount);
        System.out.printf("Deposited: RM%.2f\n",amount);
    }
    
    // Method to withdraw money
    public void withdraw(double amount){
        if(amount<=balance){
        balance-=amount;
        transactions.add("Withdrew: RM"+amount);
        System.out.printf("Withdrew: RM%.2f\n",amount);
        }
        else {
            System.out.println("Insufficient amounts!");
        }
       
    }
    
    //Method to print transaction history
    public void printTransactions(){
        if (transactions.size()==0){
            System.out.println("No transactions yet.");
        
    }
        else{
            System.out.println("Transaction history:");
            for(int i=0;i<transactions.size();i++){
                String transaction=transactions.get(i); //fetches the transaction at index[i] and assign to a variable string transaction
                System.out.println(transaction);
                
            }
        }
    }
    
    
}
