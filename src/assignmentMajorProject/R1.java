package assignmentMajorProject;

public class R1 extends Rocket{
	private int cost = 100;
	
	@Override
	public int getCost() {
		return cost;
	}

	public R1() {
		super(8000);
	}

	@Override
	public boolean launch() {
		double lauchExplosion = 0.05*(getTotalWeight()/getMaximumWeight());
		return lauchExplosion<=getRandomNumber();
	}

	@Override
	public boolean land() {
		double landingCrash = 0.01*(getTotalWeight()/getMaximumWeight());
		return landingCrash<=getRandomNumber();
	}
}
