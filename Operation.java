package com.rbi.operation;

import java.util.Scanner;
//import java.util.Set;

import com.rbi.model.Account;
import java.util.ArrayList;
import java.util.List;

public class Operation {
    static List<Account> cust_List = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void CreateAccount() {
        for (int i = 1; i <= 2; i++) {
            Account ac = new Account();
            System.out.println("Enter bankName");
            ac.setBankName(sc.next());
            
            System.out.println("Enter Customer Id");
            ac.setCustomerId(sc.next());

            System.out.println("Enter AccountNo");
            ac.setAccountNo(sc.next());

            System.out.println("Enter customerName");
            sc.nextLine(); // Consume newline left-over
            ac.setCustomerName(sc.nextLine());

            System.out.println("Enter IFSCCode");
            ac.setIFSCCode(sc.nextLine());

            System.out.println("Enter accountType");
            ac.setAccountType(sc.nextLine());
            System.out.println("Enter balance");
            ac.setBalance(sc.nextDouble());
            System.out.println("Do you want to make a transaction? (1: Deposit, 2: Withdraw, 3: No)");
            int choice = sc.nextInt();
            if (choice == 1) {
                while (true) {
                    System.out.println("Enter Deposit Amount");
                    double balance = sc.nextDouble();
                    if (balance >= 500) {
                        ac.deposit(balance);
                        break;
                    } else {
                        System.out.println("INITIAL AMOUNT MUST BE 500 OR GREATER THAN 500");
                    }
                }
            } else if (choice == 2) {
                System.out.println("Enter Withdraw Amount");
                double withdrawAmount = sc.nextDouble();
                if (ac.withdraw(withdrawAmount)) {
                    System.out.println("Withdrawal successful");
                } else {
                    System.out.println("Withdrawal failed, insufficient balance");
                }
            } else {
                System.out.println("No transaction made.");
            }
            
            
            System.out.println("Do you want to make a transaction? yes?(1.Deposit,2.Withdraw,3.No)");
            int choice1= sc.nextInt();
            if (choice == 1) {
                while (true) {
                    System.out.println("Enter Deposit Amount");
                    double balance = sc.nextDouble();
                    if (balance >= 500) {
                        ac.deposit(balance);
                        break;
                    } else {
                        System.out.println("INITIAL AMOUNT MUST BE 500 OR GREATER THAN 500");
                    }
                }
            } else if (choice == 2) {
                System.out.println("Enter Withdraw Amount");
                double withdrawAmount = sc.nextDouble();
                if (ac.withdraw(withdrawAmount)) {
                    System.out.println("Withdrawal successful");
                } else {
                    System.out.println("Withdrawal failed, insufficient balance");
                }
            } else {
                System.out.println("No transaction made.");
            }
          //  System.out.println("Enter balance");
            //ac.setBalance(sc.nextDouble());
           
            /*System.out.println("Enter Withdraw Amount");
           double withdrawAmount = sc.nextDouble();
           if (ac.withdraw(withdrawAmount)) {
               System.out.println("Withdrawal successful");
           } else {
               System.out.println("Withdrawal failed,insufficient balance");
           }*/

           cust_List.add(ac); 
           System.out.println("Total Balance: " + ac.getBalance());
       
            System.out.println("Enter mobileNo");
            ac.setMobileNo(sc.nextLine());
            sc.nextLine();
            System.out.println("Enter adharNo");
            ac.setAdharNo(sc.nextLine());

            System.out.println("Enter PanCard");
            ac.setPanCard(sc.nextLine());
            
            System.out.println("Enter address");
            //sc.nextLine(); 
            ac.setAddress(sc.nextLine());

            System.out.println("Enter pinCode");
            ac.setPinCode(sc.nextLine());
           
           //System.out.println("Do you want to make a transaction? (1: Deposit, 2: Withdraw, 3: No)");
          //  int choice = sc.nextInt();
            
          
            // Print the total balance after creating each account
            System.out.println("Total Balance: " + ac.getBalance());
        }
    }

            
        /*  System.out.println("Enter deposite");
          ac.setDeposite(sc.nextDouble());*/
   //     System.out.println("Enter withdraw");
           //ac.setWithdraw(sc.nextDouble());
            /*System.out.println("Enter Transaction");
           ac.setTransaction(sc.next());*/

