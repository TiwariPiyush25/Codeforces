import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=1;
        String  arr[]=new String[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.next();
        }

        String  first=arr[0];
        for(int i=1;i<n;i++){
            if(first.equals(arr[i])){
                continue;
            }
            else{
                count++;
            }
            first=arr[i];
        }
        System.out.println(count);
    }
}
