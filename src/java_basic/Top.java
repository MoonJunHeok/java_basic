package java_basic;
import java.lang.*;
public class Top {

	public static void main(String[] args) throws Exception {
		String s = new String("Hello World Java");
		Class c1 = s.getClass();
		Class c2 = Class.forName("java.lang.String");
		Class c3 = String.class;
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		
		
		
	}

}
