package CollectionPrac;

import java.util.*;

public class LaptopList  {

	public static void main(String[] args) {
		
        List <Laptops> lap=new ArrayList<>();
        lap.add(new Laptops("Dell",16,830));
        lap.add(new Laptops("HP",32,1450));
        lap.add(new Laptops("HP",32,2100));
        lap.add(new Laptops("Asus",12,1200));
        
       lap.forEach(x->System.out.println(x));
       System.out.println("yes work fine with foreach");
        Comparator <Laptops> com= new Comparator<Laptops>()
        		{
        			public int compare(Laptops obj1, Laptops obj2)
        			{
        				if(obj1.getBrand().compareTo(obj2.getBrand())>0)
        				{
        					return 1;
        				}
        				else if(obj1.getBrand().compareTo(obj2.getBrand())<0)
        				    return -1;
        				
        				return 0;
        			}
        			
        		};
        	
        		Collections.sort(lap,com);
        //System.out.println(new Laptops().getBrand());
        	/*Collections.sort(lap,(Laptops o1,Laptops o2)->{
        		return o1.getPrice()>o2.getPrice()? -1:1;
        	});*/
        		Collections.sort(lap);
        for(Laptops l1:lap)
        {
        	System.out.println(l1);
        }
        
	}

	/*@Override
	public int compare(Laptops obj1, Laptops obj2) {
		if(obj1.getBrand().compareTo(obj2.getBrand())>0)
		{
			return 1;
		}
		else if(obj1.getBrand().compareTo(obj2.getBrand())<=0)
		return -1;
		
		return 0;
		
	}*/

}
