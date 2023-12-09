public class Ex4 {
    public static void main(String[] args) {
        int[][] table = new int[2][3];
        int value = 0;

        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                table[i][j] = value;
                System.out.println("table[" + i + "][" + j + "] = " + value);
                value++;
            }
        }
    }
}
