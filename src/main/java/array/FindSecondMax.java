package array;

public class FindSecondMax {
    public int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }


        }
        return secondMax;
    }

    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FindSecondMax findSecondMax = new FindSecondMax();

        // Example array
        int[] arr = {3, 5, 7, 2, 8, -1, 4, 10, 10};

        // Print the array
        System.out.print("Array: ");
        printArray(arr);

        // Find and print the second maximum
        int secondMaxValue = findSecondMax.secondMax(arr);
        System.out.println("The second maximum value is: " + secondMaxValue);
    }

}