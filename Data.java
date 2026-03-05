import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        int a = 20;
        int b = 14;
        int sum = a + b;
        int dif = a - b;
        int mul = a * b;
        int div = a / b;

        System.out.println("Integer a:" + a);
        System.out.println("Integer b:" + b);
        System.out.println("a + b:" + sum);
        System.out.println("a - b:" + dif);
        System.out.println("a * b:" + mul);
        System.out.println("a / b:" + div);

        Scanner sc = new Scanner(System.in);

        System.out.println("Input Integer: ");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("Input Long: ");
        long longnum = sc.nextLong();
        System.out.println(longnum);

        System.out.println("Input Float: ");
        float f = sc.nextFloat();
        System.out.println(f);

        System.out.println("Input Double: ");
        double d = sc.nextDouble();
        System.out.println(d);

        System.out.println("Input Character: ");
        char letter = sc.next().charAt(0);
        System.out.println(letter);

        System.out.println("Input String: ");
        String str = sc.nextLine();
        System.out.println(str);

        System.out.println("Input Boolean: ");
        boolean bool = sc.nextBoolean();
        System.out.println(bool);

        //Unary, Binary, Ternary
        int inc1 = ++a;//prefix
        int inc2 = b++;//postfix
        System.out.println("++a: " + inc1);
        System.out.println("b++: " + inc2);

        int largestnum = (a>b)?a:b;
        System.out.println("Largest number: " + largestnum);

        soup();
    }
    public static void soup() {
        System.out.println("1.Water");
        System.out.println("2.Vegetable");
        System.out.println("3.Packet Soup");
    }
}