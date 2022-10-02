
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float length = 10.5f;
		float breadth = 20.5f;
		
		
		float perimeterOfRectangle = 2*(length+breadth);
		float areaOfRectangle = length * breadth;
		
		System.out.println("***********************************************************\n");
		System.out.printf("The perimeter of the rectangle is : %.2f \n",+perimeterOfRectangle);
		System.out.printf("The area of the rectangle is : %.2f \n",+areaOfRectangle);
		System.out.println("***********************************************************\n");
	}

}
