import java.util.Scanner;

public class Legs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=0;i<T;i++){
            int n=sc.nextInt();
            int c=0;
            while(n>0) {
                if(n >= 4) {
                    n -= 4;
                    c++;
                }
                else if (n>=2) {
                     n-=2;
                     c++;
                }
            }
            System.out.println(c);
        }

    }
}
