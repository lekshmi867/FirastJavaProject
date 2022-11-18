package assignmentMajorProject;


public class R2 extends Rocket{
	private int cost = 120;
	public R2() {
		super(11000);
	}
	
	@Override
	public int getCost() {
		return cost;
	}

	@Override
	public boolean launch() {
		double lauchExplosion = 0.04*(getTotalWeight()/getMaximumWeight());
		return lauchExplosion<=getRandomNumber();
	}

	@Override
	public boolean land() {
		double landingCrash = 0.08*(getTotalWeight()/getMaximumWeight());
		return landingCrash<=getRandomNumber();
	}
}
