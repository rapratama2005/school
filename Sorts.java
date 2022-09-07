// Rizky Pratama
// Period 2
// 9/6/22

/*
_______ _________ _______  _                   _______  _______  _______ _________ _______  _______  _______ 
(  ____ )\__   __// ___   )| \    /\|\     /|  (  ____ )(  ____ )(  ___  )\__   __/(  ___  )(       )(  ___  )
| (    )|   ) (   \/   )  ||  \  / /( \   / )  | (    )|| (    )|| (   ) |   ) (   | (   ) || () () || (   ) |
| (____)|   | |       /   )|  (_/ /  \ (_) /   | (____)|| (____)|| (___) |   | |   | (___) || || || || (___) |
|     __)   | |      /   / |   _ (    \   /    |  _____)|     __)|  ___  |   | |   |  ___  || |(_)| ||  ___  |
| (\ (      | |     /   /  |  ( \ \    ) (     | (      | (\ (   | (   ) |   | |   | (   ) || |   | || (   ) |
| ) \ \_____) (___ /   (_/\|  /  \ \   | |     | )      | ) \ \__| )   ( |   | |   | )   ( || )   ( || )   ( |
|/   \__/\_______/(_______/|_/    \/   \_/     |/       |/   \__/|/     \|   )_(   |/     \||/     \||/     \|

*/
public class Sorts {
	public int[] bubbleSort (int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length -1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];//swap
					arr[j] = arr [j+1];
					arr[j+1] = temp;
					//printArr(arr);
				}
			}
		}
		//System.out.println();
		return arr;
	}
	
	public int[] selectionSort (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			//int min = arr[i];
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					// = arr[j];
					minIndex = j;
					//printArr(arr);
				}
			}
			int temp = arr[i];//swap
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			//printArr(arr);
		}
		//System.out.println();
		return arr;
	}

	public int[] insertionSort (int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int valToIns = arr[i];
			int indToIns = i;
			while (indToIns > 0 && arr[indToIns -1] > valToIns) {
				arr[indToIns] = arr[indToIns -1];
				indToIns--;	
				//printArr(arr);
			}
			arr[indToIns] = valToIns;
		}
		//System.out.println();
		return arr;
	}
	
	public int[] mergeSort (int[] arr) {
		printArr(arr);
		if (arr.length != 1) {
			double midpoint = arr.length/2;
			int[] arr2 = new int[(int) Math.ceil(midpoint)];
			int[] arr3 = new int[(int) Math.ceil(midpoint)];
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = arr[i];
			}
			for (int i = 0; i < arr3.length; i++) {
				arr3[i] = arr[(int)Math.ceil(midpoint)+i];
			}
			arr2 = mergeSort(arr2);
			printArr(arr2);
			arr3 = mergeSort(arr3);
			printArr(arr3);
			return merge(arr2, arr3);
		}
		return arr;
	}
	
	public int[] merge (int[] l, int[] r) {
		int li = 0; int ri = 0; 
		int[] arr = new int[l.length + r.length];
		int i = 0;
		while (li < l.length && ri < r.length) {
			if (l[li] < r[ri]) {
				arr[i] = l[li];
				i++;
				li++;
			} else {
				arr[i] = r[ri];
				ri++;
				i++;
			}
		}
		
		while (li < l.length) {
			arr[i] = l[li];
			li++;
		}
		
		while (ri < l.length) {
			arr[i] = r[ri];
			ri++;
		}
		return arr;
	}
	
	
	public void printArr(int[] arr) {
		for (int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
