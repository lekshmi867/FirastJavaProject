package encapsulation;

public class CourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseDetails btech = new CourseDetails("Computer science", 4, "CS101");
		
		
		System.out.println(btech.getCourseCode());
		System.out.println(btech.getSubject());
		System.out.println(btech.getYears());
		
		btech.setCourseCode("CS201","admin123", "password123");
		System.out.println(btech.getSubject());
		System.out.println(btech.getYears());
		System.out.println(btech.getCourseCode());

	}

}
