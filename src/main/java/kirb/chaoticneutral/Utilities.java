package kirb.chaoticneutral;

public class Utilities {
	private static int curr_item_id = 20000;
	private static int curr_block_id = 4600;

	// Mod Items ID generation (automatically creates a valid item id without worrying about it)
	public static int nextItemID(){
		return curr_item_id++;
	}
	public static int nextBlockID(){
		return curr_block_id++;
	}
}
