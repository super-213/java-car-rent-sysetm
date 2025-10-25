package model;
import java.time.LocalDate;

public class Car {
    private int carId;
    private String carNumber;
    private String model;
    private String color;
    private String status;
    private String brand;
    private LocalDate purchaseDate;
    private double pricePerDay;
    private double deposit;

    // 构造函数
    public Car(int carId, String carNumber, String model, String color, String status, String brand, LocalDate purchaseDate, double pricePerDay, double deposit) {
        this.carId = carId;
        this.carNumber = carNumber;
        this.model = model;
        this.color = color;
        this.status = status;
        this.brand = brand;
        this.purchaseDate = purchaseDate;
        this.pricePerDay = pricePerDay;
        this.deposit = deposit;
    }

    // getter &setter
    public int getCarId() { return carId; }
    public void setCarId(int carId) { this.carId = carId; }

    public String getCarNumber() { return carNumber; }
    public void setCarNumber(String carNumber) { this.carNumber = carNumber; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public LocalDate getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate; }

    public double getPricePerDay() { return pricePerDay; }
    public void setPricePerDay(double pricePerDay) { this.pricePerDay = pricePerDay; }

    public double getDeposit() { return deposit; }
    public void setDeposit(double deposit) { this.deposit = deposit; }

}