          /*  while (true) {
            	 ac.setDeposite(sc.nextDouble());
       System.out.println("Enter Deposit Amount");
                double balance = sc.nextDouble();
                if (balance >= 500) {
                    ac.deposit(balance);
                    break;
                } else {
                    System.out.println("INITIAL AMOUNT MUST BE 500 OR GREATER THAN 500");
                }
            }
             System.out.println("Enter Withdraw Amount");
            double withdrawAmount = sc.nextDouble();
            if (ac.withdraw(withdrawAmount)) {
                System.out.println("Withdrawal successful");
            } else {
                System.out.println("Withdrawal failed,insufficient balance");
            }

            cust_List.add(ac); 
            System.out.println("Total Balance: " + ac.getBalance());*/
        

    public void showAccountDetails() {
        System.out.println("ACCOUNT DETAILS");

        System.out.println("Enter your customer Id");
        String cid = sc.next();
        boolean found = false;
       /* public void transaction() {
        	
            System.out.println("Enter senders Customer Id");
            String senderId = sc.next();
            Account sender = customerId(senderId);
     if(sender==null) {
                System.out.println("Senders account not found");
                return;
            }
          System.out.println("Enter receiver's Id");
            String receiverId = sc.next();
            Account receiver = customerId(receiverId);

            if (receiver == null) {
                System.out.println("Receiver's account not found");
                return;
            }

            System.out.println("Enter amount to transfer");
            double amount = sc.nextDouble();

            if (sender.withdraw(amount)) {
                receiver.deposit(amount);
                System.out.println("Transaction successful");
            } else {
                System.out.println("Transaction failed, insufficient funds");
            }
        }private Account customerId(String customerId) {
            for (Account ac : cust_List) {
                if (customerId.equals(ac.getCustomerId())) {
                    return ac;
                }
            }
            return null;
        } */
        for (Account ac : cust_List) {
            if (cid.equals(ac.getCustomerId())) {
                found = true;
                System.out.println("Customer Name: " + ac.getCustomerName());
                System.out.println("Account number: " + ac.getAccountNo());
                System.out.println("IFSC code: " + ac.getIFSCCode());
                System.out.println("Account Type: " + ac.getAccountType());
                System.out.println("Deposite: " + ac.getDeposite());
                System.out.println("Transaction: " + ac.getTransaction());
                System.out.println("Withdraw: " + ac.getWithdraw());
                System.out.println("Balance: " + ac.getBalance());
                System.out.println("Aadhar number: " + ac.getAdharNo());
                System.out.println("Pan Card: " + ac.getPanCard());
                System.out.println("Address: " + ac.getAddress());
                System.out.println("Pin code: " + ac.getPinCode());
                System.out.println("Mobile number: " + ac.getMobileNo());
                break;
            }
        }
        if (!found) {
            System.out.println("Customer Id does not exist");
        }
    }
   public void transaction() {
	   System.out.println("Enter senders Customer Id");
        String senderId = sc.next();
        Account sender = customerId(senderId);
 if(sender==null) {
            System.out.println("Senders account not found");
            return;
        }
      System.out.println("Enter receiver's Id");
        String receiverId = sc.next();
        Account receiver = customerId(receiverId);

        if (receiver == null) {
            System.out.println("Receiver's account not found");
            return;
        }

        System.out.println("Enter amount to transfer");
        double amount = sc.nextDouble();

        if (sender.withdraw(amount)) {
            receiver.deposit(amount);
            System.out.println("Transaction successful");
        } else {
            System.out.println("Transaction failed, insufficient funds");
        }
    }private Account customerId(String customerId) {
        for (Account ac : cust_List) {
            if (customerId.equals(ac.getCustomerId())) {
                return ac;
            }
        }
        return null;
    }///System.out.println("Total Balance: " + ac.getBalance());

    public static void main(String[] args) {
        Operation op = new Operation();
        op.CreateAccount();
        op.showAccountDetails();
        op.transaction();
    }
}
