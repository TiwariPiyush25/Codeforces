import java.util.Scanner;

public class Hit_thre_Lottery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();

        long c=0;
        while(n>0){
            if(n>=100){
                n-=100;
                c++;
            }
            else if(n>=20){
                n-=20;
                c++;
            }
            else if(n>=10){
                n-=10;
                c++;
            }
            else if(n>=5){
                n-=5;
                c++;
            }
            else{
                n-=1;
                c++;
            }
        }

        System.out.println(c);
    }
}
