import java.util.Scanner;
public class Boy_or_girl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        char[] arr=str.toCharArray();
        String res="";
        for(char i:arr){
            if(res.indexOf(i)==-1){
                res+=i;
            }
        }

        if(res.length()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }

    }
}
