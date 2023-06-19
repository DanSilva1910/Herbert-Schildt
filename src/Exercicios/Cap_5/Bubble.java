package Cap_5;

public class Bubble {
	public static void main(String[] args) {
		int nums[] = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49, -255, -1001, 100133 };
		int size = nums.length;

		bubbleSort(nums, size);

		System.out.println("Sorted Array:");
		for (int i = 0; i < size; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void bubbleSort(int arr[], int n) {
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				// Se nenhum elemento foi trocado nesta passagem, o array já está ordenado
				break;
			}
		}
	}
}
