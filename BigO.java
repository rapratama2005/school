
public class BigO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upToIndex = 100;
		int repeat = 10000;
		int randomMin = 0;
		int randomMax = 1000;
		Sorts s = new Sorts();
		
		//Best Case
		long[] bestCase = new long[upToIndex];
		for (int i = 1; i <= bestCase.length; i++) {
			int[] testArr = new int[i];
			for (int j = 0; j < testArr.length ; j++) {
				testArr[j] = j;
			}
			long[] allTimes = new long[repeat];
			for (int j = 0; j < repeat; j++) {
				long start = System.nanoTime();
				s.mergeSort(testArr);
				long time = elapsedTime(start);
				allTimes[j] = time;
			}
			bestCase[i-1] = avgTime(allTimes);
		}
		//System.out.println(ArrToString2(bestCase));
		
		//Worst Case
		long[] worstCase = new long[upToIndex];
		for (int i = 1; i <= worstCase.length; i++) {
			int[] testArr = new int[i];
			for (int j = 0; j < testArr.length ; j++) {
				testArr[j] = testArr.length - j;
			}
			long[] allTimes = new long[repeat];
			for (int j = 0; j < repeat; j++) {
				long start = System.nanoTime();
				s.mergeSort(testArr);
				long time = elapsedTime(start);
				allTimes[j] = time;
			}
			worstCase[i-1] = avgTime(allTimes);
		}
		//System.out.println(ArrToString2(worstCase));
		
		//Random Case
		long[] randomCase = new long[upToIndex];
		for (int i = 1; i <= randomCase.length; i++) {
			int[] testArr = new int[i];
			for (int j = 0; j < testArr.length ; j++) {
				testArr[j] = randomInt(randomMin, randomMax);
			}
			long[] allTimes = new long[repeat];
			for (int j = 0; j < repeat; j++) {
				long start = System.nanoTime();
				s.mergeSort(testArr);
				long time = elapsedTime(start);
				allTimes[j] = time;
			}
			randomCase[i-1] = avgTime(allTimes);
		}
		//System.out.println(ArrToString2(randomCase));
		
		//Format Stats
		System.out.printf("Index (%5d) | Best  | Worst | Random (%d to %5d)\n", upToIndex, randomMin, randomMax);
		for (int i = 0; i < upToIndex; i++) {
			System.out.printf("%13d | %5d | %5d | %5d\n", i, bestCase[i], worstCase[i], randomCase[i]);
		}
		
		System.out.println(checkConstant(bestCase));
		System.out.println(checkConstant(worstCase));
		System.out.println(checkConstant(randomCase));
		
		//equations
		
	}
	public static long elapsedTime(long start) {
		long now = System.nanoTime();
		return (now - start);
	}
	
	public static String ArrToString(int[] arr) {
		String j = "[ ";
		for (int i: arr) {
			j+=(i + " ");
		}
		return j + "]";
	}
	
	public static String ArrToString2(long[] arr) {
		String j = "[ ";
		for (long i: arr) {
			j+=(i + " ");
		}
		return j + "]";
	}
	
	public static long avgTime(long[] arr) {
		long j = 0;
		for (long i: arr) {
			j+=i;
		}
		return j/arr.length;
	}
	
	public static int randomInt(int min, int max){//picks random int
	      return (int) (Math.random()*(max-min+1))+min;
	  }
	
	public static double checkConstant(long[] arr) {
		double avgDiff = 0;
		for (int i = 1; i < arr.length; i++) {
			avgDiff = (avgDiff + (arr[i] - arr[i-1]))/i;
		}
		return avgDiff;
	}
}
