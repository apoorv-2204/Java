import java.lang.*;
import java.util.Scanner;
import java.lang.Math;
class Assignment28062018
{ 
    public static void main(String args[])
    {
        int k;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("\n1 for 1-D Array");
            System.out.println("2 for 2-D Array");
            k = scan.nextInt();
            switch (k)
            {
                case 0: break;
                case 1: OneDArray.oneDArray();break;
                case 2: Matrix.twoDArray();break;
            }
        } while (k!= 0);

    }
}
class OneDArray
{
    public static void oneDArray()
    {
            Scanner scan = new Scanner(System.in);
        int k = 0,s=0;
        System.out.print("Entre the size of array = ");
         s = scan.nextInt();
        int a[]=new int[s];
        input(a,s);
        display(a,s);
        do {
            System.out.println("\n1 for printing revArray");
            System.out.println("2 for printing min element and pos");
            System.out.println("3 for printing next index of min element ");
            System.out.println("4 for printing Second hignest in array");
            System.out.println("5 for display");
            k = scan.nextInt();
            switch (k)
            {
                case 0: break;
                case 1: revarray(a,s);break;
                case 2: minElementIndexOfArray(a,s);break;
                case 3: nextMinIndex(a,s);break;
                case 4: secondHighest(a,s);break;
                case 5: display(a,s);break;
            }
        } while (k != 0);

    }
        
    static void input(int a[],int k)
    {
        Scanner scan = new Scanner(System.in);    
        for(int i=0;i<k;i++)
        {
            a[i]=scan.nextInt();
        }

    }
    static void display(int a[],int k)
    {
        for(int i=0;i<k;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    static void revarray(int a[],int z)
    {
        int i = 0,temp=0,j=0;
        for(i=0;i<z;i++)
           {
             for(j=0;j<z-i-1;j++)
             {
                 temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
             }
           }
        display(a,z);
    }
    static void minElementIndexOfArray(int a[],int k)
    {
            int min=0,pos=0;
            min=a[0];
            for(int i=0;i<k;i++)
            {
                if(min>a[i])
                {
                    min=a[i];
                    pos=i;
                }
            }
            pos++;
        System.out.println(" min = "+min+"pos = "+pos);
    }
    static void nextMinIndex(int a[],int k)
    {
        int min=0,pos=0;
        min=a[0];
        for(int i=0;i<k;i++)
        {
            if(min>a[i])
            {
                min=a[i];
                pos=i;
            }
        }pos++;
        System.out.println("old pos = "+pos);
        if(pos==k)
        {
           pos=0;
        }
        else
        {
            pos++;
        }
        System.out.println(" min = "+min+"pos = "+pos);

    }
    static void secondHighest(int a[],int k)
    { 
        int max1,max2;
        max1=max2=Integer.MIN_VALUE;
         for(int i=0;i<k;i++)
        {
             if (a[i] > max1)
               {
                max2 = max1;
                max1 = a[i];
               }
 
        else if (a[i] > max2 && a[i] != max1)
        { 
            max2 = a[i];
        }
        }
                     System.out.println("max1 ="+max1+"max2 ="+max2);
    }

}
class Matrix
{
    public static void twoDArray()
    {
           Scanner scan = new Scanner(System.in);
        int r = 0,c=0,s=0,k=0;
        System.out.print("Entre the size of array R&C= \n");
         r = scan.nextInt();
         c = scan.nextInt();
         int a[][]=new int[r][c];
         input(a,r,c);
         display(a,r,c);
         do {
            System.out.println("\n1 for multiply");
            System.out.println("2 for display");
            k = scan.nextInt();
            switch (k)
            {
                case 0: break;
                case 1: multiply(a,r,c);break;
                case 2: display(a,r,c);break;
            }
        } while (k != 0);
        
    }
    static void input(int a[][],int r,int c)
    {
        System.out.println("\nentre array");
        Scanner scan = new Scanner(System.in);    
        for(int i=0;i<r;i++)
        {
           for(int j=0;j<c;j++)
            {
                a[i][j]=scan.nextInt();
            }
        }    

    }
    static void display(int a[][],int r,int c)
    {
        Scanner scan = new Scanner(System.in);    
        for(int i=0;i<r;i++)
        {
           for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
           System.out.println();
        } 
    }
    
    static void multiply(int a[][],int r1,int c1)
    {   
        Scanner scan=new Scanner(System.in);
        System.out.print("Entre the size of array R&C= ");
         int r2 = scan.nextInt();
         int c2 = scan.nextInt();
         int m=0,n=0;
         if(r1==c2||r2==c1)
            {
               if(r1==c2)
                {
                    m=r1;
                    n=c2;
                }
                else if(r2==c1)
                {
                    m=r2;
                    n=c1;
                }
                
            }
            else
            {
                System.out.println("Multiplication is  not possible");
            }
            int c[][] =new int[m][n];
            int b[][] =new int[r2][c2];
            input(b,r2,c2);
            for(int i=0;i<m;i++)
            {
                   for(int j=0;j<n;j++)
                    {
                        c[i][j] = 0;
                        for(int z=0;z<n;z++)
                        {
                            c[i][j]=c[i][j]+a[i][z]*b[z][j];
                        } 
                    }
            }
            display(c,m,n);
        }
    

}