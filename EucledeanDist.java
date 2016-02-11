import java.awt.Point;


public class Tools {
	
	public double eucledeanDistance(Point a, Point b)
	{
		double p1 = ( a.x - b.x ) * ( a.x - b.x ) ;
		double p2 = ( a.y - b.y ) * ( a.y - b.y ) ;
		
		return Math.sqrt(p1 + p2);
	}
	
	public double[] calculateED(Warehouse[] warehouses, Point p)
	{
		double[] euclDistances = new double[warehouses.lenght()] ;
		for (int i = 0; i < warehouses.length(); i++)
		{
			Point warehouseLoc = warehouses[i].getLoc() ;
			euclDistances[i] = eucledeanDistance(p, warehouseLoc) ;
		}
		return euclDistances ;
	}

}
