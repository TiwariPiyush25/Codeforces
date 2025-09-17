import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        str=str.replace("+","");
        System.out.println(str);
        char[] arr=str.toCharArray();

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i== arr.length-1){
                break;
            }
            System.out.print("+");
        }
    }
}
