import java.util.Scanner;

    public class Bit_plus_plus {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            int X=0;
            for (int i = 0; i < n; i++) {
                String a = sc.next();
                if (a.equals("X++")) {
                    X++;
                }
                if (a.equals("++X")) {
                    ++X;
                }
                if (a.equals("X--")) {
                    X--;
                }
                if (a.equals("--X")) {
                    --X;
                }
            }
            System.out.println(X);
        }
    }
