package graphics;
public class triangle implements figure{
public int b,h;
public triangle(int b,int h)
{
this.b=b;
this.h=h;
}
public double area()
{
return 0.5*b*h;
}
}
