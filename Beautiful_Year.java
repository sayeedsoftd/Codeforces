package MyJavaProject.Codeforces;

import java.util.Scanner;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();// scan year
        int a,b,c,d,ans = 0;

        for (;;)
        {
            y++;
            a=y/1000;
            b=(y/100)%10;
            c=(y/10)%10;
            d=y%10;
            if (a!=b && a!=c && a!=d && b!=c && b!=d && c!=d)
            {
                break;
            }

        }
        System.out.println(y);




    }
}
