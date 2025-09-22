import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private String invoiceID;
    private Customer customer;
    private Salesperson salesperson;
    private Vehicle newVehicle;
    private TradeInVehicle tradeInVehicle;
    private double tradeInAllowance;
    private List<Option> options;
    private double finalPrice;
    private double taxes;
    private double licenseFees;

    public Invoice(String invoiceID, Customer customer, Salesperson salesperson,
                   Vehicle newVehicle, double tradeInAllowance,
                   double finalPrice, double taxes, double licenseFees) {
        this.invoiceID = invoiceID;
        this.customer = customer;
        this.salesperson = salesperson;
        this.newVehicle = newVehicle;
        this.tradeInAllowance = tradeInAllowance;
        this.finalPrice = finalPrice;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.options = new ArrayList<>();
    }

    public void setTradeInVehicle(TradeInVehicle tradeInVehicle) {
        this.tradeInVehicle = tradeInVehicle;
    }

    public void addOption(Option option) {
        this.options.add(option);
    }

    @Override
    public String toString() {
        return "Invoice [ID=" + invoiceID + ", customer=" + customer +
               ", salesperson=" + salesperson +
               ", newVehicle=" + newVehicle +
               ", tradeInVehicle=" + tradeInVehicle +
               ", tradeInAllowance=" + tradeInAllowance +
               ", options=" + options +
               ", finalPrice=" + finalPrice +
               ", taxes=" + taxes +
               ", licenseFees=" + licenseFees + "]";
    }
}
