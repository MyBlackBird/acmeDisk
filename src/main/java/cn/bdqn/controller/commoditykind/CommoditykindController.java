package cn.bdqn.controller.commoditykind;

import cn.bdqn.entity.Commoditykind;
import cn.bdqn.service.Commoditykind.CommoditykindService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by houlingfeng on 2018/3/20.
 */
@Controller
@RequestMapping("commodity")
public class CommoditykindController {
    @Resource
    private CommoditykindService commoditykindService;


    @RequestMapping(value = "queryCommTypeIdBy1")
    public String queryCommTypeIdBy1(Model model){
        Commoditykind commoditykind = commoditykindService.queryCommTypeIdBy1();
        String name = commoditykind.getTypeName();
        String typeName = commoditykindService.queryCommTypeIdBy12().getTypeName();
        model.addAttribute("typeName", typeName);
        List<Commoditykind> list = commoditykindService.queryParentidBy12();
        model.addAttribute("list", list);
        System.out.println(name);
        model.addAttribute("name", name);
        return "index";
    }
}
