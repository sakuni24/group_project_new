package lk.cmb.ucsc.drivingschool.controller.Admin.Sheduling;

import lk.cmb.ucsc.drivingschool.model.Shedules;
import lk.cmb.ucsc.drivingschool.model.User;
import lk.cmb.ucsc.drivingschool.repo.SheduleRepo;
import lk.cmb.ucsc.drivingschool.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/admin/scheduling/")
public class Sheduling {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private SheduleRepo sheduleRepo;

    @GetMapping("daily")
    public String getDaily(Model model){
        model.addAttribute("shedule",new Shedules());
        List<User> user=new ArrayList<>();
        List<User> users=userRepo.findAll();
        List<Shedules> shedulesList=sheduleRepo.findAll();
        model.addAttribute("user",user);
        model.addAttribute("users", users);
        model.addAttribute("sheduleList",shedulesList);
        return "admin/scheduling/daily";
    }
    @PostMapping("daily")
    public String saveShedule(@ModelAttribute Shedules shedules,Model model){
        List<User> user=new ArrayList<>();
        List<User> users=userRepo.findAll();
        List<Shedules> shedulesList=sheduleRepo.findAll();
        model.addAttribute("user",user);
        model.addAttribute("users", users);
        model.addAttribute("sheduleList",shedulesList);
        sheduleRepo.save(shedules);
        return "admin/admin";
    }


}
