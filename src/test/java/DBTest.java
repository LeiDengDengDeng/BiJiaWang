/**
 * Created by deng on 2017/3/7.
 */

import com.model.GoodEntity;
import com.service.SearchService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml"})
//@Transactional(propagation = Propagation.REQUIRED)
public class DBTest {

    @Resource
    private SearchService searchService;

    @Test
    public void testBuildDB() throws Exception {
        String[] s={"iphone"};
        List<GoodEntity> list=searchService.analyse(s);
        for (GoodEntity g:list){
            System.out.println(g.getName());
        }

    }
}
