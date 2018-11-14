package math;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] testArray = {"a"};
		//Coordinate[] coArray = new Coordinate[6];
		//Coordinate[] coArray = new Coordinate[] {new Coordinate(1.1, 2.2)};
		Coordinate[] coArray = {new Coordinate(1.1, 2.2), new Coordinate(1.1, 3.2),
				new Coordinate(3.1, 3.2), new Coordinate(3.1, 5.2), 
				new Coordinate(6.1, 5.2), new Coordinate(6.1, 2.2)};
		Polygon p = new Polygon(coArray);
		double perimeter = p.getPerimeter();
		System.out.println("Perimeter="+perimeter);
		Coordinate[] cos = p.getKDivid(2);
		for ( Coordinate co : cos) {
			//if ( co != null )
				System.out.println(co);
		}
		
	}

}
