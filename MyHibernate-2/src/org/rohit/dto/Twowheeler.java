package org.rohit.dto;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by rohit on 11/21/2016.
 */
@Entity
//@DiscriminatorValue("Bike")
public class Twowheeler extends Vehicle{
    private String steeringHandle;

    public String getSteeringHandle() {
        return steeringHandle;
    }

    public void setSteeringHandle(String steeringHandle) {
        this.steeringHandle = steeringHandle;
    }
}
