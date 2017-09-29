/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussines;

/**
 *
 * @author Ekrem Mujic
 */
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DBUtill {   
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("TOBA4PU");
    
    public static EntityManagerFactory getEmFactory() {
return emf;

}    
}