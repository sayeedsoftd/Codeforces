# Codeforces
                                                                        A. Elephant
                                                                        **time limit per test1 second
                                                                        memory limit per test256 megabytes
                                                                        inputstandard input
                                                                        outputstandard output**
An elephant decided to visit his friend. It turned out that the elephant's house is located at point 0 and his friend's house is located at point x(x > 0) of the coordinate line. In one step the elephant can move 1, 2, 3, 4 or 5 positions forward. Determine, what is the minimum number of steps he need to make in order to get to his friend's house.

Input
The first line of the input contains an integer x (1 ≤ x ≤ 1 000 000) — The coordinate of the friend's house.

Output
Print the minimum number of steps that elephant needs to make to get from point 0 to point x.

Examples
inputCopy
5
outputCopy
1
inputCopy
12
outputCopy
3
Note
In the first sample the elephant needs to make one step of length 5 to reach the point x.

In the second sample the elephant can get to point x if he moves by 3, 5 and 4. There are other ways to get the optimal answer but the elephant cannot reach x in less than three moves.


1.code
package MyJavaProject.Codeforces;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int s;
        s=x/5;
        if (x%5==0)
        {
            System.out.println(s);
        }
        else {
            System.out.println(s+1);
        }


    }
}
OR
2.code
package MyJavaProject.helloword;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int steps = calculateSteps(x);

        System.out.println("Minimum steps needed: " + steps);

    }
    private static int calculateSteps(int x) {
        if (x <= 5) {
            return 1;
        }

        int steps = 0;
        while (x > 5) {
            if (x % 5 == 0) {
                steps += x / 5;
                x = 0;
            } else {
                x -= 4;
                steps++;
            }
        }

        if (x > 0) {
            steps++;
        }

        return steps;
    }
}
