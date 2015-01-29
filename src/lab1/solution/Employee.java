package lab1.solution;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
   

    public Employee(String fName, String lName,String sSN){
       firstName=fName;
       lastName=lName;
       ssn=sSN;
   }
    
   // Assume this must be performed first
   public void meetWithHrForBenefitAndSalryInfo(HrManager hr) {        
        System.out.println("Met with Hr on " + hr.getDateFormat());
        metWithHr = true;
    }

    // Assume this is must be performed second
    public void meetDepartmentStaff(HrManager hr) {
        if(metWithHr) {
            
            System.out.println("Met with Dept. Staff on " + hr.getDateFormat());
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    public void reviewDeptPolicies(HrManager hr) {
        if(metWithHr && metDeptStaff) {

            System.out.println("Reviewed Dept. Policies on " + hr.getDateFormat());
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    public void moveIntoCubicle(String cubeId,HrManager hr) {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            System.out.println("Moved into cube on " + hr.getDateFormat());
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    
    
}
