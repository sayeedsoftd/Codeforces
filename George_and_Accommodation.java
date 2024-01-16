package MyJavaProject.Codeforces;

import java.util.Scanner;

public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(); // number of rooms
        int i,count=0;
        int[] p=new int[n];
        int[] q=new int[n];
        for (i=0;i<n;i++)
        {
         p[i]=sc.nextInt(); // number of students
         q[i]=sc.nextInt(); // rooms capacity
         if (q[i] - p[i] >=2)
         {
             count++;
         }


        }
        System.out.println(count);
    }
}
