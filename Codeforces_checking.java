import java.util.Scanner;
public class Codeforces_checking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        String Str="codeforces";
        for(int i=0;i<t;i++){
            char ch=sc.next().charAt(0);
            int ispresent=0;
            for(int j=0;j<Str.length();j++) {
                if (Str.charAt(j) == ch) {
                    ispresent = 1;
                }
            }

            if(ispresent==1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
