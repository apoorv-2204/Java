package pack2;
import pack1.Area;
public class Volume extends Area
{
  protected double h;

	public Volume()
	{
		h=0;	
	}
	public Volume(double l,double b,double h)
	{
		super(l,b);
		this.h=h;	
	}
	 
        public void output()
        {
		super.output();
	System.out.println("h ="+h);
	}
	public double V()
	{
		return h*A();
	}
}