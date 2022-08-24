import java.lang.*;
import java.util.Scanner;
class Swap
        {          public static void main(String args[])
            {
                int a=0,b=0,temp=0;
                
                       System.out.println("Entre number a");
                        Scanner k = new Scanner(System.in);
                        a = k.nextInt();
                        System.out.println("Entre number b");
                        Scanner u = new Scanner(System.in);
                        b = u.nextInt();
		 	temp=b;
			b=a;
			a=temp;
			System.out.println("number a =" + a + " & b= " + b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("number a ="+ a + " & b= " + b);
			a=a^b;
			b=a^b;
			a=a^b;
			System.out.println("number a ="+ a + " & b= " + b);
            }
                  

        }