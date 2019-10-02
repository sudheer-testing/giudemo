import java.util.ArrayList;

public class Uniquenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//to find unique number
		
		int a[]= {10,2,4,4,10,8,9,4,9,9,2,2,10,8,9,1};
		
		ArrayList<Integer> ab=new ArrayList<Integer> ();
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
					k++;
				}}
			
			if(k==1)
				System.out.println(k);
				System.out.println("unique number"+a[i]);
		}

	}

	}}
