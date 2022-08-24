import java.lang.*;
import java.util.Scanner;
class Calculator
{
    static
    {
 	System.out.println("Program works as A(*-+/)B");
    }
    public static void main(String args[])
    {
        int n=0,z=0,j=0;
        float a=0,b=0;
        float memory[]=new float[100];
        int ab[]=new int[2];
        do
        {
            System.out.println("Entre 0 to Exit");
            System.out.println("Entre 1 to Add");
            System.out.println("Entre 2 to Subtract");
            System.out.println("Entre 3 to Multiply");
            System.out.println("Entre 4 to Divide");
            Scanner i=new Scanner(System.in);
            n= i.nextInt();
        if(n==0)
        {   System.exit(0);}
          if(ab[0]==1||ab[1]==1)
         {
             if(ab[0]==1)
             {
                 System.out.println("Entre number b");
                 b = i.nextFloat();
		 ab[0]=0;
             }
             else if(ab[1]==1)
             {
                 System.out.println("Entre number a");
                 a = i.nextFloat();
             	 ab[1]=0;
	     }
         }
         else
         {
             System.out.println("Entre number a");
             a = i.nextFloat();
             System.out.println("Entre number b");
             b = i.nextFloat();
         }
        switch(n)
        {
            case 0: break;
            case 1: memory[z]=a+b;
                break;
            case 2: memory[z]=a-b;
                break;
            case 3: memory[z]=a*b;
                break;
            case 4: if(b==0){System.out.println("Can't Divide with zero");}
            else{ memory[z]=a/b;}
                break;
            default:System.out.println("Entre correct choice");
                break;
        }

            System.out.println("Answer = " + memory[z]);
            System.out.println("Entre 1 to use result as a");
            System.out.println("Entre 2 to use result as b");
            System.out.println("Entre 3 to neglect last result");
            j=0;
            j=i.nextInt();
        if(j==3)
        {
            continue;
        }
        else if(j==1)
        {
             a = memory[z];
             ab[0]=1;
        }
        else if(j==2)
        {
            b = memory[z];
            ab[1]=1;
        }
        z++;
    }while(n!=0);

}

}