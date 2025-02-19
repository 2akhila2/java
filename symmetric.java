import java.util.*;
public class symmetric{
public static void main(String args[])
{
int i,r,j;
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
System.out.println("Symmetric or not\n enter the row and col no of the matrix :");
int c;
r=sc.nextInt();
c=sc.nextInt();
System.out.println("enter the matrix :");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}}
System.out.println("the matrix is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}System.out.println();}
boolean isSym=true;

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{if(a[i][j]!=a[j][i])
{
isSym=false;
break;
}}if(!isSym){break;}}
if(isSym)
{
System.out.println("matrix is symmetric");
}
else
{
System.out.println("matrix is not symmetric");
}sc.close();
}
}
