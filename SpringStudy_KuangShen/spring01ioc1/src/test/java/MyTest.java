import com.shengxiang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        // Users will use the level service, not the level of dao
//        UserServiceImpl userServiceImpl = new UserServiceImpl();
//        userServiceImpl.setUserDao(new UserDaoMysqlImpl());
//        userServiceImpl.getUser();

        // 方法2 ： applicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
        userServiceImpl.getUser();

    }
}
