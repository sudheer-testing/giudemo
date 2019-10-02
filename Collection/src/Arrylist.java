import java.util.ArrayList;

public class Arrylist {
	
	

	public static void main(String[] args) {
		
		// arraylist will accept the duplicates
		//arrylist,linkedlist,vector will come under list set
		//arry have fixed size nd arraylist have dynamic size of adding and deleting 
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("kr");
		ar.add("ap");
		System.out.println(ar);
		ar.add(1, "Bihar");
		ar.add("punjab");
		ar.add("ap");
		System.out.println(ar);
		//ar.remove(0);
		//ar.remove("ap");
		System.out.println(ar);
		//ar.clear();
		//System.out.println(ar);
		//System.out.println(ar.get(1));
		System.out.println(ar.contains("ap"));
		System.out.println(ar.indexOf("ap"));
		System.out.println(ar.isEmpty());
		System.out.println(ar.size());
	}

}
