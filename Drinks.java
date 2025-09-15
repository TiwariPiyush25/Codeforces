import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextInt();

        double sum=0;
        for(int i=0;i<n;i++){
            float p=sc.nextInt();
            sum+=p;
        }

        System.out.println(sum/n);
    }
}
