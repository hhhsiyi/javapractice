import com.hewen.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testMethodAutowireByName() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.getCat().shout();
        user.getDog().shout();

    }
    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("newbeans.xml");
        User user = (User) context.getBean("user");
        user.getCat().shout();
        user.getDog().shout();
    }
    @Test
    public void testMethodAutowireByType() {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowirebeansbytype.xml");
        User user = (User) context.getBean("user");
        user.getCat().shout();
        user.getDog().shout();
    }
    @Test
    public void testMethodAutowireAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationbean.xml");
        User user = (User) context.getBean("user");
        user.getCat().shout();
        user.getDog().shout();
    }
    @Test
    public void testqualifier() {
        ApplicationContext context = new ClassPathXmlApplicationContext("qualifierbean.xml");
        User user = (User) context.getBean("user");
        user.getCat().shout();
        user.getDog().shout();
    }
}