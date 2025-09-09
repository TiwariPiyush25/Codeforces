import java.util.*;
/*  Test case......

    4              // n
    100 200 400 100 // prices
    6    // q

    Amounts   K
    100       2
    200       3
    500       4
    600       4
    800       4
    1200      1
 */
public class Alex_Goes_Shopping {
    public static boolean Possible(int[] prices,int Amount,int k){
        int count=0;
        for(int i=0;i<prices.length;i++){
            if(Amount%prices[i]==0){
                count++;
            }
        }

        if(count>=k){
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] prices=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }

        int q=sc.nextInt();

        for(int i=0;i<q;i++){
            int Amount=sc.nextInt();
            int k=sc.nextInt();

            if(Possible(prices,Amount,k)==true){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }


    }
}
