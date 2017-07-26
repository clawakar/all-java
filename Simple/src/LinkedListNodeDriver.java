public class LinkedListNodeDriver 
{
public static void main(String[] args) 
{
//LinkedListNodeDriver driver = new LinkedListNodeDriver();
LinkedList driver = new LinkedList();
driver.insert(new Node("Hello1"));
driver.insert(new Node("Hello2"));
driver.insert(new Node("Hello3"));

//Driver.toString();
System.out.println( driver);
driver.delete(new Node("Hello2"));
System.out.println( driver);

}}