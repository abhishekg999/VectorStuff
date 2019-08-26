package idk;
import java.text.DecimalFormat;

public class Vector{
	private double magnitude;
	private double direction;
	private double x;
	private double y;

	public Vector(){
		this(0, 0);
	}
	public Vector(double m, double d){
		magnitude = m;
		direction = d;
		x = magnitude*Math.cos(Math.toRadians(d));
		y = magnitude*Math.sin(Math.toRadians(d));		
	}

	private static double abc(double a, double b){
		return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
	}

	private static double calcdir(double a, double b){
		return Math.toDegrees(Math.atan(b/a));
	}

	public static Vector add(Vector... vectors){
		double tempX = 0;
		double tempY = 0;
		double tempMag;
		double tempDir;
		Vector tempVector;
		for (Vector v: vectors){
			tempX += v.getX();
			tempY += v.getY();
		}

		tempMag = abc(tempX, tempY);
		tempDir = calcdir(tempX, tempY);

		if(tempY < 0 && tempX < 0){
			tempDir	+= 180;
		}	
		
		tempVector = new Vector(tempMag, tempDir);
		return tempVector;
	}

	public static Vector vminus(Vector v){
		return new Vector(-v.getMagnitude(), v.getDirection());
	}

	public double getMagnitude(){
		return magnitude;
	}

	public double getDirection(){
		return direction;
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public String toString(){
		DecimalFormat df = new DecimalFormat("###,###,###,###.###");
		return df.format(magnitude) + " @ " + df.format(direction);
	}
}