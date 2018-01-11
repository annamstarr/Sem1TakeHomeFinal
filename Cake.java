
/**
 * Anna Mary Starr
 * January 2018 - Semester 1 Take Home Final
 * Part 1
 */
public class Cake implements Comparable<Cake> {
    // 1. Instance variables
    private String flavor;          // Chocolate or Vanilla
    private int size;               // 3 (Large), 2 (Medium), or 1 (Small)
    // 2. Static variable
    static int numCakes;
    
    // 3. Default Constructor & Constructor
    public Cake() {
    }
    public Cake(String flvr, int sz) {
        this.flavor = flvr;
        this.size = sz;
        numCakes++;
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
    
    // 5. An Additional Method -- makes another cake
    public void bake(Cake other) {
        Cake c = new Cake(other.flavor, other.size);
    }
    
    // 6. A toString() Method
    public String toString() {
        return " the " + this.flavor + " cake that is size " + this.size;
    }
    
    // 7. Compares sizes of two cakes
    public int compareTo(Cake other) {
        if(this.size > other.size) {
            return 1;                            // this.cake is larger than other.cake
        }
        else if(this.size < other.size) {
            return -1;                           // other.cake is larger than this.cake
        }
        else {
            return 0;                            // The cakes are the same size
        }
    }
}
