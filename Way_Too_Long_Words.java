package MyJavaProject.Codeforces;
;
import java.util.Scanner;

public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;

        for (i=0;i<n;i++)
        {
            String s=sc.next();
           if (s.length()>10)
           {
               s=s.charAt(0)+ ""+(s.length()-2)+(s.charAt(s.length()-1));
               System.out.println(s);
           }
           else
           {
               System.out.println(s);
           }


        }
    }
}
