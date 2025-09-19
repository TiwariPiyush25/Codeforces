import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a="I hate it ";
        String b="I love it ";
        String c="I hate that ";
        String d="I love that ";

        String res="";

        int i=n;
        int count=1;
        while(i>=1){
            if(i==1) {
                if (count % 2 != 0) {
                    res += a;
                } else if (count % 2 == 0) {
                    res += b;
                }
            }
            else {
                if(count%2!=0){
                    res+=c;
                }
                else{
                    res+=d;
                }
            }

            i--;
            count++;
        }
        System.out.println(res);
    }
}
