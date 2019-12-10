package cardealer.cardealerapp;

import javax.persistence.*;

@Entity
public class Motorcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mark;
    private String motorcycleModel;
    private String version;
    private String destiny;
    private String engineType;
    private String capacity;
    private String engineOperationStrokes;
    private String productionDate;
    private String license;
    @Column(name = "number", nullable = false)
    private String keyNumber;
    @Column(length = 2048)
    private String addictives;
    @Transient
    boolean isNew;


    public Motorcycle(String mark, String motorcycleModel, String version, String destiny,
               String engineType, String capacity, String engineOperationStrokes, String productionDate,
                      String license, String keyNumber, String addictives, boolean isNew){
        this.mark = mark;
        this.motorcycleModel = motorcycleModel;
        this.version = version;
        this.destiny = destiny;
        this.engineType = engineType;
        this.capacity = capacity;
        this.engineOperationStrokes = engineOperationStrokes;
        this.productionDate = productionDate;
        this.license = license;
        this.keyNumber = keyNumber;
        this.addictives = addictives;
        this.isNew = isNew;
    }
    public Motorcycle(Integer id, String mark,
 String motorcycleModel, String version, String destiny,
                      String engineType, String capacity, String engineOperationStrokes, String productionDate,
                      String license, String keyNumber, String addictives, boolean isNew){
        this.id = id;
        this.mark = mark;
        this.motorcycleModel = motorcycleModel;
        this.version = version;
        this.destiny = destiny;
        this.engineType = engineType;
        this.capacity = capacity;
        this.engineOperationStrokes = engineOperationStrokes;
        this.productionDate = productionDate;
        this.license = license;
        this.keyNumber = keyNumber;
        this.addictives = addictives;
        this.isNew = isNew;
    }

    public Motorcycle() {
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

    public String getMotorcycleModel() {
        return motorcycleModel;
    }

    public void setMotorcycleModel(String motorcycleModel) {
        this.motorcycleModel = motorcycleModel;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
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

    public String getEngineOperationStrokes() {
        return engineOperationStrokes;
    }

    public void setEngineOperationStrokes(String engineOperationStrokes) {
        this.engineOperationStrokes = engineOperationStrokes;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
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
        return "Motorcycle{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", motorcycleModel='" + motorcycleModel + '\'' +
                ", version='" + version + '\'' +
                ", destiny='" + destiny + '\'' +
                ", engineType='" + engineType + '\'' +
                ", capacity='" + capacity + '\'' +
                ", engineOperationStrokes='" + engineOperationStrokes + '\'' +
                ", productionDate='" + productionDate + '\'' +
                ", license='" + license + '\'' +
                ", keyNumber='" + keyNumber + '\'' +
                ", addictives='" + addictives + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
