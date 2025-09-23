import java.util.Scanner;

public class Lucky_Division {
    static boolean isLucky(int n){
        int c=0;
        int digit_count=0;
        while (n!=0){
            digit_count++;
            int ld=n%10;
            if (ld==4 || ld==7) c++;
            n/=10;
        }

        if (c==digit_count) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int almostLucky=0;
        for (int i=1;i<=n;i++){
            if (isLucky(i) && n%i==0) {
                almostLucky=1;
            }
        }

        if (almostLucky==0) {
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
