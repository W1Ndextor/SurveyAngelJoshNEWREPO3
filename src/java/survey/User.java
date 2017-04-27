package survey;
// Generated Feb 23, 2017 6:28:00 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private int userId;
     private String UserFname;
     private String UserLname;
     private String UserEmail;
     private Set<Survey> surveys = new HashSet<Survey>(0);

    public User() {
    }

	
    public User(String UserFname, String UserLname, String UserEmail) {
        this.UserFname = UserFname;
        this.UserLname = UserLname;
        this.UserEmail = UserEmail;
    }
    public User(String UserFname, String UserLname, String UserEmail, Set<Survey> surveys) {
       this.UserFname = UserFname;
       this.UserLname = UserLname;
       this.UserEmail = UserEmail;
       this.surveys = surveys;
    }
   
    public int getUserId() {
        return this.userId;
    } 
    
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserFname() {
        return this.UserFname;
    }
    
    public void setUserFname(String userFname) {
        this.UserFname = userFname;
    }
    public String getUserLname() {
        return this.UserLname;
    }
    
    public void setUserLname(String userLname) {
        this.UserLname = userLname;
    }
    public String getUserEmail() {
        return this.UserEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.UserEmail = userEmail;
    }
    
    public Set<Survey> getSurveys() {
        return this.surveys;
    }
    
    public void setSurveys(Set<Survey> surveys) {
        this.surveys = surveys;
    }




}

