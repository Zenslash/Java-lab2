package run;

public class Automobil extends TransportTrailer
{
	// вызываем конструктор родительского класса
	protected Automobil(String mark, String model, double maxmas, int kol, double maxspeed, Trailer trailer)
	{
		super(mark, model, maxmas, kol, maxspeed, trailer);
	}
	
	protected boolean insurance;//страховка
	
	public boolean GetInsurance()				{ return insurance;}
	
	public void SetInsurance(boolean insurance)	{this.insurance = insurance;}

	
public String toString() 
	{
		//вызываем реализацию родительского класса
	return "Класс автомобиль имеет следующие свойства\n "+super.toString() + "\t" + insurance + "\n";
	}
}
