
public class OntarioLicenseAuthority {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ageOfPerson = 16;
		String currentLevel ="G";
		
		
		if (ageOfPerson>=16) {
			if(currentLevel=="NA") {
				System.out.println("Lisense can be issued with class G1");
			}
			else if(currentLevel=="G1") {
				System.out.println("Lisense can be issued with class G2");
			}
			else if(currentLevel=="G2") {
				System.out.println("Lisense can be issued with class G");
			}
			else if(currentLevel=="G")
			{
				System.out.println("Already have a license with class G !!!!");	
			}
			else 
			{
				System.out.println("Invalid option");
			}
			
		}
		else
		{
			System.out.println("You are not eligible to take license");
		}


	}

}
