import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();

        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int t = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    int a=i;
                    int b=j;
                    int movesr = 2 - a;
                    int movesc = 2 - b;
                    if(movesc<0){
                        movesc*=(-1);
                    }
                    if(movesr<0){
                        movesr*=(-1);
                    }
                    t = movesc+movesr;
                }
            }
        }
        System.out.println(t);
    }
}
