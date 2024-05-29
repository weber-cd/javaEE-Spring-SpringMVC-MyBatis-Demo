import com.mybatis.spring.dao.CustomerDao;
import com.mybatis.spring.po.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {
    @Test
    public void findCustomerByIdDaoTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao customerDao = applicationContext.getBean("customerDao", CustomerDao.class);
        Customer customer = customerDao.findCustomerById(1);
        System.out.println("customer:" + customer);
    }
}
