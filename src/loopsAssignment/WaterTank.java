/*There is a water tank of capacity 100 litres.Water is filled into it using a bucket which has a capacity of 10 litres.  Write a program which fills the tank to its capacity using these buckets. 
 *Also include a mechanism in your program to stop the tank from overflowing.
*/

package loopsAssignment;

public class WaterTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int waterLevel = 26;
		int waterInBucket = 10;
		int tankMaxCapacity = 100;

		while (waterLevel < tankMaxCapacity) {
			if (waterLevel >= 97) {
				System.out.println("Tank almost reached the maximum capacity");
				break;
			} else if ((waterLevel + waterInBucket) >= tankMaxCapacity) {
				System.out.println("If you add more water tank will overflow");
				break;
			} else {
				waterLevel = waterLevel + waterInBucket;
				System.out.println("Current level of water in tank is "+waterLevel);
			}

		}

		System.out.println("The level of water in tank is " + waterLevel);
	}

}
