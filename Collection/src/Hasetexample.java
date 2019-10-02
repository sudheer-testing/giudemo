import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Hasetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<String> ();
		hs.add("USA");
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		//hs.remove("UK");
		hs.remove("usa");
		hs.add("soudi");
		System.out.println(hs);
		System.out.println(hs.size());
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			//it.next();
		System.out.println(it.next());
		
		HashMap<Object, Object> hm=new HashMap<Object, Object>();
		hm.put(001, "NLR");
		hm.put(002,"VZ");
		}
		//System.out.println(it.next());
				
	}

}
