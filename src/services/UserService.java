/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.MyDB;

/**
 *
 * @author yasmi
 */
public class UserService {
      Connection cnx;

    public UserService() {
        cnx = MyDB.getInstance().getCnx();
    }
    public List<User> recupererById(User t) throws SQLException {
    List<User> users = new ArrayList<>();
    String req = "SELECT * FROM User WHERE id = " + t.getId();
    Statement st = cnx.createStatement();
    ResultSet rs = st.executeQuery(req);
    while (rs.next()) {
        User p = new User();
        p.setId(rs.getInt("id"));
        p.setLogin(rs.getString("login"));
        p.setRoles(rs.getString("roles"));
        p.setPassword(rs.getString("password"));
        p.setNom(rs.getString("nom"));
        p.setPrenom(rs.getString("prenom"));
        p.setTelephone(rs.getString("telephone"));
        p.setBlocked(rs.getInt("blocked"));
        p.setTypeuser(rs.getString("typeuser"));
        p.setEmail(rs.getString("email"));
        users.add(p);
    }
    return users;
}

    
}
