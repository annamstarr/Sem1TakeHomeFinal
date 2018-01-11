
/**
 * Anna Mary Starr
 * January 2018 - Semester 1 Take Home Final
 * Part 3
 */
public class Baker implements Comparable<Baker> {
    // 1.
    private Cake cakeType;
    private String name;
    private int age;
    
    // 2. Constructor
    public Baker(Cake type, String nm, int yr) {
        this.cakeType = type;
        this.name = nm;
        this.age = yr;
    }
    
    // 3. Setters and Getters
    public void setCakeType(Cake newCakeType){
        this.cakeType = newCakeType;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public Cake getCakeType() {
        return this.cakeType;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    
    //4. toString() method
    public String toString() {
        return "The baker of " + this.cakeType + " is " + this.name + " who is " + this.age + " years old.";
    }
    
    // 5. Compares two Bakers' ages
    public int compareTo(Baker other) {
        if(this.age > other.age) {
            return 1;                            // this Baker is older than the other Baker
        }
        else if(this.age < other.age) {
            return -1;                           // this Baker is younger than the other Baker
        }
        else {
            return 0;                            // The two bakers have the same age
        }
    }
}
