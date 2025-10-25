package model;
import java.time.LocalDate;

public class User {
    private int userId;
    private String name;
    private String idNumber;
    private String phoneNumber;
    private LocalDate registerDate;

    public User(int userId, String name, String idNumber, String phoneNumber, LocalDate registerDate) {
        /*
        user表中
        userId是主键
        name是用户名
        idNumber是身份证号
        phoneNumber是电话号码
        registerDate是注册日期
         */
        this.userId = userId;
        this.name = name;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.registerDate = registerDate;
    }
    // getter &setter
    public int getUserId() { return userId; };
    public void setUserId(int userId) { this.userId = userId; };

    public String getName() { return name; };
    public void setName(String name) { this.name = name; };

    public String getIdNumber() { return idNumber; };
    public void setIdNumber(String idNumber) { this.idNumber = idNumber; };

    public String getPhoneNumber() { return phoneNumber; };
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; };

    public LocalDate getRegisterDate() { return registerDate; };
    public void setRegisterDate(LocalDate registerDate) { this.registerDate = registerDate; };
}
