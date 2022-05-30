import java.util.*;

public class UberBan extends Car {

    Map<String, ArrayList<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    
    
    public UberBan(String license, Account driver,
    Map<String, ArrayList<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    
}