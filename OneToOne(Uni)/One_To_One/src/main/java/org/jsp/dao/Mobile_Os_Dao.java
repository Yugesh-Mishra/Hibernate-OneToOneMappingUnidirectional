package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import org.jsp.dto.Mobile;
import org.jsp.dto.Os;

public class Mobile_Os_Dao {

       private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
       private EntityManager entityManager=entityManagerFactory.createEntityManager();
       private EntityTransaction entityTransaction=entityManager.getTransaction();
       
       public void saveMobile(Mobile mobile) {
    	   entityTransaction.begin();
    	   entityManager.persist(mobile);
    	   entityTransaction.commit();
       }
       
       public void saveOs(Os os) {
    	   entityTransaction.begin();
    	   entityManager.persist(os);
    	   entityTransaction.commit();
       }
       
       public void updateMobile(Mobile mobile) {
    	   entityTransaction.begin();
    	   entityManager.merge(mobile);
    	   entityTransaction.commit();
       }
       
       
       //for find we have to override toString() method 
       public void findMobile(int id) {
    	   Mobile mobile=entityManager.find(Mobile.class, id);
    	   entityTransaction.begin();
    	   if(mobile !=null)
    			{
    				System.out.println(mobile);
    			}
    			else {
    				System.out.println("Id not found");
    			}
    	//   System.out.println(mobile);
       }
       
       
       public void deleteMobile(int id) {
    	Mobile mobile=entityManager.find(Mobile.class, id);
   		entityTransaction.begin();
   		if(mobile != null)
   		{
   			entityManager.remove(mobile);
   			entityTransaction.commit();
   		}
   		else {
   			System.out.println("Object not found");
   		}
       }
       
     //to fetch all the records from database
       public List<Mobile> fetchAllMobile() {
     		Query query=entityManager.createQuery("select a From Mobile a");
     		return query.getResultList();
     		//System.out.println(list);
       }
}
