/*Create a class Box that uses a parameterized constructor to
 *  initialize the dimensions of a box.The dimensions of the 
 *  Box are width, height, depth. The class should have a method
 *   that can return the volume of the box. Create an object of the
 *    Box class and test the functionalities.*/

class box{
		private double height;
		private double width;
		private double depth;
		box(double height,double depth,double width){
			this.height=height;
			this.width=width;
			this.depth=depth;
		}
		public double getVolume() {
			return height*width*depth;
		}
}
public class BoxVolume {
	
	
	
	

	public static void main(String[] args) {
		box rectangle=new box(10,20,25);
		System.out.println(rectangle.getVolume());
		

	}

}
