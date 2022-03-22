//Write a Java program to remove elements from an ArrayList
public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "alex", "brian", "charles") );
         
        System.out.println(namesList);  //list size is 3
         
        //Add element at 1 index
        namesList.remove(1);
         
        System.out.println(namesList);  //list size is 2
    }
}
