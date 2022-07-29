package quiztwo;

public class Vector3D {
	private double a;
	private double b;
	private double c;
	
	public Vector3D() {
		this.a=0;
		this.b=0;
		this.c=0;
	}
	public Vector3D(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	
	public Vector3D add(Vector3D v) {
		return new Vector3D(this.a+v.a,this.b+v.b,this.c+v.c);
	}
	public Vector3D sub(Vector3D v) {
		return new Vector3D(this.a-v.a,this.b-v.b,this.c-v.c);
	}
	public Vector3D scalarMultiple(double x) {
		return new Vector3D(a*x,b*x,c*x);
	}
	public double dot(Vector3D x) {
		return this.a*x.a+this.b*x.b+this.c*x.c;
	}
	public double norm() {
		return Math.sqrt(Math.pow(this.a, 2)+Math.pow(this.b, 2)+Math.pow(c, 2));
	}
	public double distance(Vector3D v) {
		return Math.sqrt(Math.pow(this.a-v.a, 2)+Math.pow(this.b-v.b, 2)+Math.pow(this.c-v.c, 2));
	}
	public String toString() {
		return "("+this.a+","+this.b+","+this.c+")";
	}
	
	

}
