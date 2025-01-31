/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.Course;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CourseDAO extends DBConnection {

    public CourseDAO() {
        super();
        this.connectDB();
    }

    public ArrayList<Course> getCourseList() throws SQLException {
        ArrayList<Course> courseList = new ArrayList<Course>();

        String sql = "SELECT * FROM Course";
        ResultSet rs = this.doReadQuery(sql);
        while (rs.next()) {
            Course item = new Course(
                    rs.getInt("CourseID"),
                    rs.getString("Title"),
                    rs.getInt("Credits"),
                    rs.getInt("DepartmentID")
            );
            
            courseList.add(item);
        }
        return courseList;
    }
    public boolean updateCourse(Course dto) {
        boolean flag;
        String updateSQL = "update Course " +
                           "set Title = ?, " +
                               "Credits = ?, " +
                               "DepartmentID = ? " +
                           "where CourseID = ?";
        try {
            stmt = conn.prepareStatement(updateSQL);
            stmt.setString(1,((Course) dto).getTitle());
            stmt.setInt(2,((Course) dto).getCredits());
            stmt.setInt(3,((Course) dto).getDepartmentId());
            stmt.setInt(4,((Course) dto).getCourseID());
            flag = stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return flag;
    }
    public boolean deleteCourse(Course dto) {
        boolean flag;
        String deleteSQL = "delete Course " +
                           "where CourseID = ?";
        try {
            stmt = conn.prepareStatement(deleteSQL);
            stmt.setInt(1,((Course) dto).getCourseID());
            flag = stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}
