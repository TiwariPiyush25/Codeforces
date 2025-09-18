import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Holiday_Of_Equality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            arr.add(a);
        }

        int max=Collections.max(arr);

        int sum=0;
       for (int i = 0; i < arr.size(); i++) {
            int a=0;
            if (arr.get(i)<max){
                a=max-arr.get(i);
                sum+=a;
            }
        }

        System.out.println(sum);
    }
}
