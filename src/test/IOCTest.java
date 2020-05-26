import com.wang.spring.MainConfig;
import com.wang.spring.entity.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wangliujie
 * @Date: 2020/5/25 21:57
 */
public class IOCTest {
    @Test
    public void personTest(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }
}
