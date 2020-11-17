import java.util.HashSet;

public class DemoSet {

public static void main(String[] args) {

HashSet<String> setFruits = new HashSet<String>();

setFruits.add("rambutan");

setFruits.add("jackfruit"); 
setFruits.add("mangoesteen"); 
setFruits.add("jackFruit");//in add it will hv string method that compare the string


setFruits.add("jackfruit");//will not be added 

System.out.println(setFruits);

}

}

