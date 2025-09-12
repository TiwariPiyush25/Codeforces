import java.util.Scanner;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();

        for(int lim=y+1;lim<=10000;lim++) {
            String str = String.valueOf(lim);

            String res = "";

            for (int i = 0; i < str.length(); i++) {
                if (res.indexOf(str.charAt(i)) == -1) {
                    res += str.charAt(i);
                }
            }

            if(res.equals(str)){
                System.out.println(lim);
                return;
            }

        }
    }
}
