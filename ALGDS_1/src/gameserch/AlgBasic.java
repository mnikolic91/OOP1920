package gameserch;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class AlgBasic {

	public static int[] generateArray(int size, int bottom, int upper) {

		int[] arr = new int[size];
		for (int k = 0; k < size; k++) {
			arr[k] = ThreadLocalRandom.current().nextInt(bottom, upper + 1);
		}

		return arr;
	}

	public static SearchRslt isValueInArray(int val, int[] arr) {
		Arrays.sort(arr);
		int indx = Arrays.binarySearch(arr, val);
		SearchRslt srchRes;
		if (indx >= 0) {
			srchRes = new SearchRslt(indx, val);

		} else {
			srchRes = new SearchRslt(val);
		}

		return srchRes;

	}
}
