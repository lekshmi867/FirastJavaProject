package encapsulation;

public class CourseDetails {
	
	private String subject;
	private int years;
	private String courseCode;
	private String adminUserName = "admin123";
	private String adminPassword ="password123";
	
	public CourseDetails(String sub, int yrs, String crsecode) {
		subject = sub;
		years = yrs;
		courseCode = crsecode;
	}

	public String getSubject() {
		return subject;
	}

	public int getYears() {
		return years;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String crseCode, String adminUsrName, String adminPswd) {
		if((adminUserName.equalsIgnoreCase(adminUsrName))&&(adminPassword==adminPswd)) {
			courseCode = crseCode;
		}else
		{
			System.out.println("Username and passord doesnot match");
		}
	}
	
	
	
	
	
	

}
