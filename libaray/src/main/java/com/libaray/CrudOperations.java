package com.libaray;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CrudOperations {

    public static void main(String[] args) {
        // Get SessionFactory
        SessionFactory factory = Hiber.getSessionFactory();
        
        // Open session
        Session ses = factory.openSession();
        
        // Begin transaction
        Transaction tx = ses.beginTransaction();

        // INSERT 
        //Books p = new Books(1,"Harry Potter"); 
         //ses.save(p);

        //Update
        Books p = new Books(1,"Potter"); 
        //ses.update(p);
        
        //insert the book 2
        //Books p = new Books(2,"Harry Potter"); 
        //ses.save(p);
        
        // delete to delete also which book to delete that should there to call object
        ses.delete(p);
        // Commit transaction
        tx.commit();
        
        // Close session and factory
        ses.close();
        factory.close();
    }
}
