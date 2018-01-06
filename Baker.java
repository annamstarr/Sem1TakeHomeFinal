/**
 * Anna Mary Starr
 * January 2018 - Semester 1 Take Home Final
 * Part 2 - Driver
 */
public class Baker {
    // 1. Main method that initiates two objects
    public static void main(String[] args) {
        Cake c1 = new Cake("Chocolate", 3);
        Cake c2 = new Cake("Vanilla", 1);
    }
    
    // 2. Static method changeIt()
    public static void changeIt( Cake c1, Cake c2) {
        c1.setFlavor("Vanilla");
        Cake c3 = new Cake("Chocolate", 2);
        c2 = c3;
        c2.setSize(3);
    }
}
