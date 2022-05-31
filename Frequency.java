package CollectionPrac;
import java.util.*;
public class Frequency {
	
	    public static int singleNumber(int[] nums) {
	       Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	        int res=0;
	        for(int i=0;i<nums.length;i++)
	        {///2,2,1
	            if(map.containsKey(nums[i]))
	            {
	            	int val=nums[i];
	                map.put(val,map.get(val)+1);
	                System.out.println(map);
	            }
	            else
	            {
	                map.put(nums[i],1);
	                System.out.println(map);
	            }
	        }
	        
	        Set<Integer> t=map.keySet();
	        for(Integer i:t)
	        {
	            if(map.get(i)==1)
	                res=i;
	        }
	        return res;
	        
	    }
	   public static void main(String[] args)
	   {
		   int a[]=new int[]{2,2,1};
		  int a1= Frequency.singleNumber(a);
		  //System.out.println(a1);
	   }
	
}
