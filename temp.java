import idk.Vector;
import static idk.Vector.vminus;
import static idk.printFunction.print;
public class temp{
	public static void main(String[] args){
		Vector a = new Vector(20, 30);
		Vector b = new Vector(15, 240);
		Vector c = new Vector(25, 180);
		print(Vector.add(a,b,c));

		Vector d = new Vector(30, 40);
		Vector e = new Vector(-20, 30);
		print(Vector.add(d,e));
		
		Vector f = new Vector(20, 30);
		print(Vector.add(d,vminus(f)));


	}
}

