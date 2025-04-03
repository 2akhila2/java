import java.util.*;
interface sports
{
	 void getstd_data();
	 void getsport_data();
	 void display();
}
class student
{
	String name,batch,s_item,grade,cat;
	int rollno,pos;
	float sub1,sub2,sub3;
	Scanner s1=new Scanner(System.in);
	Scanner s2=new Scanner(System.in);
	public void getstd_data()
	{
		System.out.print("Enter the name of student:");
		name=s1.nextLine();
		System.out.print("Enter the roll no:");
		rollno=s2.nextInt();
		System.out.print("Enter the batch:");
		batch=s1.nextLine();	
		System.out.print("Enter the mark you got in subject 1:");
		sub1=s2.nextFloat();		
		System.out.print("Enter the mark you got in subject 2:");
		sub2=s2.nextFloat();		
		System.out.print("Enter the mark you got in subject 3:");
		sub3=s2.nextFloat();		
	}
	public void getsport_data()
	{
		System.out.print("which sports category are you involoved:");
		cat=s1.nextLine();
		System.out.print("Enter the possition you got:");
		pos=s2.nextInt();	
	}
	public void display()
	{
		float x=((sub1+sub2+sub3)/300)*100;
		System.out.println("\nName="+name);
		System.out.println("Roll no="+rollno);
		System.out.println("Batch="+batch);
		System.out.println("Percentage="+x);
		System.out.println("Sport="+cat);
		System.out.println("Possition="+pos);
		if(x>90)
		{
			System.out.print("you got grade A.....in academics\n");
		}
		else if(x>80)
		{
			System.out.print("you got grade B.....academics\n");
		}
		else
		{
			System.out.print("you got grade C.....academics\n");
		}
		if(pos==1)
		{
			System.out.println("you got GOLD medal.....in sports");
		}
		else if(pos==2)
		{
			System.out.println("you got SILVER medal.....sports");
		}
		else
		{
			System.out.println("you got BRONZE medal.....sports");
		}
	}
}
class multiple extends student implements sports
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the total no of students:");
		n=sc.nextInt();
		multiple[] m=new multiple[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("\nEnter the "+(i+1)+" student details:\n");
			m[i]=new multiple();
			m[i].getstd_data();
			m[i].getsport_data();
		}
		for(int i=0;i<n;i++)
		{
			m[i].display();
		}
	}
}
