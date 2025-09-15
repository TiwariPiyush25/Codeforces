import java.util.Scanner;

public class DubStep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        String[] arr=str.split("WUB");

        for(int i=0;i<arr.length;i++){
            if(arr[i]==" "){
                continue;
            }
            System.out.print(arr[i]+" ");
        }

    }
}
