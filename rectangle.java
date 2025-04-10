package graphics;
public class  rectangle implements figure{
public int l,b;
public rectangle(int l,int b){
this.l=l;
this.b=b;
}
public double area(){
return l*b;
}
}
