public class Ex3 {
    public static void main(String[] args) {
        int[][] table = new int[5][5];

        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                if (i == j){
                    table[i][j] = i;
                }else {
                    table[i][j] = 0;
                }
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }
}
//CTRL + ALT + L