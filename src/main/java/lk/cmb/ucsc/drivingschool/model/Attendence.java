package lk.cmb.ucsc.drivingschool.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Attendence {
    @Id
    private ObjectId _id;
    private String name;
    private String date;
    private String attend;

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId id) {
        this._id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAttend() {
        return attend;
    }

    public void setAttend(String attend) {
        this.attend = attend;
    }
}
