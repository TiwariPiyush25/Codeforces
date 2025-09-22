import java.util.Scanner;

public class IQ_Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=0;

        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                count++;
                arr[i]=0;
            }
        }

        int ind=0;
        if(count==1){
            for (int i=0;i<n;i++){
                if(arr[i]==0){
                    ind=i;
                    break;
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(arr[i]!=0){
                    ind=i;
                    break;
                }
            }
        }

        System.out.println(ind+1);


    }
}
