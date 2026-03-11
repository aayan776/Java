import java.util.Scanner;
class Bmi_calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight (in kg): ");
        float weight = sc.nextFloat();
        System.out.println("Enter your height (in meters): ");
        float height = sc.nextFloat();
        float bmi = weight / (height * height);
        System.out.println("Your bmi is: " + bmi);
        if (bmi < 18.5){
            System.out.println("You are Underweight.");
        }else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("You are Healthy");
        }else if (bmi >= 25 && bmi <= 29.9){
            System.out.println("You are Slightly Overwight");
        }else if (bmi >= 30 && bmi <= 34.9){
            System.out.println("You are Overwight");
        }else if (bmi >= 35 && bmi <= 39.9){
            System.out.println("You are Very Fat");
        }else{
            System.out.println("You should invest in a gym");
        }
    }
}