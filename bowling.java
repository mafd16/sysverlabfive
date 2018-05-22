

public class bowling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //System.out.print("Started");
	}

	// The function bowling
	public void bowl (Object[] data) {

	}


	// The function Shellsort
	public void Shellsort (Object[] data) {
		int i, j, k, h, hCnt, increments[] = new int[20];
		// create an appropriate number of increments h
		for (h = 1, i = 0; h < data.length; i++) {
			System.out.println( "Yes from 3" );
			increments[i] = h;
			h = 3*h + 1;
		}
		System.out.println( "No from 3" );
		// loop on the number of different increments h
		for (i--; i >= 0; i--) {
			h = increments[i];
			// loop on the number of subarrays h-sorted in ith pass
			for (hCnt = h; hCnt < 2*h; hCnt++) {
				System.out.println( "Yes from 9" );
				// insertion sort for subarray containing every hth element
				// of array data
				for (j = hCnt; j < data.length; ) {
					System.out.println( "Yes from 11" );
					Comparable tmp = (Comparable)data[j];
					k = j;
					while (k-h >= 0 && tmp.compareTo(data[k-h]) < 0) {
						System.out.println( "Yes from 14" );
						data[k] = data[k-h];
						k -= h;
					}
					System.out.println( "No from 14" );
					data[k] = tmp;
					j += h;
				}
				System.out.println( "No from 11" );
			}
			System.out.println( "No from 9" );
		}
	}
}
