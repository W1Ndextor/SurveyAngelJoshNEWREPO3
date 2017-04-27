package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Angel
 */
@Named(value = "surveyController")
@SessionScoped
public class surveyController implements Serializable {

    String surveyName;
    int userID;
    String response;
    int surveyID;
    surveyHelper helper;
    int userIdArg;
    String valFlag = "true";

    Survey survey;

    /**
     * Creates a new instance of surveyTitleController
     */
    public surveyController() {
        helper = new surveyHelper();
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(int surveyID) {
        this.surveyID = surveyID;
    }
     public String getValFlag() {
        return valFlag;
    }

    public void setValFlag(String valFlag) {
        this.valFlag = valFlag;
    }
    
    
 
    

    public void clear(){
        surveyName=null;
        response=null;
        survey=null;
       surveyID=getSurveyID();
      // valFlag = "true";
    }

    public String getResponse() {
        response = null;
        if (surveyName != null) {

            userID = helper.getUser();
            if (helper.insertSurvey(surveyName, userID) == 1) {
                surveyName = null;
                surveyID = helper.getSurveyID();
                userID = helper.getUser();
                response = "Survey Title Added.";
                valFlag="false";
            } else {
                surveyName = null;
                response = "Survey Title Not Added.";
            }
        } else {
            response = " ";
        }
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
