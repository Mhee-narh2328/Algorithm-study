package array;

public class MinimumInteger {
    public int findMinimum(int[] arr){
        //create a int variable and assign the first index of the array to it
        int min = arr[0];
        //check through the for loop if the next number is the index is less than the min
        //if yes, assign that number to the min till you check through all the numbers in the array
        for (int i = 1; i< arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {5,9,3,15,7,2};
        MinimumInteger mi = new MinimumInteger();
        System.out.println( mi.findMinimum(arr));

    }

}
