package run;
//�������
public class Bus extends Transport
{
	// �������� ����������� ������������� ������
	protected Bus(String mark, String model, double maxmas, int kol, double maxspeed)
	{
		super(mark, model, maxmas, kol, maxspeed);
	}
	protected int kolfloor;//���������� ������
	protected double height;
	//protected int addmirror;?
	
	public int GetKolfloor()	{ return kolfloor;}
	public double GetHeight()	{ return height;}
	
	public void SetKolfloor(int kolfloor)	{this.kolfloor = kolfloor;}
	public void SetHeight(double height)	{this.height = height;}


public String toString() 
	{
		//�������� ���������� ������������� ������
	return "����� ������� ����� ��������� ��������:\t "+super.toString() + "\t" ;
	}
}
