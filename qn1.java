import java.util.*;
import java.io.*;
class qn1
{
       void merge(int a[], int low, int mid, int high)
    {
         int size1 = mid - low + 1;
        int size2 = high - mid;
 
        
        int a1[] = new int [size1];
        int a2[] = new int [size2];
      
        for (int i=0; i<size1; ++i)
            a1[i] = a[low + i];
        for (int j=0; j<size2; ++j)
            a2[j] = a[mid + 1+ j];
        int i = 0, j = 0;
        int k = low;
        while (i < size1 && j < size2)
        {
            if (a1[i] <= a2[j])
            {
                a[k] = a1[i];
                i++;
            }
            else
            {
                a[k] = a2[j];
                j++;
            }
            k++;
        }
        while (i < size1)
        {
            a[k] = a1[i];
            i++;
            k++;
        }
 
        while (j < size2)
        {
            a[k] = a2[j];
            j++;
            k++;
        }
    }
 
    void sort(int a[], int low, int high)
    {
        if (low < high)
        {
            
            int mid = (low+high)/2;
 
            
            sort(a, low, mid);
            sort(a,mid+1, high);
 
            merge(a, low, mid, high);
        }
    }
 
        static void pair(int a[],int n,int x)
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
		System.out.println("enter the array");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("enter the element");
		int x=s.nextInt();
             qn1 ob = new qn1();
        ob.sort(a, 0, n-1);
        pair(a,n,x);
    }
}
