import com.wang.spring.MainConfig;
import com.wang.spring.entity.Color;
import com.wang.spring.entity.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wangliujie
 * @Date: 2020/5/25 21:57
 */
public class IOCTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
    @Test
    public void personTest(){
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
        /*Person person1 = (Person) applicationContext.getBean("person");
        Person person2 = (Person) applicationContext.getBean("person");
        System.out.println(person1==person2);
        applicationContext.close();*/
        Object object1 = applicationContext.getBean("myFactoryBean");//得到MyFactoryBean里面返回的bean
        Object object2 = applicationContext.getBean("&myFactoryBean");//得到MyFactoryBean本身
        System.out.println(object1);
        System.out.println(object2);
    }
}
