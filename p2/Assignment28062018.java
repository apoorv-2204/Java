import java.lang.*;
import java.util.Scanner;
import java.lang.Math;
class Assignment28062018 {

    public static void main(String args[]) {
        int k = 0;
        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("1 for printing sum of n natural numbers");
            System.out.println("2 for printing series 1,2,4,7,11,16,22");
            System.out.println("3 for printing series for n even numbers");
            System.out.println("4 for printing series for n odd numbers");
            System.out.println("5 for printing series of square of n natural numbers");
            System.out.println("6 for printing tables");
            System.out.println("7 for printing factorial");
            System.out.println("8 for finding power");
            System.out.println("9 for finding digits");
            System.out.println("10 for finding sum of digits");
            System.out.println("11 for reverse of digits");
            System.out.println("12 for checking palindrome or not");
            System.out.println("13 for checking prime number");
            System.out.println("14 to entre in pattern world");
            k = scan.nextInt();
            switch (k) {
                case 0: break;
                case 1: sonn();break;
                case 2: ps1();break;
                case 3:  ps2();break;
                case 4:  ps3();break;
                case 5:  ps4();break;
                case 6:  table();break;
                case 7:  fact();break;
                case 8:  pow();break;
                case 9:  findDigit();break;
                case 10: sumDigit();break;
                case 11: revDigit();break;
                case 12: checkPalindrome();break;
                case 13: checkPrime();break;
                case 14: pattern();break;
            }

        } while (k != 0);

    }

    static void sonn() {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0, sum = 0;
        System.out.println("Entre n = ");
        n = scan.nextInt();
        for (i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }

    static void ps1() {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0, z = 1;
        System.out.println("Entre n =");
        n = scan.nextInt();
        for (i = 0; i < n; i++) {
            z += i;
            System.out.println(z + " ");
        }
    }

    static void ps2() {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0, z = 0;
        System.out.println("Entre n =");
        n = scan.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println(z + " ");
            z = z + 2;
        }
    }

    static void ps3() {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0, z = 1;
        System.out.println("Entre n =");
        n = scan.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println(z + " ");
            z = z + 2;
        }

    }

    static void ps4() {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0;
        System.out.println("Entre n =");
        n = scan.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println(i * i + " ");
        }
    }

    static void table() {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0;
        System.out.println("Entre n =");
        n = scan.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.println(i * n + " ");
        }
    }

    static void fact() {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0, z = 1;
        System.out.println("Entre n =");
        n = scan.nextInt();
        for (i = n; i > 0; i--) {
            z *= i;
        }
        System.out.println("Fact = " + z);
    }

    static void pow() {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0, t = 0, z = 1;
        System.out.println("Entre n =");
        n = scan.nextInt();
        System.out.println("Entre power =");
        t = scan.nextInt();
        for (i = 0; i < t; i++) {
            z *= n;
        }
        System.out.println("pow = " + z);
    }

    static void findDigit() {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0, z = 1;
        System.out.println("Entre n =");
        n = scan.nextInt();
        for (i = 0; n!=0;i++)
        {
            z = n % 10;
            n = n / 10;
            System.out.println("digit " + i + " = " + z);
        }

    }

    static void sumDigit() {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0, sum = 0, z = 1;
        System.out.println("Entre n =");
        n = scan.nextInt();
        for (i = 0; n != 0; i++) {
            z = n % 10;
            n = n / 10;
            sum += z;
        }
        System.out.println("Sum  = " + sum);
    }

    static void revDigit() {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0, nn = 0, z = 1;
        System.out.println("Entre n =");
        n = scan.nextInt();
        for (i = 0; n != 0; i++) {
            z = n % 10;
            n = n / 10;
            nn = 10 * nn + z;
        }
        System.out.println("New Number  = " + nn);
    }

    static void checkPalindrome() {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0, nn = 0, ol = 0, z = 1;
        System.out.println("Entre n =");
        ol = n = scan.nextInt();
        for (i = 0; n != 0; i++) {
            z = n % 10;
            n = n / 10;
            nn = 10 * nn + z;
        }
        if (nn == ol) {
            System.out.println("Palindrome");
        } else if (nn != ol) {
            System.out.println("Not a palindrome");
        }
    }

    static void checkPrime()
    {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0,flag=1;
        System.out.println("Entre n = "+"some are 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199");
        n = scan.nextInt();
        for (i = 2;i<Math.sqrt(n); i++) {
            if(n%i==0)
            {
                flag=0;
                System.out.println("Not a Prime");
                break;
            }
            else
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            flag=0;
            System.out.println("Optimus Prime");
        }

    }
    static void pattern()
    {
        int k = 0;
        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("1 for pattern 1");
            System.out.println("2 for pattern 2");
            System.out.println("3 for pattern 3");
            System.out.println("4 for pattern 4");
            System.out.println("5 for pattern 5");
            System.out.println("6 for pattern 6");
            System.out.println("7 for pattern 7");
            System.out.println("8 for pattern 8");
            System.out.println("9 for pattern 9");
            System.out.println("0 for exit");

            k = scan.nextInt();
            switch (k) {
                case 0: break;
                case 1: p1();break;
                case 2: p2();break;
                case 3: p3();break;
                case 4: p4();break;
                case 5: p5();break;
                case 6: p6();break;
                case 7: p7();break;
                case 8: p8();break;
                case 9: p9();break;

            }
        } while (k != 0);
    }
    static void p1()
    {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0,j = 1;
        System.out.println("Entre Height n =");
        n = scan.nextInt();
        for(i=1;i<=n;i++)
        {
            j=1;//imp point here loop ends reintilaisation of variables will take place
            for(;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void p2()
    {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0,j = 1;
        System.out.println("Entre Height n =");
        n = scan.nextInt();
        for(i=1;i<=n;i++)
        {
            j=1;//imp point here loop ends reintilaisation of variables will take place
            for(;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void p3()
    {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0,j = 1;
        System.out.println("Entre Height n =");
        n = scan.nextInt();
        for(i=n;i>0;i--)
        {
            //imp point here loop ends reintilaisation of variables will take place
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    static void p4()
    {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0,j = 1;
        System.out.println("Entre Height n =");
        n = scan.nextInt();
        for(i=n;i>0;i--)
        {
            //imp point here loop ends reintilaisation of variables will take place
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void p5()
    {
        Scanner scan = new Scanner(System.in);
        int i =0,j=0,k=0,z=0, n = 0;
        System.out.println("Entre Height n =");
        n = scan.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=(n+1)-i;j>0;j--)
            {
                System.out.print(" ");
            }
            if(i%2!=0)
            {
                for (k=1;k<=i;k++)
                {
                    System.out.print("* ");
                }
            }
            else if(i%2==0)
            {
                for (z=1;z<=i;z++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
    static void p6()
    {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0, z = 1,k=0;
        System.out.println("Entre Height n =");
        n = scan.nextInt();
        for (i = 0; i < n; i++) {
            z += i;
            for(k=1;k<=z;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void p7()
    {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0, z = 0,j=0;
        System.out.println("Entre Height n =");
        n = scan.nextInt();
        for (i = 0; i < n; i++) {
            for(j=1;j<=z;j++)
            {
                System.out.print("*");
            }
            z = z + 2;
            System.out.println();
        }
    }
    static void p8()
    {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0, z = 1,j=0;
        System.out.println("Entre n =");
        n = scan.nextInt();
        for (i = 0; i < n; i++) {
            for(j=1;j<=z;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            z = z + 2;
        }

    }
    static void p9()
    {
        Scanner scan = new Scanner(System.in);
        int i = 1, n = 0,k=1,z = 1,j=0;
        System.out.println("Entre n =");
        n = scan.nextInt();
        for (i = 1; i<=n; i++)
        {
            System.out.print("*");
            if(i!=n)
            {
                for (j = 1; j <= n - 2; j++) {
                    System.out.print(" ");
                }
            }
            if(i==1)
            {
                for(z=1;z<=n-1;z++)
                {
                    System.out.print("*");
                }
            }
            else if(i==n)
            {
                for(k=1;k<=(2*n-3);k++)
                {
                    System.out.print("*");
                }
            }
            System.out.println("*");
        }

        for (i = 1; i<n; i++)
        {
                if(i!=n-1)
                {
                    for (j = 1;j<n; j++)
                    {
                        System.out.print(" ");
                    }
                }
            System.out.print("*");
                if(i==n-1)
                {
                    for(k=1;k<=n-1;k++)
                    {
                        System.out.print("*");
                    }
                }
                for (j = 1; j <= n - 2; j++)
                {
                    System.out.print(" ");
                }

            System.out.println("*");
        }


    }


}



