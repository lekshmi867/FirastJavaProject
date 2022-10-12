package methods;

public class LicenceCategory {

	String licenceType(String currentLicense) {
		String licenseTobeApplied;
		if(currentLicense.equals("No license")) {
			licenseTobeApplied = "G1";
		}else if(currentLicense.equals("G1")) {
			licenseTobeApplied = "G2"; 
		}else
		{
			licenseTobeApplied ="Already have a license";
		}
		return licenseTobeApplied;
		
	}
}
