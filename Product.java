import java.util.*;
 class Product1{
int pcode,price;
String pname;
}
public class Product{
public static void main(String args[])
{
Product1 p1=new Product1();
Product1 p2=new Product1();
Product1 p3=new Product1();
Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
System.out.println("enter pcode of first product");
p1.pcode=sc.nextInt();
System.out.println("enter price of first product");
p1.price=sc.nextInt();
System.out.println("enter pname of first product");
p1.pname=sc1.nextLine();
System.out.println("enter pcode of second product");
p2.pcode=sc.nextInt();
System.out.println("enter price of second product");
p2.price=sc.nextInt();
System.out.println("enter pname of second product");
p2.pname=sc1.nextLine();
System.out.println("enter pcode of third product");
p3.pcode=sc.nextInt();
System.out.println("enter price of third product");
p3.price=sc.nextInt();
System.out.println("enter pname of third product");
p3.pname=sc1.nextLine();
if(p1.price<p2.price&&p1.price<p3.price)
{
System.out.println(p1.pname + "has the lowest price with code" + p1.pcode +"and price" + p1.price);
}
else if(p2.price<p3.price)
{
System.out.println(p2.pname + "has lowest price with code" + p2.pcode +"and price" + p2.price);
}
else
{
System.out.println(p3.pname +" has the lowest price with code" + p3.pcode+"and price" + p3.price);
}
}
}

