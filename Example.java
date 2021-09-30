package run;

public class Example 
{

public static void main(String[] args) 
	{
    	Automobil tr1 = new Automobil("ìàðêà1", "ìîäåëü1",44.7, 5, 90.5, null);
    	Bus tr2 = new Bus("ìàðêà2", "ìîäåëü2", 66.3, 3, 40);
    	Trailer tr3 = new Trailer("ìàðêà3", "ìîäåëü3",66.3, 3, 40, 34.5, 34.5);
    	//Automobil tr4 = new Automobil("ìàðêà1", "ìîäåëü1",44.7, 5, 90.5, trailer);
    
    tr1.Info();
    tr2.Info();
    tr3.Info();
    //tr4.Info();
	}

}
