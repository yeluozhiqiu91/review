import com.wang.spring.MainConfig;
import com.wang.spring.MainOfAOPConfig;
import com.wang.spring.entity.MathCalculator;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wangliujie
 * @Date: 2020/5/25 21:57
 */
public class AOPTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainOfAOPConfig.class);
    @Test
    public void aopTest(){
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        mathCalculator.div(6,3);
    }
}
