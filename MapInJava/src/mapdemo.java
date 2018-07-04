import java.util.*;
public class mapdemo {
	public static void main(String[] agrs)
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Aishwarya");
		hm.put(2, "Akansha");
		hm.put(3, "Aditiya");
		hm.put(4,"Tara"); 
		//System.out.println(hm);
		for(Map.Entry m :hm.entrySet())
			System.out.println(m.getKey()+ "-" +m.getValue());
		System.out.println("Index of Aishwarya");
		for(Integer key: hm.keySet())
		{
			if(hm.get(key).equals("Aishwarya"))
					System.out.println(key);
		}
		
	}

}
