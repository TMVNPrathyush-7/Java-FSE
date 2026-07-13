package com.cognizant.ormlearn;

import com.cognizant.ormlearn.entity.Country;
import com.cognizant.ormlearn.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        Country country = session.get(Country.class, "IN");

        System.out.println(country);

        session.close();
        sessionFactory.close();
    }
}