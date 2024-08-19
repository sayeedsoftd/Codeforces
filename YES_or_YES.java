package MyJavaProject.Codeforces;

import java.util.Scanner;

public class YES_or_YES {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
       for (int i=0;i<=s.length();i++)
       {
           String t=sc.next();
           if (t.equalsIgnoreCase("yes"))
           {
               System.out.println("YES");
           }
           else {
               System.out.println("NO");
           }
       }
    }
}
