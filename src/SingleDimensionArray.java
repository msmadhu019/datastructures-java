public class SingleDimensionArray {

    // Initialize a null constructor
    int arr[] = null;

    // Create an array with default value based on the input
    public SingleDimensionArray(int arraySize) {
        arr = new int[arraySize];
        for (int i=0; i<arraySize; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    //Insert elements to Array
    public void insert(int location, int valueToBeInserted) {
        try{
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
//                System.out.println("Successfully Inserted");
            } else {
                System.out.println("The cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a.getMessage());
        }
    }

    // Print all the elements in an array
    public void traverseArray() {
        try{
            for (int j : arr) {
                System.out.print(j+" ");
            }
            System.out.println();
        } catch (Exception e ){
            System.out.println("Exception: "+e.getMessage());
        }
    }

    // Search for an element in Array
    public void searchElement(int valueToBeSearched) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == valueToBeSearched) {
                System.out.println("Value Found at: "+i);
                return;
            }
        }
        System.out.println("The requested element is not found in the Array");
    }
}
