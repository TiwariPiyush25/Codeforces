import java.util.Scanner;

public class Draw_a_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for (int i=0;i<t;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int d=sc.nextInt();
            int u=sc.nextInt();

            if(l==u && u==r && r==d && d==l){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
