//Quick Sort - QuickSort is a sorting algorithm based on the Divide and Conquer algorithm that picks an element as a pivot and partitions the given array around the picked pivot by placing the pivot in its correct position in the sorted array.


public class QuickSort {
	void quickSort(int arr[],int l,int h) {
		if(l<h) {
			int pivot = partition(arr,l,h);
			quickSort(arr,l,pivot-1);
			quickSort(arr,pivot+1,h);
		}
	}

	public int partition(int[] arr, int l, int h) {
		// TODO Auto-generated method stub
		int pivot = arr[h];
		int i = l-1;
		for(int j = l;j<h;j++) {
			if(arr[j] < pivot) {
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = temp;
		
		return i+1;
	}
	
	public void disp(int[] arr) {
		// TODO Auto-generated method stub
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= {21,25,6,4,3,45,7};
		QuickSort qs = new QuickSort();
		System.out.println("---Given Array---");
		qs.disp(arr);
		qs.quickSort(arr, 0, arr.length-1);
		System.out.println("---Sorted Array---");
		qs.disp(arr);		
	}
}
