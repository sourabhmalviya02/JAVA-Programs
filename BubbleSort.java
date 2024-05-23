//Non-Descending = 1 2 3 4 5 5 6 7
//What is Bubble Sort - Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order.

public class BubbleSort {
	void bubbeleSort(int arr[]) { //Sorting in ascending order or non-descending order..
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	//Swag using a temp variable.
				}
			}
		}
	}
	public void disp(int[] arr){
		for(int i : arr) {
		System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {67,23,25,12,76,24,67};
		BubbleSort bl = new BubbleSort();
		System.out.println("---Given Array---");
		bl.disp(arr);
		bl.bubbeleSort(arr);
		System.out.println("---Sorted Array---");
		bl.disp(arr);
	}
}
