package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        User user = new User();
        user.setId(1);
        user.setName("riki");
        user.setEmail("riki@gmail.com");
        session.save(user);
        tx.commit();
        session.close();
    }
}
