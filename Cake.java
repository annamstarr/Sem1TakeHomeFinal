
/**
 * Anna Mary Starr
 * January 2018 - Semester 1 Take Home Final
 * Part 1
 */
public class Cake implements Comparable {
    // 1. Instance variables
    private String flavor;
    private int size;           // 3 Large, 2 Medium, 1 Small
    // 2. Static variable
    static int numFoods;
    
    // 3. Default Constructor & Constructor
    public Cake() {
    }
    public Cake(String flvr, int sz) {
        this.flavor = flvr;
        this.size = sz;
    }
    
    // 4. Setters and Getters
    public void setFlavor(String newFlavor){
        this.flavor = newFlavor;
    }
    public void setSize(int newSize){
        this.size = newSize;
    }
    public String getFlavor() {
        return this.flavor;
    }
    public int getSize() {
        return this.size;
    }
    
    // 5. An Additional Method -- creates another cake
    public void bake(Cake other) {
        Cake temp = new Cake(other.flavor, other.size);
    }
    
    // 6. A toString() Method
    public String toString() {
        return "The flavor of cake is " + this.flavor;
    }
    
    // 7. Compares sizes of two cakes
    public int compareTo(Cake other) {
        if(this.size > other.size) {
            return 1;
        }
        else if(this.size < other.size) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
