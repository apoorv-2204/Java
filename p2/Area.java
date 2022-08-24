package pack1;
public class Area
{  	
	protected double l,b;
	public Area()
	{
	l=b=0;	
	}
	public Area(double l,double b)
	{
		this.l=l;
		this.b=b;	
	}
	 
        public void output()
        {
			System.out.println("l= "+ l+"b= "+b);
	}
	public double A()
	{
		return l*b;
	}
}