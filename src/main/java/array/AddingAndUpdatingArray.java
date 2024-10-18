package array;

public class AddingAndUpdatingArray {
    public void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void arrayDemo(){
        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 3;
        myArray[2] = 2;
        myArray[3] = 4;
        myArray[4] = 8;
        myArray[2] =28;//Reassigning the elements in index 2
        printArray(myArray);
        //to get the array length
        System.out.println(" The length of the Array " + myArray.length);
        //to print last index of the array
        System.out.println("Last index: " + myArray[myArray.length -1]);
    }

    public static void main(String[] args) {
        AddingAndUpdatingArray ar = new AddingAndUpdatingArray();
        ar.arrayDemo();

    }

}
