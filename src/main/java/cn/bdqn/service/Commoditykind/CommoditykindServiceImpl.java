package cn.bdqn.service.Commoditykind;

import cn.bdqn.dao.Commoditykind.CommoditykindMapper;
import cn.bdqn.entity.Commoditykind;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by houlingfeng on 2018/3/20.
 */
@Service
public class CommoditykindServiceImpl implements CommoditykindService {

    @Resource
    private CommoditykindMapper commoditykindMapper;

    public List<Commoditykind> queryParentidBy0() {
        return commoditykindMapper.queryParentidBy0();
    }

    public Commoditykind queryCommTypeIdBy1() {
        return commoditykindMapper.queryCommTypeIdBy1();
    }

    public Commoditykind queryCommTypeIdBy12() {
        return commoditykindMapper.queryCommTypeIdBy12();
    }

    public List<Commoditykind> queryParentidBy12() {
        return commoditykindMapper.queryParentidBy12();
    }
}
