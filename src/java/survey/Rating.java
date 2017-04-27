package survey;
// Generated Feb 23, 2017 6:28:00 AM by Hibernate Tools 4.3.1
//test push

import java.util.HashSet;
import java.util.Set;

/**
 * Rating generated by hbm2java
 */
public class Rating  implements java.io.Serializable {


     private int ratingId;
     private String ratingCode;
     private String ratingDescription;
     private Set<Response> responses = new HashSet<Response>(0);

    public Rating() {
    }

	
    public Rating(int ratingId, String ratingCode, String ratingDescription) {
        this.ratingId = ratingId;
        this.ratingCode = ratingCode;
        this.ratingDescription = ratingDescription;
    }
    public Rating(int ratingId, String ratingCode, String ratingDescription, Set<Response> responses) {
       this.ratingId = ratingId;
       this.ratingCode = ratingCode;
       this.ratingDescription = ratingDescription;
       this.responses = responses;
    }
   
    public int getRatingId() {
        return this.ratingId;
    }
    
    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }
    public String getRatingCode() {
        return this.ratingCode;
    }
    
    public void setRatingCode(String ratingCode) {
        this.ratingCode = ratingCode;
    }
    public String getRatingDescription() {
        return this.ratingDescription;
    }
    
    public void setRatingDescription(String ratingDescription) {
        this.ratingDescription = ratingDescription;
    }
    public Set<Response> getResponses() {
        return this.responses;
    }
    
    public void setResponses(Set<Response> responses) {
        this.responses = responses;
    }




}

