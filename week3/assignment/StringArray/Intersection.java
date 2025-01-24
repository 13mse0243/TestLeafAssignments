package week3.assignment.StringArray;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intersection in=new Intersection();
		int a[]= {5,8,9,10,2,1};
		int b[]= {1,2,11,15,8,3};
		System.out.println(in.findIntersection(a, b));

	}
	public List<Integer> findIntersection(int array1[],int array2[])
	{
		//creating arraylist to add the result 
		ArrayList<Integer> al=new ArrayList<Integer>();
		//loop to iterate first array
		for(int i=0;i<array1.length;i++)
		{
			//loop to iterate array2 elements
			for(int j=0;j<array2.length;j++)
			{
				// checking one element of array1 is equals with the overall j element
				if(array1[i]==array2[j])
				{
					al.add(array1[i]);
					break;
				}
			}
		}
		return al;
		
	}

}
