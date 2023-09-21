public class MathCalc {
	
	public static void main(String[] args) {
		
			//diameters of sun and earth
			double diameter_miles_sun = 865000.0d;
			double diameter_miles_earth = 7600.0d;
				
			//calculate radius of sun and earth 
			double radius_miles_sun = diameter_miles_sun / 2;
			double radius_miles_earth = diameter_miles_earth / 2;
				
			//calculate volumes of sun and earth
			double volume_of_sun = 4 * Math.PI * Math.pow(radius_miles_sun, 3) / 3;
			double volume_of_earth = 4 * Math.PI * Math.pow(radius_miles_earth, 3) / 3;
				
			//calculate ratio of the volume of the sun to the volume of the earth 
			double volume_ratio = volume_of_sun / volume_of_earth;
				
			System.out.println("The volume of the Earth is " + volume_of_earth + " cubic miles, the volume of the sun is "+ volume_of_sun + " cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is " + volume_ratio + ".");
		
    }

}
