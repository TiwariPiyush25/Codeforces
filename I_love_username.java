import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        int i=0;
        while(i<n){
            arr[i]=sc.nextInt();
            i++;
        }

        int min=arr[0];
        int max=arr[0];

        int amazingness=0;
        for (i=1;i<n;i++){
            if (arr[i]<min){
                amazingness++;
                min=arr[i];
            }
            if (arr[i]>max){
                amazingness++;
                max=arr[i];
            }
        }

        System.out.println(amazingness);

    }
}
