import java.util.ArrayList;

public class Address {
    private String street;
    private int number;
    private String zipCode;
    private String city;
    public Address(String street, int number, String zipCode, String city) {
        this.street=street;
        this.zipCode=zipCode;
        this.number=number;
        this.city=city;
    }
    public int getNumber() {
        return number;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public String getZipCode() {
        return zipCode;
    }
    public String toString() {
        String str = String.valueOf(number);
        // String str = Integer.toString(number)
        return "< Adress: " + street + " " + str + " " + zipCode + " " +  city + " >";
    }

    public boolean equals(Object other) {
        if(this==other) return true;
        if(other==null || other.getClass()!=this.getClass()) return false;
        Address that = (Address) other;
        return this.zipCode.equals(that.zipCode) && this.number==that.number;
    }
}
