public class ArrayDemo
{
public static void main(String[]args )
{
/*// declare & create an array of integers
int[] anArray = new int [10];//default value is 0
// assign a value to each array element and print
//array 1D size via array.length
for (int i = 0; i < anArray.length ; i ++)
	{	anArray[i] = i;
	System.out.print(anArray[i] + " ");//.length is field not function so it doesn't hv bracket()
	}
System.out.println();*/

	int[][] anArray=new int[10][3];
	System.out.println("Length ? "+anArray.length);//it will output size of the row
	System.out.println("Length ? "+anArray[9].length);//for column length,[1],[2] also same,as long as didnt exceed row 
	}
}