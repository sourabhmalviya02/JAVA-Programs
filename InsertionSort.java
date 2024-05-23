//What is insertion sort - Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list. It is a stable sorting algorithm, meaning that elements with equal values maintain their relative order in the sorted output.


public class InsertionSort {
	public void insertionSort(int[] arr) {
		int temp = Integer.MIN_VALUE,j=0;
		for(int i=0;i<arr.length;i++) {
			for(j=i;(j>0 && arr[j-1]>temp);j--) {
				arr[j] = arr[j-1];
			}
			arr[j]=temp;
		}
	}
	
	public void disp(int[] arr){
		for(int i : arr) {
		System.out.print(i + " ");
		}
		System.out.println();
}
	
	public static void main(String[] args) {
		int arr[] = {7,5,9,3,2};
		InsertionSort i = new InsertionSort();
		System.out.println("---Given Array---");
		i.disp(arr);
		i.insertionSort(arr);
		System.out.println("---Sorted Array---");
		i.disp(arr);
	}
}
