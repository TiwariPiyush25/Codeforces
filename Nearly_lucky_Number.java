import java.util.Scanner;

public class Nearly_lucky_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='4' || str.charAt(i)=='7'){
                c++;
            }
        }

        if(c==4 || c==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
