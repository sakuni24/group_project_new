package lk.cmb.ucsc.drivingschool.service;

import lk.cmb.ucsc.drivingschool.model.Vehicle;
import lk.cmb.ucsc.drivingschool.repo.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VehicleService  {
    @Autowired
    private VehicleRepo vehicleRepo;


    public void addVehicle(Vehicle vehicle) {
        vehicleRepo.save(vehicle);
    }
}
