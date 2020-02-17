package lk.cmb.ucsc.drivingschool.controller;

import lk.cmb.ucsc.drivingschool.model.Attendence;
import lk.cmb.ucsc.drivingschool.service.AttendenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/attendence/")
public class AttendenceController {

    @Autowired
    private AttendenceService attendenceService;


    @GetMapping("attendence")
    public String getAttendence(Model model){
        model.addAttribute("attendence",new Attendence());
        return "teacher/attendence";
    }

    @PostMapping("attendence")
    public void addVehicle(@ModelAttribute Attendence attendence){
        attendenceService.createAttendence(attendence);
    }

    @RequestMapping("/teacher/showattend/{id}")
    public String getAttendence(@PathVariable String id, Model model){
        model.addAttribute("attendence", attendenceService.getById(id));
        return "teacher/showattend";
    }
}
