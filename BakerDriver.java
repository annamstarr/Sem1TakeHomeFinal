
/**
 * Anna Mary Starr
 * January 2018 - Semester 1 Take Home Final
 * Part 3
 */
public class BakerDriver {
    public static void main(String[] args) {
        // 6.
        Cake cake1 = new Cake("Chocolate", 3);
        Baker baker1 = new Baker(cake1, "Sarah", 23);
        
        System.out.println(baker1);
    }
}
