package kirb.chaoticneutral;

public class Utilities {
	private static int curr_id = 20000;

	// Mod Items ID generation (automatically creates a valid item id without worrying about it)
	public static int nextID(){
		return curr_id++;
	}
}
