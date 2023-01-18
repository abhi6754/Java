import java.util.ArrayList;

class Test{
	int x,y;
}
class Test1 implements Cloneable{
	int a;
	int b;
	Test c=new Test();
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
         Test1 t=new Test1();
         t.a=10;
         t.b=20;
         t.c.x=50;
         t.c.y=80;
         Test1 t1=(Test1)t.clone();
         t1.a=200;
         t1.c.x=500;
         System.out.println(t.a+"  "+t.b+" "+t.c.x+" "+t.c.y);
         System.out.println(t1.a+"  "+t1.b+" "+t1.c.x+" "+t1.c.y);
	}

}
