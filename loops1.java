import java.util.Scanner;
public class loops1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        
        String[] names = new String[3];
        int[] grades = new int[3];

        for (int i = 0; i < 3; i++){
            System.out.println("Enter name of Student no. " + (i+1) + ": ");
            names[i] = sc.nextLine();
            System.out.println("Enter grade of Student no. " + (i+1) + ": ");
            grades[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < 3; i++){
            System.out.println("Name: " + names[i] + " " + "Grades: " + grades[i]);
        }

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum of all numbers until " + n + ": " + sum);

        int i = -1;
        sum = 0;
        while (i != 0){
            System.out.println("Enter a number to stop: ");
            i = sc.nextInt();
            sum += i;
        }
        System.out.println("Total sum: " + sum);

        int max = 0;
        int min = 0;
        char choice;
        do { 
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if (num > max){
                max = num;
            }else if (num < max){
                min = num;
            }
            System.out.println("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}