package quiztwo;

public class Main {

	public static void main(String[] args) {
		Vector3D p= new Vector3D(4,6,-2);
		Vector3D q=new Vector3D(-1,3,4);
		System.out.println(p.toString());
		System.out.println(q.toString());
		
		System.out.print("\n");
		
		System.out.println(p.add(q));
		System.out.println(p.sub(q));
		System.out.println(p.scalarMultiple(-2));
		
		System.out.print("\n");
		
		System.out.println(p.dot(q));
		System.out.println(p.distance(q));
		System.out.println(q.norm());

	}

}
