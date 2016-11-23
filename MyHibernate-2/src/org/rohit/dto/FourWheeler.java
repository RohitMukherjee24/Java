package org.rohit.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by rohit on 11/21/2016.
 */
@Entity
//@DiscriminatorValue("Car")
public class FourWheeler extends Vehicle{
    private String steeringWheel;

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }
}
