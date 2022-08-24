package pack3;
import pack2.Volume;
public class Density extends Volume
{
  protected double m;

	public Density()
	{
		m=1;	
	}
	public Density(double l,double b,double h,double m)
	{
		super(l,b,h);
		this.m=m;	
	}
	 
        public void output()
        {
		super.output();
			System.out.println("m ="+m);
	}
	public double D()
	{
		return m/V();
	}
}