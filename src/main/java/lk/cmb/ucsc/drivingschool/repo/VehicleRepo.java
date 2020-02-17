package lk.cmb.ucsc.drivingschool.repo;

import lk.cmb.ucsc.drivingschool.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepo extends MongoRepository<Vehicle,String> {

}
