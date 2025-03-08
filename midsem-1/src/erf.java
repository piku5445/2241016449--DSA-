
public class erf {

    public static void main(String[] args) {
        int[] heap = {4, 10, 3, 5, 1};
        
        System.out.println("Original Heap:");
        printHeap(heap);

        int indexToHeapify = 1; // Index to perform maxHeapify operation

        maxHeapify(heap, indexToHeapify);

        System.out.println("\nHeap after maxHeapify at index " + indexToHeapify + ":");
        printHeap(heap);
    }

    // Function to perform maxHeapify on a given index in the heap
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
