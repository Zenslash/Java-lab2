package run;
//������
public class Trailer extends Transport
{
	// �������� ����������� ������������� ������
	protected Trailer(String mark, String model, double maxmas, int kol, double maxspeed)
	{
		super(mark, model, maxmas, kol, maxspeed);
	}
	protected double mastrailer;
	protected double heightload;//������ �����
	
	public double GetMastrailer()	{ return mastrailer;}
	public double GetHeightload()	{ return heightload;}
	
	public void SetMastrailer(double mastrailer)	{this.mastrailer = mastrailer;}
	public void SetHeightload(double heightload)	{this.heightload = heightload;}

public String toString() 
	{
		//�������� ���������� ������������� ������
	return "����� ������� ����� ��������� �������� \t"+super.toString() + "\t" ;
	}
}

