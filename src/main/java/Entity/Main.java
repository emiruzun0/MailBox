/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import com.mycompany.proje2.Message;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Administrator
 */
public class Main implements Serializable {
    
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("MessageUnit");
    static EntityManager em = emf.createEntityManager();

//    public static void main(String[] args) {
//        
//        
//        
//        
//        
//
//        em.getTransaction().begin();
//
//        String temp = String.valueOf(5);
//        Message message = new Message(temp,temp, temp, temp, temp, temp, temp);   
//        em.persist(message); /* (exception thrown here) */
//
//        em.getTransaction().commit();
//        
//        
//        
//        //getAllFroms();
//
//        em.close();
//        emf.close();
//    }
    
  



   /* public static void add(){
        factory = Persistence.createEntityManagerFactory("MessageUnit");
        entityManager = factory.createEntityManager();

        for(int i = 1;i<=5;++i) {
            entityManager.getTransaction().begin();
            String temp = String.valueOf(i);
            Message message = new Message(temp,temp, temp, temp, temp, temp, temp);
            entityManager.persist(message);
            entityManager.getTransaction().commit();    //Add to database
        }

        List<Message> resultList = getAll();
        resultList.forEach(message2 -> {
            System.out.println(message2.toString());
        }); //assertEquals(3,resultList.size());


    }*/
    

    public static void getAllFroms(JList jlist) {
//        return em
//                .createQuery("SELECT m.messageFrom FROM Message m", Message.class)
//                .getResultList();

        
        Query query = em.createNamedQuery("Message.findAll");
        List<Message> result = query.getResultList();
        DefaultListModel model = new DefaultListModel();
        /*for(int i = 0;i<result.size();++i) model.addElement(String.valueOf(result.get(i).getMessageID() +
                " - " + result.get(i).getMessageFrom()));*/
        for(int i = 0;i<result.size();++i) model.addElement(String.valueOf(result.get(i).getMessageID()));
        jlist.setModel(model);

    }

    public static Message findMessageObject(String messageID) {
        
        Message message = (Message) em.createNamedQuery("Message.findByMessageID").setParameter("messageID", Integer.parseInt(messageID)).
                getSingleResult();
        
        //return result.get(0).toString();
        
        
        
        return message;
    }
    
    
    
}
