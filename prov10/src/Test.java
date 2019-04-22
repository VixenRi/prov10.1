public class Test {
     public static void main (String [] args){
         Car[] Cars = new Car[8]; //создание массива
         for(Car i:Cars){ //прогон элементов массива
             i = new Car();//создание машинки
             System.out.println(i);
         }
         Car.getCount();//возврат данных в Car
     }
}
