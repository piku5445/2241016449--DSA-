import java.util.*;
public class heapsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] heap = {10,2,8,9,4,16,6};
		 heapsort2(heap.length,heap);
		 printHeap(heap);
	}

public static void heapsort2(int s, int[] ar) {
  for(int i=s;i>0;i--) {
	  maxHeapify(ar,1);
	  swap(ar,i-1,0);
s=s-1;
  }
}

public static void maxHeapify(int[] heap, int index) {
    int size = heap.length;
    int largest = index;
    int leftChild = 2 * index + 1;
    int rightChild = 2 * index + 2;
    // Check if the left child is larger than the current largest
    if (leftChild < size && heap[leftChild] > heap[largest]) {
        largest = leftChild;
    }

    // Check if the right child is larger than the current largest
    if (rightChild < size && heap[rightChild] > heap[largest]) {
        largest = rightChild;
    }

    // If the largest is not the current index, swap the elements and recursively call maxHeapify
    if (largest != index) {
        swap(heap, index, largest);
        maxHeapify(heap, largest);
    }
}

// Utility function to swap elements at two indices in an array
public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

// Utility function to print the elements of the heap
public static void printHeap(int[] heap) {
    for (int value : heap) {
        System.out.print(value + " ");
    }
    System.out.println();
}
}
//Algorithm:
//1. Initialize a min heap and insert the first k elements of the heap into it.
//2. For each remaining element in the heap (from k+1 to n), do the following:
//   a. If the current element is greater than the minimum element in the min heap,
//      replace the minimum element with the current element.
//3. After processing all elements, the minimum element in the min heap is the kth largest element.
//4. Compare the kth largest element with the given value x.
//   a. If kth largest element <= x, return true.
//   b. Otherwise, return false.
//
