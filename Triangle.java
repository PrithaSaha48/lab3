
public class Triangle {
private	 int x;
	private int y;
	private int z;
		public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	 
	public void showinfo() {
		System.out.println(x + " : " + y +" : " + z);
	}

 public void TriangleTest() {
	 if(x==y&&y==z) {
		 System.out.println("eqilateral");
	 }
	 else if (x==y&& y!=z) {
		 System.out.println("isosleses");
	 }
	 else if(x !=y && y==z) {
		 System.out.println("isosceles");
	 }
	 else {
		 System.out.println("scalene");
	 }
	 
 }
 
}

 
	

	
	

	
