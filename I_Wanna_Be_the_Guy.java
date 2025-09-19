import java.util.ArrayList;
import java.util.Scanner;

public class I_Wanna_Be_the_Guy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int p=sc.nextInt();
        ArrayList <Integer> arr=new ArrayList<>();
        for(int i=0;i<p;i++){
            int a=sc.nextInt();
            arr.add(a);
        }

        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int b=sc.nextInt();
            arr.add(b);
        }

        ArrayList <Integer> arr1=new ArrayList<>();
        for(int ele:arr){
            if(arr1.indexOf(ele)==-1){
                arr1.add(ele);
            }
        }
        int c=0;
        for(int i=0;i<arr1.size();i++) {
            for (int j = 1; j <= n; j++) {
                if (arr1.get(i) == j) {
                    c++;
                }
            }
        }
        if(c==n){
            System.out.println("I become the guy.");
        }
        else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
