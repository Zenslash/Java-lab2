package run;

public class Motorcycle extends Transport
{
	// вызываем конструктор родительского класса
	protected Motorcycle(String mark, String model, double maxmas, int kol, double maxspeed)
	{
		super(mark, model, maxmas, kol, maxspeed);
	}
	
	protected boolean carriage;//коляска
	protected String type;// scooter, bike, samokat

	public boolean GetCarriage()	{ return carriage;}
	public String GetType()			{ return type;}
	
	public void SetCarriage(boolean carriage)		{ this.carriage = carriage;}
	public void SetType(String type)				{ this.type = type;}
	
public String toString() 
	{
		//вызываем реализацию родительского класса
	return "Класс автомобиль имеет следующие свойства "+super.toString() + "\t" ;
	}
}

