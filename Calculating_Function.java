                                            A. Calculating Function
                                            time limit per test1 second
                                            memory limit per test256 megabytes
                                            inputstandard input
                                            outputstandard output
                                            For a positive integer n let's define a function f:

f(n) =  - 1 + 2 - 3 + .. + ( - 1)nn

Your task is to calculate f(n) for a given integer n.

Input
The single line contains the positive integer n (1 ≤ n ≤ 1015).

Output
Print f(n) in a single line.

Examples
    
input
4
output
2
input
5
output
-3

Note
f(4) =  - 1 + 2 - 3 + 4 = 2

f(5) =  - 1 + 2 - 3 + 4 - 5 =  - 3


###CODE###

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
