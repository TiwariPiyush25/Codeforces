import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int[] arr=new int[5];

        arr[0]=a+(b*c);
        arr[1]=(a+b)*c;
        arr[2]=a*(b+c);
        arr[3]=a*b*c;
        arr[4]=a+b+c;
        int max=arr[0];
        for(int i=0;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
