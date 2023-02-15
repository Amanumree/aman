package numbers;
import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		int nums[]=  {4,3,2,7,8,2,3,1};
	    ArrayList <Integer> l=new ArrayList<>();
	    int k=1;
	    int n=nums.length;
	  //  Arrays.sort(nums);
	    for(int j=0;j<nums.length;j++)
	    {
	    	boolean flag=true;
	 	    for(int i=0;i<nums.length;i++)
	 	    {  
	 	    	if(nums[i]==k)
	 	    	{
	 	    	   flag=false;
	 	    	   break;
	 	    	}
	 	    }
	 	    if(flag==true)
	 	    {
	 	    	l.add(k);
	 	    }
	 	    k++;
	 	    
	    }
	    for(int i=0;i<l.size();i++)
	    {
	    	System.out.println(l.get(i));
	    }
	    
	}

}
