package ArrayList;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListExample {

	
	public static void main(String[] args) {
		arrayListExample();
	}
	
	
	public static void arrayListExample() {
		
		Vector v= new Vector();
		v.add(0,1);
		v.add(1,2);
		v.add(2,3);
		
		System.out.println("the number in vector is "+v);
		
		ArrayList arr= new ArrayList();
		
		arr.addAll(v);
		System.out.println("the number in arraylist is   "+arr);
		
	}
}
