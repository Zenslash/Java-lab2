package run;
//��������
public class Truck extends TransportTrailer
{
	// �������� ����������� ������������� ������
	protected Truck(String mark, String model, double maxmas, int kol, double maxspeed)
	{
		super(mark, model, maxmas, kol, maxspeed);
	}
	protected int kolwheels;//���������� �����
	protected double heightload;
	protected double lengthload;
	
	public int GetKolwheels()		{ return kolwheels;}
	public double GetHeightload()	{ return heightload;}
	public double GetLengthload()	{ return lengthload;}
	
	public void SetKolwheels(int kolwheels)			{this.kolwheels = kolwheels;}
	public void SetHeightload(double heightload)	{this.heightload = heightload;}
	public void SetLengthload(double lengthload)	{this.lengthload = lengthload;}

public String toString() 
	{
		//�������� ���������� ������������� ������
	return "����� �������� ����� ��������� ��������\t "+super.toString() + "\t" ;
	}
}

