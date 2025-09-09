import java.util.Scanner;

public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String str=sc.next();

        int a=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='A'){
                a++;
            }
        }

        int d=n-a;

        if(a>d){
            System.out.println("Anton");
        }
        else if (d>a) {
            System.out.println("Danik");
        }
        else {
            System.out.println("Friendship");
        }
    }
}
