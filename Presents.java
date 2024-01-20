package MyJavaProject.Codeforces;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n+1]; // number of friends
        int i;
        for (i=1;i<=n;i++)
        {
            int to_gift=sc.nextInt();
            num[to_gift]=i;
        }
        for (i=1 ; i<=n ; i++) {
            System.out.println(num[i] +" ");

        }

    }
}
