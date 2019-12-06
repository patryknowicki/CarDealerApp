package cardealer.cardealerapp;

import javax.persistence.*;

@Entity
@Table(name = "CarDealer")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mark;
    private String carModel;
    private String engineType;
    private String capacity;
    private String productionDate;
    @Column(name = "number", nullable = false)
    private String keyNumber;
    @Column(length = 2048)
    private String addictives;
    @Transient
    boolean isNew;

    public Car(String mark, String carModel, String engineType, String capacity,
               String productionDate, String keyNumber, String addictives, boolean isNew){
        this.mark = mark;
        this.carModel = carModel;
        this.engineType = engineType;
        this.capacity = capacity;
        this.productionDate = productionDate;
        this.keyNumber = keyNumber;
        this.addictives = addictives;
        this.isNew = isNew;
    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getKeyNumber() {
        return keyNumber;
    }

    public void setKeyNumber(String keyNumber) {
        this.keyNumber = keyNumber;
    }

    public String getAddictives() {
        return addictives;
    }

    public void setAddictives(String addictives) {
        this.addictives = addictives;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", carModel='" + carModel + '\'' +
                ", engineType='" + engineType + '\'' +
                ", capacity='" + capacity + '\'' +
                ", productionDate='" + productionDate + '\'' +
                ", keyNumber='" + keyNumber + '\'' +
                ", addictives='" + addictives + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
