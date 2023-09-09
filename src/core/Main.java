package core;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String name, city;
        int accno, amt;

        ArrayList<Account> list = new ArrayList<>();


        list.add(new Account("Amol", "NSK", 500000));
        list.add(new Account("govind", "agra", 2000));
        list.add(new Account("jatin", "noida", 4000));

        System.out.println("select operations");
        System.out.println("1. open account");
        System.out.println("2. deposit");
        System.out.println("3. withdraw");
        System.out.println("4. balance enquiry");
        System.out.println("5. list all");
        System.out.println("6. exit");

        boolean found;

        int choice;

        do {
            System.out.println("enter choice here : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Account Opening");

                    System.out.println("enter Name");
                    name = sc.next();

                    System.out.println("Enter City");
                    city = sc.next();

                    System.out.println("Enter Amount");

                    amt = sc.nextInt();

                    Account acc = new Account(name, city, amt);

                    System.out.println("account Opened");

                    break;


                case 2:
                    System.out.println("Deposit");

                    found = false;

                    System.out.println("enter Account No : ");

                    accno = sc.nextInt();


                    for (Account ac : list) {
                        if (accno == ac.getAccno()) {

                            found = true;

                            System.out.println("Customer Name  :" + ac.getName());
                            System.out.println("City  :" + ac.getCity());

                            System.out.println("Account Balance : " + ac.getBal());


                            System.out.println("\n enter Amount to deposit ");

                            amt = sc.nextInt();

                            ac.setBal(ac.getBal() + amt);

                            System.out.println("deposit Succesful ");


                            break;


                        }
                    }

                    if (!found) {
                        System.out.println("Invalid Account Number");
                    }
                    break;

                case 3:


                    System.out.println("Withdraw");


                    found = false;

                    System.out.println("enter Account Number");
                    accno = sc.nextInt();


                    for (Account ac : list) {

                        if (accno == ac.getAccno()) {

                            System.out.println("Customer Name: " + ac.getName());
                            System.out.println("City: " + ac.getCity());
                            System.out.println("Account Balance: " + ac.getBal());

                            System.out.println("\n Enter Amount to Withdraw");

                            amt = sc.nextInt();

                            if (amt <= ac.getBal()) {

                                ac.setBal(ac.getBal() - amt);

                                System.out.println("Withdraw Succesfull");


                            } else {
                                System.out.println("Insuffient Balance");


                            }

                            break;

                        }


                    }

                    if (!found) {
                        System.out.println("Invalid Account number  ");

                    }
                    break;

                case 4:

                    System.out.println("Balance enquiry");

                    found = false;

                    System.out.println("Enter Account Number");

                    accno = sc.nextInt();

                    for (Account ac : list) {

                        if (accno == ac.getAccno()) {
                            found = true;
                            System.out.println("Customer Name: " + ac.getName());
                            System.out.println("City: " + ac.getCity());
                            System.out.println("Account Balance: " + ac.getBal());
                            break;
                        }


                    }
                    if (!found) {
                        System.out.println("Invalid Account Number");
                    }

                    break;
                case 5:

                    System.out.println("List of Account");

                    for (Account ac : list) {
                        System.out.println(ac);
                    }
                    break;
                case 6:

                    System.out.println("Thank For Visit");

                    break;
                default:
                    System.out.println("Invalid Choice");

            }


        }

        while (choice != 6);
        {

        }


    }
}
