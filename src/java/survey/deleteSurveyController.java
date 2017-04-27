
package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Angel
 */
@Named(value = "deleteSurveyController")
@SessionScoped
public class deleteSurveyController implements Serializable {

    DataModel surveyTitle;
    int surveyId;
    String response;
    int deleteSurvey;
    int userIdArg;
    int surveyIdArg;
    int respondentIdArg;
    int userId;
    int respondentId;
        
    deleteSurveyHelper helper;
    Survey survey;
    
    public deleteSurveyController() {
        helper = new deleteSurveyHelper();
    }

    public DataModel getSurveyTitle() {
        if(surveyTitle == null){
            surveyTitle = new ListDataModel(helper.getSurveyTitleByID(surveyId, userId));
        }
        return surveyTitle;
    }

    public void setSurveyTitle(DataModel surveyTitle) {
        this.surveyTitle = surveyTitle;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public String deleteSurvey(int surveyId) {
        helper.deleteSurvey(surveyId);
        return "delete";       
    }

    public void setDeleteSurvey(int deleteSurvey) {
        this.deleteSurvey = surveyId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRespondentId() {
        return respondentId;
    }

    public void setRespondentId(int respondentId) {
        this.respondentId = respondentId;
    }
    
    public String getUserIds(int surveyIdArg, int userIdArg){
        surveyId = surveyIdArg;
        userId = userIdArg;
        return "deleteSurvey";
    }
     
    
}
