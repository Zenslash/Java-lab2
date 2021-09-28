package run;

public abstract class TransportTrailer extends Transport
{
	protected Trailer trailer;

	public TransportTrailer(String mark, String model, double maxmas, int kol, double maxspeed,Trailer trailer)
	{
		super(mark, model, maxmas, kol, maxspeed);
		this.trailer = trailer;
		
	}
	
	
	public double GetMaxspeed() 	
	{
		double result = maxspeed;
		if (trailer != null)
			result -= 20;

		return result;
	}
	
	public double GetControlMas() 		
	{ 
		double  result = maxmas;
		if (trailer != null) 
			result += trailer.mastrailer;
		return result;
	}
	//----------------------------------------------------------------
	public String toString() 
	{
		return "example   "+ super.toString() + "\t" + this.GetMaxspeed() + "\t" ;
	}
}

