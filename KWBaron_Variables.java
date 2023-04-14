/*Kevin Baron
10/2/12
Variables and data types*/

public class KWBaron_Variables{

	public static void main (String[] args){
	
		//declare variables
		double miles;
		double feet;
		int inches;
		
		//compute feet from miles
		miles = 6;
		feet = miles * 5280;
		
		//compute inches from feet
		inches = (int) (feet * 12);
		
		//print results
		System.out.print(miles);
		System.out.print(" miles = ");
		System.out.print(inches);
		System.out.print(" inches.");
	
	}//eoMain

}//eoClass