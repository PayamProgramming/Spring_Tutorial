
package spring.xml;

public class Inheritence {
    
    private String Street ;
    private String City ;

    @Override
    public String toString() {
        return "Inheritence{" + "Street=" + Street + ", City=" + City + '}';
    }
    
    

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    
    
    
}
