/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pedro
 */
public class entityMain {
    private static final EntityManagerFactory ent=Persistence.createEntityManagerFactory("Clinica_UNICAESPU");

public  entityMain(){}

public static final EntityManagerFactory getInstance(){
    return ent;
}

}
