import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("hello");
		al.add("hello1");
		al.add("hello2");
		al.add("hello3");
		for(String ref:al){
			System.out.println(ref);
		}
	}

}
