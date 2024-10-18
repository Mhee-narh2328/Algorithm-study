package array;

public class RemoveEvenNumbers {
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] removeEven(int[] arr){
        //create a variable that add the amount of odd number
        int oddCount = 0;
        //Check through the array and count the number of time the odd number appears and save to the odd count variable
        for (int i = 0; i <arr.length; i++){
            if (arr[i] % 2 != 0){
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int idx = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i] % 2 != 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,7,10,6,5};

        int [] result = removeEven(arr);
        printArray(result);
    }
}
