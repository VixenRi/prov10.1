public class Car {

    String manufacturer;
    String model;
    int yearOfManufacture;
    String color;
    String owner;
    static int countCar;

    public Car (){
        countCar++;
    }
    public static void getCount(){
        System.out.println("количество созданных машин: " + countCar);
    }
}
