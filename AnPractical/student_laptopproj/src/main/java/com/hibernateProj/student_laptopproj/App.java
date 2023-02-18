package com.hibernateProj.student_laptopproj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // create a new student and laptop
        Student student = new Student("John Doe");
        Laptop laptop = new Laptop("Dell");

        // set the laptop for the student
        student.setLaptop(laptop);
        laptop.setStudent(student);

        // save the student and laptop to the database
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        session.save(student);
        session.save(laptop);

        session.getTransaction().commit();

        // close the session factory
        sessionFactory.close();
    }
}
