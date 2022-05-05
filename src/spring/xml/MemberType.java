
package spring.xml;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component @Lazy()
public class MemberType {
    
    
    private String Type ;
    

    @Override
    public String toString() {
        return "MemberType{" + "Type=" + Type + '}';
    }
    
    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
    
}
