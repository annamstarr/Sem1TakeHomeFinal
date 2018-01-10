
/**
 * Anna Mary Starr
 * January 2018 - Semester 1 Take Home Final
 * Part 3
 */
public class Baker {
    // 1.
    private Cake cakeType;
    private String name;
    
    // 2. Constructor
    public Baker(Cake type, String nm) {
        this.cakeType = type;
        this.name = nm;
    }
    
    // 3. Setters and Getters
    public void setCakeType(Cake newCakeType){
        this.cakeType = newCakeType;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public Cake getCakeType() {
        return this.cakeType;
    }
    public String getName() {
        return this.name;
    }
    
    //4. toString() method
    public String toString() {
        return "The baker of " + this.cakeType + " cakes is " + this.name;
    }

}
