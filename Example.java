package run;

public class Example 
{

public static void main(String[] args) 
	{
    	Transport tr1 = new Automobil("марка1","модель1",44.7,5,90);
    	Transport tr2 = new Bus("марка2","модель2",66.3,3,40);
    
    tr1.Info();
    tr2.Info();
	}

}