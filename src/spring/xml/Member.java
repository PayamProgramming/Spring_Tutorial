
package spring.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Member {
    
   
    private String name ;
    
    private String family ;
    
    @Autowired // Constructor Filled InjecTion 
    private MemberType id ;

    @Override
    public String toString() {
        return "Member{" + "name=" + name + ", family=" + family + ", id=" + id + '}';
    }

    public MemberType getId() {
        return id;
    }

    public void setId(MemberType id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

     @Value(value = "name") // AutoWired For Primitive Datas
    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
    
    
}
