package graphics;
public class circle implements figure{
public double r;
public circle(double r)
{
this.r=r;
}
public double area()
{
return 3.14*r*r;
}
}
