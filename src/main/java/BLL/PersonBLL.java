/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAO.PersonDAO;
import DTO.Person;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class PersonBLL {
    private PersonDAO dao = new PersonDAO();
    
    public ArrayList<Person> getStudents() throws SQLException {
        return dao.getStudents();
    }
    
    public ArrayList<Person> getInstructor() throws SQLException {
        return dao.getInstructor();
    }
}