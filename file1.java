import java.util.*;
import java.io.*;
public class file1{
public static void main(String args[]){
int i;
try{
FileWriter f1=new FileWriter("f1.txt");
FileReader f2=new FileReader("f1.txt");
Scanner sc = new Scanner(System.in);
System.out.print("Enter text to write to the file: ");
String data = sc.nextLine();    
System.out.println("content write to file1.txt");
f1.write(data);
f1.close();
System.out.println("content read from file");
while((i=f2.read())!=-1)
{
System.out.print((char)i);
}
f2.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}

