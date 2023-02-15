package numbers;

import java.util.*;

public class yuvi
{
   
    public static int find_maximum_subarray(int arr[],int length)
    {
       /*write the code to find the maximum subarray sum
        only return the maximum sum of the subarray . 
        Both array and size of array is given */
      int cursum=0;
        int max=0; int sum=0;
        int k=0;
      int brr[]=new int[arr.length];
      for(int j=0;j<arr.length;j++)
      {
    	  brr[k]=arr[j];
    	  k++;
      }
         Arrays.sort(brr);
         if(brr[k]>0)
         {
        	 sum=sum+brr[k];
         }
         return sum;
    
        for(int i=0;i<arr.length;i++)
          {
                cursum= cursum+arr[i];
                if(cursum>max)
                {
                    max=cursum;    
                }
                if(cursum<0)
                {
                    cursum=0;     
                } 
        }return max;
    }
       
          
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max= find_maximum_subarray(arr,n);
        System.out.println(max);
    }
}