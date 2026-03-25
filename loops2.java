import java.util.Scanner;
class loops2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("Enter amount of test cases: ");
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++){
            System.out.println("Enter number " + i + ": ");
            int n = sc.nextInt();
            int count = 0;
            for (int div = 2; div* div <= n; div++){
                if (n % div == 0){
                    System.out.println(div);
                    count++;
                    break;
                }
            }
            if (n <= 1){
                System.out.println("Not prime");
                System.out.println("Less than 1");
            }else if (count == 0){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        for (int div = 2; div * div <= num; div++){
            while (num % div == 0){
                num /= div;
                System.out.println(div + " ");
            }
        }
        if (num != 1){
            System.out.println(num);
        }
        System.out.println("Enter bottom of the range: ");
        int low = sc.nextInt();
        System.out.println("Enter top of the range: ");
        int high = sc.nextInt();

        for (int n = low; n <= high; n++){
            if (n <= 1) continue;
            int count = 0;
            for (int div = 2; div * div <= n; div ++){
                if (n % div == 0){
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println(n);
            }
        }
    }
}