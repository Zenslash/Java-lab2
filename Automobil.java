package run;

public class Automobil extends TransportTrailer
{
	// �������� ����������� ������������� ������
	protected Automobil(String mark, String model, double maxmas, int kol, double maxspeed)
	{
		super(mark, model, maxmas, kol, maxspeed);// ���� ��������� trailer
	}
	//protected boolean trailer;?
	protected boolean insurance;//���������
	
	public boolean GetInsurance()				{ return insurance;}
	
	public void SetInsurance(boolean insurance)	{this.insurance = insurance;}

	
public String toString() 
	{
		//�������� ���������� ������������� ������
	return "����� ���������� ����� ��������� ��������\t "+super.toString() + "\t" ;
	}
}