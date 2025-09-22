public class TradeInVehicle {
    private String serialNumber;
    private String make;
    private String model;
    private int year;

    public TradeInVehicle(String serialNumber, String make, String model, int year) {
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getSerialNumber() { 
      return serialNumber; 
    }
  
    public String getMake()         { 
      return make; 
    }
  
    public String getModel()        { 
      return model; 
    }
  
    public int getYear()            { 
      return year; 
    }
  

    @Override
    public String toString() {
        return "TradeInVehicle [serial=" + serialNumber + ", make=" + make +
               ", model=" + model + ", year=" + year + "]";
    }
}
