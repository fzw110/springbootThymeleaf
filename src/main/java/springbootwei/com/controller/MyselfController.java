package springbootwei.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import springbootwei.com.pojo.Myself;
import springbootwei.com.service.MyselfService;
import java.util.List;

@Controller
public class MyselfController {
    @Autowired
    MyselfService myselfService;
    @RequestMapping("lists")
    public String myselfController(Model model){
        List<Myself> list=myselfService.myselfList();
        for(int i=0;i<list.size();i++){

            System.out.println("集合----"+list.get(i));
        }
        model.addAttribute("list",list);
        return "index";
    }
    @RequestMapping("delete")
    public String myselfDelete(int id){
        myselfService.deleteMyself(id);
        return "redirect:lists";
    }
    @RequestMapping("add")
    public String myselfAdd(Myself myself){

        myselfService.addMyself(myself);
        return "redirect:lists";
    }
    @RequestMapping("edit")
    public String myselfEdit(Myself myself,Model model){
        Myself m=myselfService.queryOne(myself.getId());

        System.out.println("对象------------------------"+m);



        model.addAttribute("self",m);


        return "edit";
    }
    @RequestMapping("update")
    public String update(Myself myself){
        System.out.println("============="+myself);
        myselfService.editMyself(myself);
        return "redirect:lists";
    }

}
