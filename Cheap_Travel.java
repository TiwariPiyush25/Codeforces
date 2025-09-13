import java.util.Scanner;

public class Cheap_Travel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        int ride1=0;
        int sum1=0;
        while(ride1<n){
            sum1+=a;
            ride1++;
        }

        int ride2 =0;
        int sum2=0;
        while(ride2 <n){
            sum2+=b;
            ride2+=m;
        }

        System.out.println(Math.min(sum1,sum2));
    }
}
