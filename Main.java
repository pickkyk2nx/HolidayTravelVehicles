public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("SN123","Camper","ModelX",2025,
                                "HolidayMaker",55000);
        System.out.println(v);

        Customer c = new Customer("C001","Alice Smith",
                                  "123 Palm St","555-1234");
        System.out.println(c);

        Salesperson s = new Salesperson("S001","Bob Johnson","555-5678");
        System.out.println(s);

        Invoice inv = new Invoice("INV001", c, s, v,
                                  5000, 52000, 3600, 400);
        inv.addOption(new Option("OP01","Extra AC",1200));
        inv.addOption(new Option("OP02","Leather seats",2500));

        System.out.println(inv);
    }
}
