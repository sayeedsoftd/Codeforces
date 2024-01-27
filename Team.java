package MyJavaProject.Codeforces;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i,sum=0,count=0;
        for (i=0;i<n;i++)
        {
            int p=sc.nextInt();
            int q=sc.nextInt();
            int r=sc.nextInt();
            sum=p+q+r;
            if (sum>=2)
            {
                count++;
            }
        }
        System.out.println(count);




    }
}
