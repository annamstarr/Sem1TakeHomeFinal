
/**
 * Anna Mary Starr
 * January 2018 - Semester 1 Take Home Final
 * Part 2 - Driver
 */
public class CakeDriver {
    // 1. Main method that initiates two objects
    public static void main(String[] args) {
        Cake c1 = new Cake("Chocolate", 3);
        Cake c2 = new Cake("Vanilla", 1);
        
        // 3. and 4.
        System.out.println("Number of cakes: " + Cake.numCakes);
        System.out.println(c1);     // Will print: The flavor of cake is Chocolate and it is size 3
        System.out.println(c2);     // Will print: The flavor of cake is Vanilla and it is size 1
        changeIt(c1, c2);
        System.out.println(c1);     // Will print: The flavor of cake is Vanilla and it is size 3
        System.out.println(c2);     // Will print: The flavor of cake is Vanilla and it is size 1
    }
    
    // 2. Static method changeIt()
    public static void changeIt(Cake ck1, Cake ck2) {
        ck1.setFlavor("Vanilla");
        Cake ck3 = new Cake("Chocolate", 2);
        ck2 = ck3;
        ck2.setSize(3);
        System.out.println(ck1);     // Will print: The flavor of cake is Vanilla and it is size 3
        System.out.println(ck2);     // Will print: The flavor of cake is Chocolate and it is size 3
    }
}
