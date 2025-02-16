package com.rbi.operation;

import java.util.Scanner;
import com.rbi.model.Account;
import java.util.ArrayList;
import java.util.List;

public class Operation {
    static List<Account> cust_List = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void CreateAccount() {
        for (int i = 1; i <= 2; i++) {
            Account ac = new Account();
            System.out.println("Enter bankName:");
            ac.setBankName(sc.next());

            System.out.println("Enter Customer Id:");
            ac.setCustomerId(sc.next());

            System.out.println("Enter Account No:");
            ac.setAccountNo(sc.next());

            System.out.println("Enter Customer Name:");
            sc.nextLine(); // Consume newline
            ac.setCustomerName(sc.nextLine());

            System.out.println("Enter IFSC Code:");
            ac.setIFSCCode(sc.nextLine());

            System.out.println("Enter Account Type:");
            ac.setAccountType(sc.nextLine());

            System.out.println("Enter initial deposit amount (Minimum 500):");
            double balance;
            while (true) {
                balance = sc.nextDouble();
                if (balance >= 500) {
                    ac.setBalance(balance);
                    break;
                } else {
                    System.out.println("INITIAL AMOUNT MUST BE 500 OR GREATER THAN 500. Try again:");
                }
            }

            cust_List.add(ac);

            System.out.println("Do you want to make a transaction? (1: Deposit, 2: Withdraw, 3: No)");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter Deposit Amount:");
                double depositAmount = sc.nextDouble();
                ac.deposit(depositAmount);
            } else if (choice == 2) {
                System.out.println("Enter Withdraw Amount:");
                double withdrawAmount = sc.nextDouble();
                if (ac.withdraw(withdrawAmount)) {
                    System.out.println("Withdrawal successful");
                } else {
                    System.out.println("Withdrawal failed, insufficient balance");
                }
            }

            System.out.println("Enter Mobile No:");
            ac.setMobileNo(sc.next());

            System.out.println("Enter Aadhaar No:");
            ac.setAdharNo(sc.next());

            System.out.println("Enter PAN Card:");
            ac.setPanCard(sc.next());

            System.out.println("Enter Address:");
            sc.nextLine(); // Consume newline
            ac.setAddress(sc.nextLine());

            System.out.println("Enter Pin Code:");
            ac.setPinCode(sc.next());

            System.out.println("Total Balance: " + ac.getBalance());
        }
    }

    public void showAccountDetails() {
        System.out.println("ACCOUNT DETAILS");

        System.out.println("Enter your Customer Id:");
        String cid = sc.next();
        boolean found = false;

        for (Account ac : cust_List) {
            if (cid.equals(ac.getCustomerId())) {
                found = true;
                System.out.println("Customer Name: " + ac.getCustomerName());
                System.out.println("Account Number: " + ac.getAccountNo());
                System.out.println("IFSC Code: " + ac.getIFSCCode());
                System.out.println("Account Type: " + ac.getAccountType());
                System.out.println("Balance: " + ac.getBalance());
                System.out.println("Aadhaar Number: " + ac.getAdharNo());
                System.out.println("PAN Card: " + ac.getPanCard());
                System.out.println("Address: " + ac.getAddress());
                System.out.println("Pin Code: " + ac.getPinCode());
                System.out.println("Mobile Number: " + ac.getMobileNo());
                break;
            }
        }
        if (!found) {
            System.out.println("Customer Id does not exist");
        }
    }

    public void transaction() {
        System.out.println("Enter Sender's Customer Id:");
        String senderId = sc.next();
        Account sender = getAccountByCustomerId(senderId);

        if (sender == null) {
            System.out.println("Sender's account not found");
            return;
        }

        System.out.println("Enter Receiver's Customer Id:");
        String receiverId = sc.next();
        Account receiver = getAccountByCustomerId(receiverId);

        if (receiver == null) {
            System.out.println("Receiver's account not found");
            return;
        }

        System.out.println("Enter amount to transfer:");
        double amount = sc.nextDouble();

        if (sender.withdraw(amount)) {
            receiver.deposit(amount);
            System.out.println("Transaction successful");
        } else {
            System.out.println("Transaction failed, insufficient funds");
        }
    }

    private Account getAccountByCustomerId(String customerId) {
        for (Account ac : cust_List) {
            if (customerId.equals(ac.getCustomerId())) {
                return ac;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Operation op = new Operation();
        op.CreateAccount();
        op.showAccountDetails();
        op.transaction();
    }
}
