import java.util.ArrayList;

public class DemoVector{

public static void main(String args[]) {

ArrayList<String> fruits = new ArrayList<String>();

fruits.add("rambutan");
fruits.add("jackfruit"); 
fruits.add("mangoesteen");

System.out.println(fruits); 
//fruits.remove("jackfruit");
fruits.add("mango"); 
System.out.println(fruits);

System.out.println("mangoesteen is exist? " +

fruits.contains("mangoesteen"));//boolean


fruits.set(2,"durian");//set it to new value (change)
fruits.add(2,"durian2");//add 1 value called "durian" in side
System.out.println(fruits);
//System.out.println("position : "+fruits.get(1));
System.out.println("Size: "+fruits.size());
}

}

