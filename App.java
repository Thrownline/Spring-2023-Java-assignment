import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        Address a1 =  new Address(12, "Maple Street", "Broomall", "PA", 19008);
        Address a2 =  new Address(42, "Oak Street", "Broomall", "PA", 19008);
        Address a3 =  new Address(31, "Cherry Road", "Broomall", "PA", 19008);
        Address a4 =  new Address(52, "Cherry Road", "Broomall", "PA", 19008);

        
CircularSilo silo1 = new CircularSilo(10000, "Gray", "Nick Volpe",a1, 60, 30);
CircularSilo silo2 = new CircularSilo(20000, "Black", "Nick Volpe",a2, 80, 40);

RectangularRanch ranch1 = new RectangularRanch(50000, "Red", "Mike Volpe",a3, 500, 500, 100);
RectangularRanch ranch2 = new RectangularRanch(25000, "Blue", "Zach Michalski",a4, 250, 250, 50);

ArrayList<Building> buildings = new ArrayList<>();
buildings.add(silo1);
buildings.add(silo2);
buildings.add(ranch1);
buildings.add(ranch2);

for(Building b : buildings){
   System.out.println(b.getInfo()); 
    b.calculateVolume();
}

    }
}
