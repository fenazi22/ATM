import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int balance = 10000;
        int n = 0;
        String name = "Faisal";
        String s = "";

        while (true) {

            System.out.println("=====================================");
            System.out.println("========    FAISAL ATM    ===========");
            System.out.println("=====================================");

            System.out.println(" > Enter ( w or W ) to  withdraw: ");
            System.out.println(" > Enter ( d or D ) to  deposit: ");
            System.out.println(" > Enter ( t or T ) to  transfer: ");
            System.out.println(" > Enter ( p or P ) to  printInfo: ");
            System.out.println(" > Enter ( e or E ) to  EXIT: ");
            //   System.out.println(" > Enter ( w or W ) to  withdraw: ");
            System.out.println("\n");
            System.out.print("\n\t> Enter your choice : ");
            s = input.next();
            if (s.equalsIgnoreCase("w")) {
                System.out.print("Enter amount  of money  to withdraw (up to 5K): ");
                n = input.nextInt();
                if (n > 5000 || n < 0 || n > balance) {
                    System.out.println("your withdraw more than 5000 or Insufficient balance !");
                } else {
                    balance -= n;
                    System.out.println("\n your withdraw " + n + " and your balance new :" + balance+"\n");
                }
            } else if (s.equalsIgnoreCase("d")) {
                System.out.print("Enter the deposit amount (up to 10k):");
                n= input.nextInt();
                if (n > 10000 ){
                    System.out.println("Your deposit up 10K ");
                }else {
                    balance+=n;
                    System.out.println("your deposit: "+n+" and your balance new is: "+balance);
                }
            } else if (s.equalsIgnoreCase("t")) {
                System.out.print("Enter transfer name: ");
                String nameT=input.next();
                System.out.print("Enter transfer Account: ");
                String Account=input.next();
                if (Account.length() < 10||Account.length()>10){
                    System.out.println("Must be Account 10 digit");
                }else{
                    System.out.print("Enter the transfer amount:");
                    n= input.nextInt();
                    balance-=n;
                    System.out.println("your transfer to "+nameT+" "+n);
                }

            } else if (s.equalsIgnoreCase("p")) {
                System.out.println(""+name+" your Balance : "+balance);

            } else if (s.equalsIgnoreCase("e")) {
                System.exit(0);
            } else {
                System.out.println("your input Wring! ");
            }


        }


    }

}