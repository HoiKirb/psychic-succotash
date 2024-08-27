package kirb.chaoticneutral;

public class Utilities {
	private static int curr_id = 20000;

	public static int nextID(){
		return curr_id++;
	}
}
