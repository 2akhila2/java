import java.util.*;
public class matrix
{
	public static void main(String args[])
	{
		int a[][]=new int[20][20];
		int b[][]=new int[20][20];
		int c[][]=new int[20][20];
		int i,j,r1,c1,r2,c2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row of 1st matrix");
		r1=sc.nextInt();
		System.out.println("enter the coloumn of 1st matrix");
		c1=sc.nextInt();
		System.out.println("enter the elements of 1st matrix");
		for(i=0;i<r1;i++)
		{
		for(j=0;j<c1;j++)
		{
		a[i][j]=sc.nextInt();
		}
		}
		System.out.println("enter the row of 2nd matrix");
		r2=sc.nextInt();
		System.out.println("enter the coloumn of 2nd matrix");
		c2=sc.nextInt();
		System.out.println("enter the elements of 2nd matrix");
		for(i=0;i<r2;i++)
		{
		for(j=0;j<c2;j++)
		{
		b[i][j]=sc.nextInt();
		}
		}
		for(i=0;i<r2;i++)
		{
		for(j=0;j<c2;j++)
		{
		c[i][j]=a[i][j]+b[i][j];
		}
		}
		System.out.println("sum of matrix is");
		for(i=0;i<r2;i++)
		{
		for(j=0;j<c2;j++)
		{
		System.out.print(c[i][j]+" ");
		}
		System.out.println();
		
		}
	}
}
