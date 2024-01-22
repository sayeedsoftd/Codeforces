package MyJavaProject.Codeforces;

import java.util.Scanner;

public class Calculating_Function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,sum=0;
        for (i=1;i<=n;i++)
        {
            int term=(int)Math.pow(-1,i)*i;
            sum=sum+term;
        }
        System.out.println(sum);
    }
}
