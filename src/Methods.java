public class Methods {
    public static void main(String... args) {
        //int firstNumber = diff(8, 2);
        //System.out.print(firstNumber + "\n");
        //System.out.print(diff(5, 1)+ "\n");
        //System.out.print(diff(6, 9)+ "\n");
        //someMethod(3, 6);
        stringMethod("Hello", "hi", "hey");
        stringMethod("bye");
        stringMethod("hey", "bye");
    }

    public static int diff(int arg1, int arg2){
        int difference = arg1 - arg2;
        System.out.print("The diff is ");
        return difference;
    }


    public static void someMethod(int arg1, int arg2){
        if (arg1 < arg2){
            return;
        }
         int diff = arg1 - arg2;
         System.out.println(diff);
    }

    public static void stringMethod(String... texts){
        for (String string : texts) {
            System.out.println(string);
        }
    }
}
