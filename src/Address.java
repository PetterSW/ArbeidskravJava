public class Address {
    private String street1, street2, city, state, zip;
//Constructor with 2 streets
    public Address(String street1, String street2, String city, String state, String zip) {
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
//Constructor with 1 street
    public Address(String street1, String city, String state, String zip) {
        this.street1 = street1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        if (street2 == null) {
            return street1 + ", " + zip + " " + city + " | " + state;}

        else {
            return street1 + " / " + street2 + ", " + zip + " " + city + " | " + state; }

    }
}



