import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int cn=0;
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long d=sc.nextLong();

            if(b>a){
                cn++;
            }
            if (c>a){
                cn++;
            }
            if (d>a){
                cn++;
                }

            System.out.println(cn);
        }
    }
}
