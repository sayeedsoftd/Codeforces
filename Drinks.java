package MyJavaProject.Codeforces;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        double sum=0;
        int i;
        for (i=0;i<n;i++)
        {
            x[i]= sc.nextInt();
        }
        for (i=0;i<n;i++)
        {
            sum+=x[i];
        }
       double res=(double) sum/x.length;
        System.out.println(res);

    }
}
