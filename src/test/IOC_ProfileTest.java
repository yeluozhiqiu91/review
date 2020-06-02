import com.wang.spring.MainConfig;
import com.wang.spring.ProfileConfig;
import com.wang.spring.entity.Color;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Author: wangliujie
 * @Date: 2020/6/1 9:58
 */
public class IOC_ProfileTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProfileConfig.class);
    @Test
    public void test(){
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Color.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
}
