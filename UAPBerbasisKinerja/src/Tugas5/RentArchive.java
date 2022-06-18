package Tugas5;
import java.util.ArrayList;


public class RentArchive {
    private ArrayList<CarRent> rentData = new ArrayList<CarRent>();

    public void Rent(CarRider rider, Car car, int rentDur){
        CarRent carRent = new CarRent(rider, car, rentDur);

        if (car.isStatus() == true) {
            rentData.add(carRent);
            car.setStatus(String.valueOf(false));
            System.out.println("Mobil Berhasil Disewa  ");
        }else{
            System.out.println("Maaf, Mobil Sudah Disewa");
        }
    }

    public void info(){
        System.out.println("===============================================");
        System.out.println("              Informasi Pelanggan              ");
        System.out.println("===============================================");
        for (int i = 0; i < rentData.size(); i++) {
            System.out.println("Nama Peminjam = "+rentData.get(i).getRider().getName());
            System.out.println("Tipe Mobil    = "+rentData.get(i).getCar().getCarType());
            System.out.println("No. Polisi    = "+rentData.get(i).getCar().getPolNum());
            System.out.println("Lama Rental   = "+rentData.get(i).getRentDur());
            System.out.println("-------------------------------------------");
        }
    }
}
