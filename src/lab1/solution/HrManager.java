/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mark
 */
public class HrManager {
    
    private Date currentDate;
    private Employee employee;
    private String cubeId;
     public HrManager(String fName, String lName,String sSN) {
        employee = new Employee(fName,lName,sSN);
        currentDate = new Date();
    }
     public void newEmployee (String cubeId){
        employee.meetWithHrForBenefitAndSalryInfo();
        employee.meetDepartmentStaff();
        employee.reviewDeptPolicies();
        employee.moveIntoCubicle(cubeId);
    }
    

    public String getStatus() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(currentDate);

        if(employee.isMetWithHr() && employee.isMetDeptStaff()
           && employee.isReviewedDeptPolicies()&& employee.isMovedIn()) {
            return "Orientation is completed on: " + fmtDate;
        } else {
            return fmtDate + ": Orientation in progress...";
        }
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public String getCubeId() {
        return cubeId;
    }
    
    
}
