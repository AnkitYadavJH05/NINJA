import java.util.*;
class program53
{
    public static void main (String args[])
    {
        int choicenum, n;
        Scanner in = new Scanner (System.in);
        System.out.println("type 1 for finding product of last and first digit and type 2 for finding sum of series");
        choicenum =in.nextInt();
        System.out.println("enter the number to find perfect number or to find perfect number");
        n=in.nextInt();
        switch(choicenum)
        {
            case 1:
            int ld,fd=0,d,product=1;   
            System.out.println("OUTPUT"); 
            ld=n%10;
            for(int i=n;i>0;i=i/10)
            {
                d=i%10;
                fd=i;
            }
            product=fd*ld;
                System.out.println("the product of last and first digit is:-"+product);
            break;
            
            case 2:
                int sum=0;
            System.out.println("OUTPUT"); 
            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    sum=sum+i;
                }
            }
                if(sum==n)
                {
                System.out.println(" the number is perfect number"+n); 
            }
            else
            {
             System.out.println(" the number is not perfect number"+n);   
            }
            break;
        }
}
}

import java.util.*;
class program53
{
    public static void main (String args[])
    {
        int choicenum, n;
        Scanner in = new Scanner (System.in);
        System.out.println("type 1 for finding product of last and first digit and type 2 for finding sum of series");
        choicenum =in.nextInt();
        System.out.println("enter the number to find perfect number or to find perfect number");
        n=in.nextInt();
        switch(choicenum)
        {
            case 1:
            int ld,fd=0,d,product=1;   
            System.out.println("OUTPUT"); 
            ld=n%10;
            for(int i=n;i>0;i=i/10)
            {
                d=i%10;
                fd=i;
            }
            product=fd*ld;
                System.out.println("the product of last and first digit is:-"+product);
            break;
            
            case 2:
                int sum=0;
            System.out.println("OUTPUT"); 
            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    sum=sum+i;
                }
            }
                if(sum==n)
                {
                System.out.println(" the number is perfect number"+n); 
            }
            else
            {
             System.out.println(" the number is not perfect number"+n);   
            }
            break;
        }
}
}

