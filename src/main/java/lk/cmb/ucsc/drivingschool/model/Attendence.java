package lk.cmb.ucsc.drivingschool.model;

//import org.bson.types.ObjectId;
//import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Attendence {

    private String id;
    private String name;
    private String date;
    private String attend;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAttend() { return attend; }

    public void setAttend(String attend) {
        this.attend = attend;
    }
}
