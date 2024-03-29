
package org.studyeasy.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.hibernate.entity.Users;

public class App {

  public static void main(String[] args) {
	  
	  SessionFactory factory = new Configuration()
			                   .configure("hibernate.cfg.xml")
			                   .addAnnotatedClass(Users.class)
			                   .buildSessionFactory();
	  
	  Session session = factory.getCurrentSession();
	  
	  try {
		  /*
		  // Create 
		  Users user = new Users("username", "password", "firstName", "lastName");
		  user.setUserId(3);
		  // Start transaction
		  session.beginTransaction();
		  // Perform operation
		  session.save(user);
		  // Commit the transaction 
		  session.getTransaction().commit();
		  System.out.println("Row added!");
		  */
		  
		  
		  /*
		// Update operation
		  Users user = new Users();
		  // Start transaction
		  session.beginTransaction();
		  // Perform operation
		  user = session.get(Users.class, 1);
		  // Updating object
		  user.setUsername("kiran");
		  // Commit the transaction 
		  session.getTransaction().commit();
		  System.out.println(user);
		  
		  */
		  
		  /*
		  //Delete
		// Create object of entity class type
		  Users user = new Users();
		  // Start transaction
		  session.beginTransaction();
		  // Perform operation
		  user = session.get(Users.class, 2);
		  //Deleting a Record with user id 8
		  session.delete(user);
		  
		  // Commit the transaction 
		  session.getTransaction().commit();
		  System.out.println(user);
		  
		  */
		  
		  //HQL
		  session.beginTransaction();
		  session.createQuery("update Users set password = 'pass@123' where first_name = 'firstName'").executeUpdate(); // first letter of the table name is capital
		  session.getTransaction().commit();
		  
		
	} finally {
		session.close();
		factory.close();
	}
	
}
}



