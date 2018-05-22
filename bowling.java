

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
	public int gameScore(int[] data) {
		int sum = 0;
		for (int i = 0; i < data.length - 1; i += 2) {
			int frame[] = {data[i],data[i + 1]};
			sum += this.ordinaryFrameScore(frame);
		}
		/*for (int i = 0; i < data.length; i++) {
			if (i % 2 == 1) {
				b = data[i];
				int frame[] = {a,b};
				sum += this.ordinaryFrameScore(frame);
			}else {
				a = data[i];
			}
		}*/
		return sum;
	}

	// The function isStrike
	public static boolean isStrike(int[] data) {
		return (data[0] == 10) ? true : false;
	}

	// The function strikeSum
	public static int strikeSum(int[] data1, int[] data2) {
		int sum = data1[0] + data2[0] + data2[1];
		return sum;
	}
}
