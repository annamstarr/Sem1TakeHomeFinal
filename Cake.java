/**
 * Anna Mary Starr
 * January 2018 - Semester 1 Take Home Final
 * Part 1 - Main Class
 */
public class Cake implements Comparable {
    // 1. Instance variables
    private String flavor;          // C (Chocolate) or V (Vanilla)
    private String size;            // L (Large), M (Medium), or S (Small)
    // 2. Static variable
    static int numFoods;
    
    // 3. Default Constructor & Constructor
    public Cake() {
    }
    public Cake(String flvr, String sz) {
        this.flavor = flvr;
        this.size = sz;
    }
    
    // 4. Setters and Getters
    public void setFlavor(String newFlavor){
        this.flavor = newFlavor;
    }
    public void setSize(String newSize){
        this.size = newSize;
    }
    public String getFlavor() {
        return this.flavor;
    }
    public String getSize() {
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
    public String compareTo(Cake other) {
        int result = this.size.compareTo(other.size);
        if(result > 0) {
            return "The first cake is larger than the second.";
        }
        else if(result < 0) {
            return "The second cake is larger than the first";
        }
        else {
            return "The cakes are the same size.";
        }
    }
}
