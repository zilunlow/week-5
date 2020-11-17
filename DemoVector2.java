import java.util.Vector;

import java.util.Enumeration;

public class DemoVector2 {

public static void main(String[] args) {

Vector<String> fruits = new Vector<String>();

fruits.add("rambutan"); 
fruits.add("jackfruit");
fruits.add("mangoesteen");

Enumeration<String> enumFruit = fruits.elements();
while (enumFruit.hasMoreElements()) {
	
	System.out.println(enumFruit.nextElement());

	}
System.out.println("\nWith for: ");
	// for (Enumeration<String> e =fruits.elements(); e.hasMoreElements();)
	// 	System.out.println(e.nextElement());
	// }
Enumeration<String> e =fruits.elements();
	for (; e.hasMoreElements();)
		System.out.println(e.nextElement());
	}

}

