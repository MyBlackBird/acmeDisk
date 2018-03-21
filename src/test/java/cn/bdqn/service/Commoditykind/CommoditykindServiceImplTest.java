package cn.bdqn.service.Commoditykind;

import cn.bdqn.entity.Commoditykind;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by houlingfeng on 2018/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CommoditykindServiceImplTest {

    @Resource
    private CommoditykindService commoditykindService;

    @Test
    public void queryParentidBy0() throws Exception {
        List<Commoditykind> list = commoditykindService.queryParentidBy0();
        if (list != null) {
            for (Commoditykind commoditykind : list) {
                System.out.println(commoditykind);
            }
        }
    }

    @Test
    public void queryCommTypeIdBy1() throws Exception {
        Commoditykind commoditykind = commoditykindService.queryCommTypeIdBy1();
        System.out.println(commoditykind);
    }

    @Test
    public void queryParentidBy1() throws Exception {
        Commoditykind commoditykind = commoditykindService.queryCommTypeIdBy12();
        System.out.println(commoditykind);
    }

    @Test
    public void queryParentidBy12() throws Exception {
        List<Commoditykind> list = commoditykindService.queryParentidBy12();
        if (list != null) {
            for (Commoditykind commoditykind : list) {
                System.out.println(commoditykind);
            }
        }
    }

}