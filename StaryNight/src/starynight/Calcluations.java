package starynight;

public class Calcluations {

	public double ranking (String cityName, String windSpeed, String maxTemp, String minTemp, String descripCloud, String valueCloud, String weatherType, String airPressure)
	{
		double calculation = 0;
		int a, b, c, d, e, f, g;
		int facB=1, facC=2, facD=1, facF=1;
		int rankB=0, rankC=0, rankD=0, rankF=0;
		a = Integer.parseInt(cityName); //not needed
		b = Integer.parseInt(windSpeed); //<20, 20-40, 41-60, 60-80, 80-100
		c = Integer.parseInt(maxTemp); //<0 ,0-10, 11-20, 21-25, 26>
		d = Integer.parseInt(minTemp); //if maxTemp-minTemp>10 (subtract 1)
		e = Integer.parseInt(descripCloud); //not needed
		f = Integer.parseInt(valueCloud); //0-20, 21-40, 41-60, 61-80, 81-100
		g = Integer.parseInt(weatherType);//not needed
		
		/*
		 * Wind Speed
		 */
		if (b<20)
		{
			rankB=4;
		}
		else if (b>=20 && b<40)
		{
			rankB=3;	
		}
		else if (b>=40 && b<60)
		{
			rankB=2;	
		}
		else if (b>=60 && b<80)
		{
			rankB=1;	
		}
		else if (b>=80)
		{
			rankB=0;	
		}
		
		rankB=facB*rankB;
		
		/*
		 * Temp
		 */
		if (c<0)
		{
			rankC=0;
		}
		else if (c>=0 && c<10)
		{
			rankC=1;	
		}
		else if (c>=10 && c<15)
		{
			rankC=2;
		}
		else if (c>=15 && c<20)
		{
			rankC=3;	
		}
		else if (c>=20 && c<25)
		{
			rankC=4;	
		}
		else if (c>=25)
		{
			rankC=3;	
		}
		
		if (d-c>10)
		{
			rankC--;
		}
		rankC=facC*rankC;
		
		/*
		 * Cloud Cover Value
		 */
		if (f<20)
		{
			rankF=4;
		}
		else if (f>=20 && f<40)
		{
			rankF=3;	
		}
		else if (f>=40 && f<60)
		{
			rankF=2;	
		}
		else if (f>=60 && f<80)
		{
			rankF=1;	
		}
		else if (f>=80)
		{
			rankF=0;	
		}
		rankF=facF*rankF;
		
		calculation = (rankB+rankC+rankF)/16;
		return calculation;
	}

}
