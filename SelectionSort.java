//Selection sort - Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list. 

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length-1;i++) {
			int smallest = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest] > arr[j])
				smallest = j;
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		printArray(arr);
	}
	
	
	public static void printArray(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		// TODO Auto-generated method stub
	}


	public static void main(String[] args) {
		int[] arr = {21,14,62,12,2};
		System.out.println("--Given Array--");
		printArray(arr);
		System.out.println("--Sorted Array--");
		selectionSort(arr);
	}

	
}
