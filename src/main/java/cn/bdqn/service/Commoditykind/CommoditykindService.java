package cn.bdqn.service.Commoditykind;

import cn.bdqn.entity.Commoditykind;

import java.util.List;

/**
 * Created by houlingfeng on 2018/3/20.
 */
public interface CommoditykindService {
    //查询parentid是0的
    public List<Commoditykind> queryParentidBy0();
    //查询commtypeid时1
    public Commoditykind queryCommTypeIdBy1();
    //查询parentid时1
    public Commoditykind queryCommTypeIdBy12();
    //查询parentid是12的
    public List<Commoditykind> queryParentidBy12();
}
