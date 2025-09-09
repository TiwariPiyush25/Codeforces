import java.util.Scanner;

public class A_plus_B_Again {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for (int i = 0; i < t; i++) {
            String n=sc.next();

            int a=n.charAt(0)-'0';
            int b=n.charAt(1)-'0';

            System.out.println(a+b);
        }
    }
}
