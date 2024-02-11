package MyJavaProject.Codeforces;

import java.util.Scanner;

public class Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       String n=sc.next();
        String m=sc.next();
String result =strinbuild(n,m);
        System.out.println(result);
        sc.close();

    }
    public static  String strinbuild(String n,String m)
    {
        StringBuilder result =new StringBuilder();
        for (int i=0;i<n.length();i++)
        {
            if (n.charAt(i)!=m.charAt(i))
            {
                result.append("1");
            }
            else
            {
                result.append("0");
            }
        }
        return result.toString();
    }
}
