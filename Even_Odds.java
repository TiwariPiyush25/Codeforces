import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();

        Long[] arr=new Long[(int) n*2];

        int c=0;
        for(long i=1;i<=n;i++){
            if(i%2!=0){
                arr[c]=i;
                c++;
            }

        }
        
        for(long i=1;i<=n;i++){
            if(i%2==0){
                arr[c]=i;
                c++;
            }

        }

        System.out.println(arr[(int) (k-1)]);
    }
}
