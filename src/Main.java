import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String[][] myArray = new String[2][];
        myArray[0] = new String[]{"Alice", "has", "the", "cat"};
        myArray[1] = new String[]{"The", "cat", "has", "Alice"};

        for (int i = 0; i < myArray.length; i++){
            for (int j = 0; j < myArray[i].length; j++){
                System.out.println(myArray[i][j]);
            }
        }
    }

    public void oneDimensionalArrays(){
        String[] names = new String[4];
        names[0] = "Jan";
        names[3] = "Roman";
        System.out.println("Element 1: " +names[0]);
        System.out.println("Element 2: " +names[1]);
        System.out.println("Element 3: " +names[2]);
        System.out.println("Element 4: " +names[3]);
        System.out.println(Arrays.toString(names));
        int[] numbers = new int[]{3, 8, 8, 20, 6};

        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.println(numbers[i]);
        }

        float[] floats = new float[]{3.6f, 7.45f, 8.02f};
        System.out.println(Arrays.toString(floats));
    }
}