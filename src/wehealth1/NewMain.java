/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wehealth1;

import java.sql.Connection;
import utils.MyDB;

/**
 *
 * @author yasmi
 */
public class NewMain {

    static Connection cnx;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cnx = MyDB.getInstance().getCnx();
        
    }
    
}
