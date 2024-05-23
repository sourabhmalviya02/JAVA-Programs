//Merge Sort - Merge sort is a sorting algorithm that follows the divide-and-conquer approach. It works by recursively dividing the input array into smaller subarrays and sorting those subarrays then merging them back together to obtain the sorted array.

public class MergeSort {

	// Divide method of the Merge Sort
	void divide(int arr[], int left, int right) {
		// termination condition: the left and right come closer to each other with 
		// each recursive call and once they meet or cross each other then the recursion ends
		// intimating that the division has happened till the last (leaf) node
		if(left < right) {
			int middle = (left+right)/2;
			divide(arr, left, middle);  // left half of the array
			divide(arr, middle+1, right);  // right half of the array
			// conquer
			merge(arr, left, middle, right);
		}
	}
	
	void merge(int[] arr, int left, int middle, int right) {
		int righthalfsize = right-middle;  // exclusive of the middle element
		int lefthalfsize = middle-left+1;  // inclusive of the middle element
		int leftarray[] = new int[lefthalfsize];
		int rightarray[] = new int[righthalfsize];
		for(int i=0; i<lefthalfsize; i++) {
			// copying the left half of array 'arr' starting from 1st into array 'leftarray' till the middle element
			leftarray[i] = arr[left+i];
		}
		for(int j=0; j<righthalfsize; j++) {
			// copying the right half of the array 'arr' starting from 'middle+1' into array 'rightarray' till the last element
			rightarray[j] = arr[middle+1+j];
		}
		int i=0, j=0, k=left;
		// compare the elements of the leftarray and rightarray one-by-one and add it to the
		// resultant sorted array
		while(i < lefthalfsize && j < righthalfsize) {
			if(leftarray[i] <= rightarray[j]) {
				arr[k] = leftarray[i];
				i++;
			} else {
				arr[k] = rightarray[j];
				j++;
			}
			k++;
		} // at the end this loop, either leftarray or rightarray would have exhausted
		
		// if the leftarray has few elements left over
		while(i < lefthalfsize) {
			arr[k] = leftarray[i];  // appending to the end of arr by picking one element at one time from leftarray
			i++; k++;
		}
		// if the rightarray has few elements left over
		while(j < righthalfsize) {
			arr[k] = rightarray[j];
			j++; k++;
		}
	}
	
	
	void display(int[] arr) {
		for(int i: arr) {
			System.out.print(i+", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {19, 11, 7, 21, 15, 8};
		MergeSort ms = new MergeSort();
		System.out.println("---Given Array---");
		ms.display(arr);
		ms.divide(arr, 0, arr.length-1);
		System.out.println("---Sorted Array---");
		ms.display(arr);
	}
}
