package exaples;

public class PackageExample {
    private int someNumber;

    public int getSomeNumber(){
        return someNumber;
    }

    public void setSomeNumber(int someNumber){
        this.someNumber = someNumber;
    }

    protected void printSomeNumber(){
        System.out.println("Some Number is: " + someNumber);
    }
}
