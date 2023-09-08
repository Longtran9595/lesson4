public class Car {
    public String name;
    public String color;
    public double weight;

    public void go(){
        System.out.println(this.name + "dang chay");
    }

    public Car(String name, double weight, String color){
        this.name = name;
        this.color = color;
        this.weight = weight;

    }
}


class main2{
    public static void main(String[] args) {
        Car oto1 = new Car("mec", 34.4, "red");
        oto1.go();
        Car oto2 = new Car("bmw", 34.4, "red");
        oto2.go();
    }
}