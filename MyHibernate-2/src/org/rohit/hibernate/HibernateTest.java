package org.rohit.hibernate;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.rohit.dto.*;

import java.util.List;
import java.util.Map;


public class HibernateTest {
    public static void main(String[] args) {
//
//        Userdetails user = new Userdetails();
//
//        user.setUserName("Test User");

/*        Vehicle vehicle  = new Vehicle();
        vehicle.setVehicleName("Car");

        Twowheeler bike = new Twowheeler();
        bike.setVehicleName("R15");
        bike.setSteeringHandle("bike steeing");

        FourWheeler car = new FourWheeler();
        car.setVehicleName("Acura");
        car.setSteeringWheel("car steering");

        Vehicle vehicle1  = new Vehicle();
        vehicle1.setVehicleName("Jeep");

        userDetails.getVehicleList().add(vehicle);
        userDetails.getVehicleList().add(vehicle1);

        vehicle.getUserDetailsList().add(userDetails);
        vehicle1.getUserDetailsList().add(userDetails);

        Address addr = new Address();
        addr.setCity("Hyd");
        addr.setPincode("50055");
        addr.setState("AP");
        addr.setStreet("544 mills ln");

        Address addr1 = new Address();
        addr1.setCity("Hyd1");
        addr1.setPincode("500551");
        addr1.setState("AP1");
        addr1.setStreet("544 mills ln1");

        userDetails.getListOfAddresses().add(addr);
        userDetails.getListOfAddresses().add(addr1);


        userDetails.setHomeAddress(addr);

        Address addr2 = new Address();
        addr2.setState("TX");
        addr2.setPincode("75062");

        userDetails.setOfficeAddress(addr);*/

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
//        String minUserId = "5 or 1 = 1";
//        String minUserId = "8";
//        String userName = "User8";

//        Query query = session.createQuery("select new map(userId,userName) from Userdetails");
//        Query query = session.createQuery("from Userdetails where userId > ? and userName= ?");
//        Query query = session.createQuery("from Userdetails where userId >:userId and userName= :userName");
//        query.setParameter("userId",Integer.parseInt(minUserId));
//        query.setParameter("userName",userName);
//        query.setParameter(0,Integer.parseInt(minUserId));
//        query.setParameter(1,userName);
//        query.setFirstResult(5);
//        query.setMaxResults(4);

//        Query query = session.getNamedQuery("UserDetails.byId");
//        Query query = session.getNamedQuery("UserDetails.byName");
// //       query.setParameter(0,2);
//        query.setParameter(0,"User8");

        Criteria criteria = session.createCriteria(Userdetails.class);

        criteria.add(Restrictions.eq("userName", "User8"));

        List<Userdetails> users = (List<Userdetails>) criteria.list();
        session.getTransaction().commit();
        session.close();

        for (Userdetails user : users)
        {
            System.out.println(user.getUserId());
        }

//        Userdetails user = (Userdetails) session.get(Userdetails.class,1);



//        user.setUserName("Updated username after session close");
//
//        session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.update(user);
//        user.setUserName("change new update");
//        session.getTransaction().commit();
//        session.close();


//        session.save(user);
//        user.setUserName("Updated User");
//        user.setUserName("Updated User Again");

//        for(int i=0;i<10;i++) {
//            Userdetails userDetails = new Userdetails();
//            userDetails.setUserName("User" + i);
//            session.save(userDetails);
//        }



//        Userdetails user = (Userdetails) session.get(Userdetails.class, 6);
////      session.delete(user);
//        user.setUserName("hello");
//        session.update(user);

//        session.save(userDetails);
//        session.save(vehicle);
//        session.save(vehicle1);
//        session.save(car);
//        session.save(bike);

//        user.setUserName("Updated User LAST");

        // eager fetch 1st level cache
//        System.out.print("User name pulled :" + user.getUserName());

//        userDetails = null;
//
//        session  = sessionFactory.openSession();
//        userDetails = (Userdetails) session.get(Userdetails.class, 1);
//        session.close();
//        System.out.println(userDetails.getListOfAddresses().size());

    }
}
