

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
		for (int i = 0; i < 19; i += 2) {
			int frame[] = {data[i],data[i + 1]};
			if (this.isStrike(frame)) {
				if (i == 18) {
					int extraframe[] = {data[20], data[21]};
					sum += this.lastStrikeSum(frame, extraframe);
				}else {
					int frame2[] = {data[i + 2],data[i + 3]};
					int frame3[] = {data[i + 4],data[i + 5]};
					sum += this.strikeSum(frame, frame2, frame3);
				}
			}else if (this.isSpare(frame)) {
				int frame2[] = {data[i + 2]};
				sum += this.spareSum(frame, frame2);
			}else {
				sum += this.ordinaryFrameScore(frame);
			}
		}
		return sum;
	}

	// The function isStrike
	public static boolean isStrike(int[] data) {
		return (data[0] == 10) ? true : false;
	}

	// The function strikeSum
	public static int strikeSum(int[] data1, int[] data2, int[] data3) {
		int sum = 0;
		if (data2[0] == 10) {
			sum = data1[0] + data2[0] + data3[0];
		}else {
			sum = data1[0] + data2[0] + data2[1];
		}
		return sum;
	}

	// The function isSpare
	public static boolean isSpare(int[] data) {
		return (data[0] != 10 && data[0] + data[1] == 10) ? true : false;
	}

	// The function spareSum
	public static int spareSum(int[] data1, int[] data2) {
		int sum = data1[0] + data1[1] + data2[0];
		return sum;
	}

	// The function lastStrikeSum
	public static int lastStrikeSum(int[] data1, int[] data2) {
		int sum = data1[0] + data2[0] + data2[1];
		return sum;
	}
}
