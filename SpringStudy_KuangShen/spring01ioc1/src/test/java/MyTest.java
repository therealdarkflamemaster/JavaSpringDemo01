import com.shengxiang.dao.UserDaoMysqlImpl;
import com.shengxiang.service.UserService;
import com.shengxiang.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {

        // Users will use the level service, not the level of dao
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.setUserDao(new UserDaoMysqlImpl());
        userServiceImpl.getUser();
    }
}
