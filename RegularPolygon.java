
public class RegularPolygon
{
	//Private INSTANCE VARIABLES
	private double myNumSides;    // # sides, "double" avoids typecasting in formulas
	private double mySideLength;  // length of each side
	private double myR;           // radius of circumscribed (outside) circle
	private double myr;           // radius of inscribed (inside) circle

	//Public CONSTRUCTOR methods
	public RegularPolygon()
	public RegularPolygon(int numSides, double sideLength)
	public RegularPolygon(RegularPolygon OtherPolygon)
	
	//Private HELPER methods, help other public methods
	private double calcR()
	private double calcr()

	//Public MUTATOR methods
	public double vertexAngle()
	public double perimeter()
	public double area()
		
	//Public ACCESSOR methods
	public int getNumSides()
	public double getSideLength()
	public double getR()
	public double getr()
	
	//Public print method, makes the tester shorter by having a built in print method
	public void printPolygon()
}










