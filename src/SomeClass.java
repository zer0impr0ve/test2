import exaples.PackageExample;
import exaples.sda.SDAExample;


public class SomeClass {
    public static ClassExample example = new ClassExample(200, "","");
    public static ClassExample secondExample = new ClassExample();

    public static void main(String[] args) {
        example.setMaxSpeed(200);
        example.setMaxSpeed(250);
        secondExample.setMaxSpeed(300);
        example.setMaxSpeed(secondExample.getMaxSpeed());
        example.setBrand("smth");
        example.setColor("gray");
        //System.out.println(example.getMaxSpeed());
        //System.out.println(secondExample.getMaxSpeed());
        example.printAllFields();


        PackageExample packageExample = new PackageExample();
        packageExample.setSomeNumber(5);
        System.out.println(packageExample.getSomeNumber());
        //packageExample.printSomeNumber();    //nuk referencohet, eshte protected
        SDAExample sdaExample = new SDAExample();
    }

}

