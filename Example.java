package run;

public class Example 
{

public static void main(String[] args) 
	{
    	Transport tr1 = new Automobil("марка1", "модель1",44.7, 5, 90.5, null);
    	Transport tr2 = new Bus("марка2", "модель2", 66.3, 3, 40);
    	Transport tr3 = new Trailer("марка3", "модель3",66.3, 3, 40, 34.5, 34.5);
    	//Transport tr4 = new Automobil("марка1", "модель1",44.7, 5, 90.5, trailer);
    
    tr1.Info();
    tr2.Info();
    tr3.Info();
    //tr4.Info();
	}

}