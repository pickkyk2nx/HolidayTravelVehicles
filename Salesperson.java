public class Salesperson {
    private String salespersonID;
    private String name;
    private String phone;

    public Salesperson(String salespersonID, String name, String phone) {
        this.salespersonID = salespersonID;
        this.name = name;
        this.phone = phone;
    }

    public String getSalespersonID() { 
      return salespersonID; 
    }
  
    public String getName()          { 
      return name; 
    }
  
    public String getPhone()         { 
      return phone; 
    }
  

    @Override
    public String toString() {
        return "Salesperson [ID=" + salespersonID + ", name=" + name +
               ", phone=" + phone + "]";
    }
}
