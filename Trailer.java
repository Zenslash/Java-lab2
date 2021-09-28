package run;
//прицеп
public class Trailer extends Transport
{
	// вызываем конструктор родительского класса
	protected Trailer(String mark, String model, double maxmas, int kol, double maxspeed)
	{
		super(mark, model, maxmas, kol, maxspeed);
	}
	protected double mastrailer;
	protected double heightload;//высота груза
	
	public double GetMastrailer()	{ return mastrailer;}
	public double GetHeightload()	{ return heightload;}
	
	public void SetMastrailer(double mastrailer)	{this.mastrailer = mastrailer;}
	public void SetHeightload(double heightload)	{this.heightload = heightload;}

public String toString() 
	{
		//вызываем реализацию родительского класса
	return "Класс трейлер имеет следующие свойства \t"+super.toString() + "\t" ;
	}
}

