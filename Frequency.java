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
	        for(Integer i:t)                 //printing
	        {
	            if(map.get(i)==1)
	                res=i;
	        }
	        return res;
	        
	    }
		public static void sortbyval(Map<Integer,Integer> h)
		{
			ArrayList<Map.Entry<Integer,Integer>> li=new ArrayList<>(h.entrySet());
                  System.out.println(li);

            Collections.sort(li,(Map.Entry<Integer, Integer>o1,Map.Entry<Integer, Integer>o2)->
				{
					 if(o1.getValue()>o2.getValue())
					   return 1;
					else
					  return -1;
				}
			);

			for(Map.Entry<Integer,Integer> k: li)
			{
                  System.out.println(k.getKey()+ " "+k.getValue());
			}
		}
	   public static void main(String[] args)
	   {
		   int a[]=new int[]{2,2,1};
		  int a1= Frequency.singleNumber(a);
		  //System.out.println(a1);
		  Map<Integer,Integer> hmap=new HashMap<>();
		  hmap.put(1,12);
		  hmap.put(3,7);
          hmap.put(5,15);
		  hmap.put(7,1);

		  sortbyval(hmap);
	   }
	
}
