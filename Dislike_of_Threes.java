import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dislike_of_Threes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        ArrayList arr=new ArrayList();
        for (int i = 0; i < t; i++) {
            int k=sc.nextInt();
            while(k%3==0 || k%10==3 || arr.contains(k)){
                k+=1;
            }
            arr.add(k);
        }

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(Integer.valueOf(i)));
        }
    }
}
