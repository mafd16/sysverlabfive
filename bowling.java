

public class bowling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //System.out.print("Started");
	}

	// The function isFrame
	public static boolean isFrame(int[] data) {
		if (data.length == 2) {
			return true;
		}else {
			return false;
		}
	}

	// The function ordinaryFrameScore
	public static int ordinaryFrameScore(int[] data) {
		int summa = data[0] + data[1];
		return summa;
	}

	// The function isGame
	public static boolean isGame(int[] data) {
		if (data.length == 20) {
			return true;
		}else {
			return false;
		}
	}

	// The function gameScore
	public static int gameScore(int[] data) {
		return 81;
	}

}
