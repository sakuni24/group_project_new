package lk.cmb.ucsc.drivingschool.service;

import lk.cmb.ucsc.drivingschool.model.Attendence;
import lk.cmb.ucsc.drivingschool.repo.AttendenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendenceService {

    @Autowired
    private AttendenceRepo attendenceRepo;

    public void createAttendence(Attendence attendence){
        attendenceRepo.save(attendence);
    }

    List<Attendence> listAll() {
        return null;
    }

    public Attendence getById(String id) {
        return null;
    }
}
