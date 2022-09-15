
public class BigO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upToIndex = 1000;
		int repeat = 10;
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

		// System.out.println(checkBigO(bestCase));
		// System.out.println(checkBigO(worstCase));
		// System.out.println(checkBigO(randomCase));
		
		// System.out.println(checkConstant(bestCase));
		// System.out.println(checkConstant(worstCase));
		// System.out.println(checkConstant(randomCase));

		// System.out.println(checkLinear(bestCase));
		// System.out.println(checkLinear(worstCase));
		// System.out.println(checkLinear(randomCase));

		// System.out.println(checkQuadratic(bestCase));
		// System.out.println(checkQuadratic(worstCase));
		// System.out.println(checkQuadratic(randomCase));
		
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
	/*
	public static String checkBigO(long[] arr) {
		int[] n = {10, 100, 1000, 10000};
		long[] o1 = {100, 100,100, 100};
		long[] oLog2N = {330, 660, 1000, 1330};
		long[] oN = {100, 1000, 10000, 100000};
		long[] onlog2n = {330, 6600, 100000, 1330000};
		long[] on2 = {1000, 100000, 10000000, 1000000000};
		String[] bigOs = {"O(1)","O(log2N)","O(N)","O(Nlog2N)","O(N2)"};
		double[] devs = {avgDev(arr, o1, n),avgDev(arr, oLog2N, n),avgDev(arr, oN, n),avgDev(arr, onlog2n, n),avgDev(arr, on2, n)};
		int index = 0;
		double max = devs[0];
		for (int i = 0; i < devs.length; i++){
			if (devs[i]>max){
				max = devs[i];
				index++;
			}
		}
		return bigOs[index];
	}
	
	public static long avgDev(long[] arr, long[] bigO, int[] n) {
		long totalDev = 0;
		int j=0;
		for (int i: n) {
			System.out.println(totalDev);
			try {
				totalDev += Math.abs(arr[i]-bigO[i]);
				System.out.println(totalDev);
				j++;
			} catch (Exception e) {
				
			}
		}
		System.out.println(totalDev/j);
		return totalDev/j;
	}*/

// 	public static long checkConstant(long[] arr) {
// 		long avgVal = 0;
// 		for (int i = 0; i < arr.length; i++) {
// 			avgVal += arr[i];
// 		}
// 		avgVal = avgVal/arr.length;
// 		long avgDev = 0;
// 		for (int i = 0; i < arr.length; i++) {
// 			avgDev += Math.abs(avgVal-arr[i]);
// 		}

// 		return avgDev/arr.length;
// 	}

// 	public static double checkLinear(long[] arr){
// 		//find avg rate of change
// 		long avgROT = 0;
// 		long avgX = 0;
// 		long avgY = arr[0];
// 		for (int i = 1; i < arr.length; i++) {
// 			avgROT = (avgROT + (arr[i] - arr[i-1]))/i;
// 			avgX += i;
// 			avgY += arr[i];
// 		}
// 		//find y intercept
// 		avgX = avgX/arr.length;
// 		avgY = avgY/arr.length;
// 		long b = avgY - (avgX*avgROT);
// 		System.out.println("Y = " + avgROT + "x + " + b);
// 		//find avg deviation
// 		long avgDev = 0;
// 		for (int i = 0; i < arr.length; i++) {
// 			long projected = (avgROT*arr[i])+b;
// 			avgDev = Math.abs((arr[i]-projected)/projected);
// 			//avgDev = (avgDev + Math.abs(projected-arr[i]))/(i+1);
// 		}
// 		double r2 = (double) avgDev / arr.length;

// 		return r2*r2;
// 	}

