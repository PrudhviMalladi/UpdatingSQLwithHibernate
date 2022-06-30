package com.optimum.Myhibo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.optimum.Myhibo.entity.Department;
import com.optimum.Myhibo.util.HibernateUtil;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 SessionFactory sf= HibernateUtil.getSessionFactory();
         Session s=sf.openSession();
         s.beginTransaction();
         Department dpt = new Department("Prudhvi ","HP001");
         s.save(dpt);
         s.getTransaction().commit();
    }
}
