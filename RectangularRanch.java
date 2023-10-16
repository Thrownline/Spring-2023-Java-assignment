public class RectangularRanch extends Building {
    private int Length;
    private int Width;
    private int Height;

    public RectangularRanch(int Cost, String Color, String Owner, Address address, int Length, int Width, int Height) {
        super(Cost, Color, Owner, address);
        this.Length = Length;
        this.Width = Width;
        this.Height = Height;

    }

    public String getInfo() {
        return super.getInfo() + "\nLength: " + this.Length + "\nWidth: " + this.Width +
                "\nHeight: " + this.Height;
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume: " + this.Length * this.Width + this.Height);
    }

}
