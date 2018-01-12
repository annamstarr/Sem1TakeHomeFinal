
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
        Baker baker2 = new Baker(cake1, "Kate", 31);
        
        System.out.println(baker1.compareTo(baker2));      // Will print: -1
        
        System.out.println(baker1);     // Will print: The baker of the Chocolate cake that is size 3 is Sarah who is 23 years old.
    }
}
