package spring.xml;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ctx = null;
        try {
            ctx = new ClassPathXmlApplicationContext("Spring.xml");
        } catch (BeansException e) {
            e.printStackTrace();
        }
        Member m = (Member) ctx.getBean("memberid");
        // m.setName("a");
        m.setFamily("33");

        MemberType mt = ctx.getBean(MemberType.class);
        mt.setType("Doctor");
        m.setId(mt);

        Inheritence i = (Inheritence) ctx.getBean("Inheritenceid");
        i.setCity("Tehran");
        i.setStreet("Saadat Abad");
        
        Inheritence_Test it = (Inheritence_Test) ctx.getBean("InheritenceTestid");

        System.out.println(mt.toString());
        System.out.println(m.toString());
        System.out.println(i.toString());
        System.out.println(it.toString());
    }

}
