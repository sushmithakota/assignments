import java.util.*;
import java.io.*;
class qn1b
{
 void pair(int a[],int n,int x)
    {
        int i=0;
	int j=n-1;
	while(i<j)
	{
		if(a[i]+a[j]==x)
		{
			System.out.println("pair:"+a[i]+"  "+a[j]);
			i++;
			j--;
		}
		else
		{
			if((a[i]+a[j]<x))
				i++;
			else
				j--;
		}
	}
		
    }
public static void main(String args[])
   {
               System.out.println("enter the size");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("enter the sorted array");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("enter the element");
		int x=s.nextInt();
             qn1 ob = new qn1();
        
        ob.pair(a,n,x);
    }
}
