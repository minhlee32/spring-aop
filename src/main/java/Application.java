import com.spring.demo.AccountDao;
import com.spring.demo.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AccountDao accountDao = context.getBean("accountDao", AccountDao.class);

        accountDao.addAccount();

        context.close();
    }
}
