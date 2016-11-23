package org.rohit.dto;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by rohit on 11/21/2016.
 */

@Entity
//@Inheritance(strategy = InheritanceType.JOINED)

public class Vehicle {
    @Id @GeneratedValue
    private int vehicleId;
    private String vehicleName;

//    @ManyToOne
////    @NotFound(action = NotFoundAction.IGNORE)
////    private Userdetails user;
//    private Collection<Userdetails> userDetailsList = new ArrayList<>();
//
//    public Collection<Userdetails> getUserDetailsList() {
//        return userDetailsList;
//    }
//
//    public void setUserDetailsList(Collection<Userdetails> userDetailsList) {
//        this.userDetailsList = userDetailsList;
//    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
