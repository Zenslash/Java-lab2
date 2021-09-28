package run;

public class Automobil extends TransportTrailer
{
	// вызываем конструктор родительского класса
	protected Automobil(String mark, String model, double maxmas, int kol, double maxspeed)
	{
		super(mark, model, maxmas, kol, maxspeed);// надо запихнуть trailer
	}
	//protected boolean trailer;?
	protected boolean insurance;//страховка
	
	public boolean GetInsurance()				{ return insurance;}
	
	public void SetInsurance(boolean insurance)	{this.insurance = insurance;}

	
public String toString() 
	{
		//вызываем реализацию родительского класса
	return "Класс автомобиль имеет следующие свойства\t "+super.toString() + "\t" ;
	}
}
