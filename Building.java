public abstract class Building {
    private int Cost;
    private String Color;
    private String Owner;
    private Address address;

    public Building(int Cost, String Color, String Owner, Address address) {
        this.Cost = Cost;
        this.Color = Color;
        this.Owner = Owner;
        this.address= address;

    }

    public String getInfo() {
        return "\nPurchase Cost: $" + this.Cost + "\nBuilding Color: " +
                this.Color + "\nOwner: " + this.Owner + address.getInfo();
    }

    public abstract void calculateVolume();

}
