package org.rohit.dto;

import com.sun.javafx.geom.AreaOp;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SelectBeforeUpdate;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@Entity
@NamedQuery(name = "UserDetails.byId", query = "from Userdetails where userId = ?")
//@NamedNativeQuery(name = "UserDetails.byName" , query = "SELECT  * from User_Details where username = ?", resultClass = Userdetails.class)
@Table (name = "USER_DETAILS")
@org.hibernate.annotations.Entity(selectBeforeUpdate = true)
public class Userdetails {

    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private int userId;
    private String userName;
//    @OneToOne
//    @OneToMany(mappedBy = "user")
//    @JoinColumn (name = "VEHICLE_ID")
//    @JoinTable (name = "USER_VEHICLE", joinColumns =@JoinColumn(name = "USER_ID"),
//    inverseJoinColumns = @JoinColumn(name = "VEHICLE_ID")
//    )
//    @ManyToMany(cascade = CascadeType.ALL)
//    private Collection<Vehicle> VehicleList = new ArrayList<>();
//
//    public Collection<Vehicle> getVehicleList() {
//        return VehicleList;
//    }
//
//    public void setVehicleList(Collection<Vehicle> vehicleList) {
//        VehicleList = vehicleList;
//    }

    //    @ElementCollection(fetch = FetchType.EAGER)
//    @JoinTable(name = "USER_ADDRESS",
//    joinColumns = @JoinColumn(name = "USER_ID"))
//    @GenericGenerator(name="sequence-gen",strategy="sequence")
//    //@CollectionId(columns = {@Column(name = "ADDRESS_ID")} ,generator = "sequence-gen",type = @Type(type ="long"))
//    private Collection<Address> listOfAddresses = new ArrayList<Address>();

//    public Collection<Address> getListOfAddresses() {
//        return listOfAddresses;
//    }
//
//    public void setListOfAddresses(Collection<Address> listOfAddresses) {
//        this.listOfAddresses = listOfAddresses;
//    }

    //    private Set<Address> listOfAddresses = new HashSet<Address>();

//    public Set<Address> getListOfAddresses() {
//        return listOfAddresses;
//    }
//
//    public void setListOfAddresses(Set<Address> listOfAddresses) {
//        this.listOfAddresses = listOfAddresses;
//    }

    //    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name="Street", column = @Column(name="HOME_STREET_NAME")),
//            @AttributeOverride(name="city", column = @Column(name="HOME_CITY_NAME")),
//            @AttributeOverride(name="pincode", column = @Column(name="HOME_PINCODE_NAME")),
//            @AttributeOverride(name="state", column = @Column(name="HOME_STATE_NAME"))
//     })
//    private Address homeAddress;
//    @Embedded
//    private Address officeAddress;
//
//    public Address getHomeAddress() {
//        return homeAddress;
//    }
//
//    public void setHomeAddress(Address homeAddress) {
//        this.homeAddress = homeAddress;
//    }
//
//    public Address getOfficeAddress() {
//        return officeAddress;
//    }
//
//    public void setOfficeAddress(Address officeAddress) {
//        this.officeAddress = officeAddress;
//    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
