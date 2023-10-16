public class CircularSilo extends Building {
    private int Radius;
    private int Height;

    public CircularSilo(int Cost, String Color, String Owner, Address address, int Radius, int Height) {
        super(Cost, Color, Owner, address);
        this.Radius = Radius;
        this.Height = Height;

    }

    public String getInfo() {
        return super.getInfo() + "\nRadius: " + this.Radius + "\nHeight: " +
                this.Height;
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume: " + Math.PI * Math.pow(this.Radius, 2) * this.Height);
    }

}