// 	public static long checkQuadratic(long[] arr){
// 		//find sums and it's powers
// 		long sumX = 0;
// 		for (int i = 1; i <= arr.length; i++){
// 			sumX += i;
// 		}
// 		System.out.println(sumX);
// 		long sumY = 0;
// 		for (int i = 1; i <= arr.length; i++){
// 			sumY += arr[i-1];
// 		}
// 		System.out.println(sumY);
// 		long sumX2 = 0;
// 		for (int i = 1; i <= arr.length; i++){
// 			sumX2 += Math.pow(i,2);
// 		}
// 		System.out.println(sumX2);
// 		long sumX3 = 0;
// 		for (int i = 1; i <= arr.length; i++){
// 			sumX3 += Math.pow(i,3);
// 		}
// 		System.out.println(sumX3);
// 		long sumX4 = 0;
// 		for (int i = 1; i <= arr.length; i++){
// 			sumX4 += Math.pow(i,4);
// 		}
// 		System.out.println(sumX4);
// 		long sumXY = 0;
// 		for (int i = 1; i < arr.length; i++){
// 			sumXY += i*arr[i-1];
// 		}
// 		System.out.println(sumXY);
// 		long sumX2Y = 0;
// 		for (int i = 1; i < arr.length; i++){
// 			sumX2Y += i*i*arr[i-1];
// 		}
// 		System.out.println(sumX2Y);
// //		Σ x x = [ Σ x 2 ] – [ ( Σ x )2 / n ] 
// 		long sumXX = sumX2 - ((sumX*2)/arr.length);
// 		//Σ x y = [ Σ x y ] – [ ( Σ x * Σ y ) / n ] 
// 		sumXY = sumXY - ((sumX*sumY)/arr.length);
// // 		Σ x x2 = [ Σ x 3 ] – [ ( Σ x 2 * Σ x ) / n ] 
// 		long sumXX2 = sumX3 - ((sumX2*sumX)/arr.length);
// // 		Σ x2 y = [ Σ x 2 y] – [ ( Σ x 2 * Σ y ) / n ] 
// 		sumX2Y = sumX2Y - ((sumX2*sumY)/arr.length);
// // 		Σ x2 x2 = [ Σ x 4 ] – [ ( Σ x 2 )2 / n ]
// 		long sumX2X2 = sumX4 - ((sumX2*2)/arr.length);

// 		//write equation
// 		//a = { [ Σ x2 y * Σ xx ] – [Σ xy * Σ xx2 ] } / { [ Σ xx * Σ x2x 2] – [Σ xx2 ]2 }
// 		long a = ((sumX2Y*sumXX) - (sumXY*sumXX2)) / ((sumXX*sumX2X2)-(sumXX2)*2);
// // 		b = { [ Σ xy * Σ x2x2 ] – [Σ x2y * Σ xx2 ] } / { [ Σ xx * Σ x2x 2] – [Σ xx2 ]2 }
// 		long b =  ((sumXY*sumX2X2)-(sumX2Y*sumXX2)/(sumXX*sumX2X2)-(sumXX2)*2);
// // 		c = [ Σ y / n ] – { b * [ Σ x / n ] } – { a * [ Σ x 2 / n ] }
// 		long c = ((sumY/arr.length)-(b*(sumX/arr.length)-(a*(sumX2/arr.length))));
// 		System.out.println("y = " + a + "x^2 + " + b + "x + " + c);
// 		return sumX;
//	}

	/* The equation used in quadratic regression is as follows: 

y = ax2 + bx + c

The following formulas can be used to calculate the values of a, b, and c: 

a = { [ Σ x2 y * Σ xx ] – [Σ xy * Σ xx2 ] } / { [ Σ xx * Σ x2x 2] – [Σ xx2 ]2 }

b = { [ Σ xy * Σ x2x2 ] – [Σ x2y * Σ xx2 ] } / { [ Σ xx * Σ x2x 2] – [Σ xx2 ]2 }

c = [ Σ y / n ] – { b * [ Σ x / n ] } – { a * [ Σ x 2 / n ] }

Where, 

x and y: The Variables
a, b, and c: The Coefficients of the Quadratic Equation 
n = Number of Values/Elements 
Σ x= Sum of First Scores 
Σ y = Sum of Second Scores 
Σ x2 = Sum of Square of First Scores 
Σ x 3 = Sum of Cube of First Scores 
Σ x 4 = Sum of Power Four of First Scores 
Σ xy= Sum of the Product of First and Second Scores 
Σ x2y = Sum of Square of First Scores and Second Scores
Σ x x = [ Σ x 2 ] – [ ( Σ x )2 / n ] 
Σ x y = [ Σ x y ] – [ ( Σ x * Σ y ) / n ] 
Σ x x2 = [ Σ x 3 ] – [ ( Σ x 2 * Σ x ) / n ] 
Σ x2 y = [ Σ x 2 y] – [ ( Σ x 2 * Σ y ) / n ] 
Σ x2 x2 = [ Σ x 4 ] – [ ( Σ x 2 )2 / n ]*/
}
