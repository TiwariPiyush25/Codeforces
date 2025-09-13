import java.util.Scanner;

public class Candies_and_Two_Sisters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();

            int ans=0;
            if(n%2==0){
                ans=(n/2)-1;
            }
            else {
                ans=n/2;
            }

            System.out.println(ans);
        }
    }
}
