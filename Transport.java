package run;
/*
 * Разработать иерархию классов – транспортных средств: мотоцикл, автомобиль,
грузовик, автобус, прицеп. У объектов – ТС имеются следующие свойства:
марка, модель, максимальная допустимая масса перевозимого груза, кол-во
пассажиров, максимальная скорость.
 */
public abstract class Transport
{
	protected String mark;
	protected String model;
	protected double maxmas;
	protected int kol;
	protected double maxspeed;
	
	public String GetMark()			{ return mark; }
	public String GetModel()		{ return model; }
	public double GetMaxmas() 		{ return maxmas;}
	public int GetKol() 			{return kol;}
	public double GetMaxspeed() 	{return maxspeed;}
	
	
	public void SetMark(String mark) 				{this.mark = mark;}
	public void SetModel(String model) 				{this.model = model;}
	public void SetMaxmas(double maxmas) 			{this.maxmas = maxmas;}
	public void SetKol(int kol)						{this.kol = kol;}
	public void SetMaxspeed(double maxspeed) 		{this.maxspeed = maxspeed;}

protected Transport(String mark, String model, double maxmas, int kol, double maxspeed ) 
{
	this.mark = mark;
	this.model = model;
	this.maxmas = maxmas;
	this.kol = kol;
	this.maxspeed = maxspeed;
}

//переопределим метод toString
public String toString() 
	{
		return mark + "\t" + model + "\t" + maxmas + "\t" + kol + "\t" + maxspeed;
	}
public void Info()
	{
	    System.out.println( toString() + "\t"  );

	}

}

