import java.util.Scanner;
public class Control2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("Positive number");
        }else if (num < 0){
            System.out.println("Negative number");
        }else{
            System.out.println("Number is zero");
        }

        double balance = 2500;
        int choice;
        System.out.println("Create PIN number: ");
        long newpin = sc.nextLong();
        System.out.println("Enter PIN: ");
        long pin = sc.nextLong();
        if (pin == newpin){
            System.out.println("Enter choice:");
        System.out.println("1.) Check balance");
        System.out.println("2.) Deposit");
        System.out.println("3.) Withdraw");
        System.out.println("4.) Exit");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Your balance is: " + balance);
                break;
            case 2:
                System.out.println("Enter amount: ");
                double amountd = sc.nextDouble();
                balance += amountd;
                System.out.println("New balance: " + balance);
                break;
            case 3:
                System.out.println("Enter amount: ");
                double amountw = sc.nextDouble();
                if (amountw <= balance){
                    balance -= amountw;
                    System.out.println("Withdrawn amount: " + amountw);
                    System.out.println("New balance: " + balance);
                    break;
                }else{
                    System.out.println("Amount greater than balance.");
                    System.out.println("Current balance: " + balance);
                    break;
                }
            case 4:
                System.out.println("Thank you for using ATM.");
                break;
            default:
                System.out.println("Invalid choice");
        }
        }else{
            System.out.println("Invalid PIN");
        }
    }
}