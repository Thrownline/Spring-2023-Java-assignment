public class Address {
    private int StreetNum;
    private String StreetName;
    private String City;
    private String State;
    private int Zip;

    public Address(int StreetNum, String StreetName, String City, String State, int Zip) {
        this.StreetNum = StreetNum;
        this.StreetName = StreetName;
        this.City = City;
        this.State = State;
        this.Zip = Zip;
    }

    public String getInfo() {
        return "\nAddress: " + this.StreetNum + " " + this.StreetName +
                ", " + this.City + ", " + this.State + " " + this.Zip;

    }

}
