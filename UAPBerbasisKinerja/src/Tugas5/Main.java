package Tugas5;

public class Main {

    public static void main(String[] args) {
        // write your code here
        CarRider ming = new CarRider("Lin Ming",19,"08123456789");
        CarRider youhan = new CarRider("Bei Youhan", 20,"081222333444");
        CarRider ling = new CarRider("Ling Er", 19, "081234567888");

        CarData data = new CarData();
        data.addCar("SUV","N 111 AB","Honda");
        data.addCar("Sport", "B 222 AB", "SSC Tuatara");
        data.addCar("Truck", "N 333 AB", "Suzuki");

        data.listOfCar();

        RentArchive archive = new RentArchive();
        archive.Rent(ming, data.carList().get(1),9);
        archive.Rent(youhan, data.carList().get(0), 3);
        archive.Rent(ling, data.carList().get(1), 1);

        System.out.println();
        archive.info();
    }
}