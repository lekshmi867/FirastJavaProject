/*There is a water tank of capacity 100 litres.
 *Water is filled into it using a bucket which has a capacity of 10 litres. 
 * Write a program which fills the tank to its capacity using these buckets. 
 *Also include a mechanism in your program to stop the tank from overflowing.
*/

package loopsAssignment;

public class WaterTank {

	public static void main(String[] args) {
		int waterLevel = 0;
		int waterInBucket = 10;

		for (int i = 1; i < 20; i++) {

			waterLevel = waterLevel + waterInBucket;
			System.out.println("Level of water =" + waterLevel + "litres");

			if (waterLevel == 100) {
				System.out.println("Tank has reached the maximum capacity");
				break;
			}
		}
		System.out.println("Level of water in the tank  = " + waterLevel);
	}

}
