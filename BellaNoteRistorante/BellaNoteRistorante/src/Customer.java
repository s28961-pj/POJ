import java.util.UUID;

public class Customer {

    // Fields
    private final String _id = UUID.randomUUID().toString();  // Losowy ID
    private String _customerName;
    private String address;


    // Constructor
    public Customer(String name) {
        this._customerName = name;
    }


    // Methods
    public void setName(String name) {
        this._customerName = name;
    }
    public String getName() {
        return _customerName;
    }
    public String getId() {
        return _id;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}
