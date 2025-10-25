package Service;

import model.Car;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class CarService {
    private Connection connection;

    public CarService(Connection connection) {
        this.connection = connection;
    }

    public List<Car> getAllCars() {
        /*
        获取全部车辆的信息
         */
        List<Car> cars = new ArrayList<>();
        String sql = "SELECT * FROM car";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Car car = new Car(
                        rs.getInt("car_id"),
                        rs.getString("license_plate_number"),
                        rs.getString("model"),
                        rs.getString("color"),
                        rs.getString("status"),
                        rs.getString("brand"),
                        rs.getObject("purchase_date", LocalDate.class),
                        rs.getDouble("rent"),
                        rs.getDouble("deposit")
                );
                cars.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }
}