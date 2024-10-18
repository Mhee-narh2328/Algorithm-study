package array;

public class PrintElementsInAnArray {
    public void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrintElementsInAnArray pm = new PrintElementsInAnArray();
        pm.printArray(new int[]{5,3,1,10,9});
    }

}
