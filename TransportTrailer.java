package run;

public abstract class TransportTrailer extends Transport
{
	private Trailer trailer;

	protected TransportTrailer(String mark, String model, double maxmas, int kol, double maxspeed,Trailer trailer)
	{
		super(mark, model, maxmas, kol, maxspeed);
		this.trailer = trailer;
		
	}
//+ ���� �������(���?)
	
	
	public double GetMaxspeed() 	//��� ������ ������ ���������� �� ���������
	{
	if (trailer != null)
		maxspeed = maxspeed -20;
	                                     //set
	return maxspeed;
	}
	
	public double GetControlMas() 		
	{ 
	if (trailer != null) 
		maxmas = maxmas + trailer.mastrailer;
	return maxmas;
	}
}

