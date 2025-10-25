import Service.CarService;
import model.Car;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/car_rental_system?useSSL=false&serverTimezone=UTC",
                "root", "12345678"
        );

        CarService carService = new CarService(conn);
        System.out.println("car表");
        for (Car car : carService.getAllCars()) {
            System.out.println(car.getCarId() + " - " + car.getBrand() + " - " + car.getModel() + " - " + car.getPricePerDay());
        }

        conn.close();
    }
}