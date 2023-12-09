public class ClassExample {
    private int maxSpeed;
    private String color;
    private String brand;

    public ClassExample(int maxSpeed, String color, String brand){
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.brand = brand;
    }
    public ClassExample(){}


    //setters
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color1){
        color = color1;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    //getters
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public String getColor(){
        return color;
    }

    public String getBrand(){
        return brand;
    }

    public void printAllFields(){
        System.out.println("Max speed is: " + maxSpeed +
                ", color is: " + color + ", brand is: " + brand);
    }
}
