import java.util.Scanner;

public class Ilya_and_Bank_Account {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if (n>0){
            System.out.println(n);
        }
        else {
            n=n*(-1);
            int f=(n%10);
            int s=n%100;
            s=(s/10);

            if (f>s){
                n=n/10;
            }
            else {
                n/=100;
                n=n*10+f;
            }
            System.out.println((-1)*n);
        }
    }
}
