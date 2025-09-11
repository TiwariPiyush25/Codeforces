import java.util.*;

public class Anton_and_Letters {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();

            str=str.replaceAll("[^a-z0-9]","");

            String res="";
            for(int i=0;i<str.length();i++){
                char a=str.charAt(i);
                if (res.indexOf(a)==(-1)){
                    res+=a;
                }
            }

            System.out.println(res.length());
        }
    }
