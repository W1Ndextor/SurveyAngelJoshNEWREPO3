
package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;


/**
 *
 * @author Angel
 */
@Named(value = "respondentController")
@SessionScoped
public class respondentController implements Serializable {

    String respondentEmail;
    String respondentEmail1;
    String respondentEmail2;
    String respondentEmail3;
    String respondentEmail4;
    String response;
    
    String surveyTitle;
    
    int surveyId;
    int respondentId;
    int surveyIdArg;
    int userIdArd;
    int userID;
    
    String valFlag = "true";
    
    
    respondentHelper helper;
    
    Respondent respondent;
    Survey survey;
    
    private Respondent selected;
    
    private int selectedId;
    
    String emailAddress;
    String emailResponse;
    
    public respondentController() {
        helper = new respondentHelper();        
    }

    public String getRespondentEmail() {
        return respondentEmail;
    }

    public void setRespondentEmail(String respondentEmail) {
        this.respondentEmail = respondentEmail;
    }

    public String getRespondentEmail1() {
        return respondentEmail1;
    }

    public void setRespondentEmail1(String respondentEmail1) {
        this.respondentEmail1 = respondentEmail1;
    }

    public String getRespondentEmail2() {
        return respondentEmail2;
    }

    public void setRespondentEmail2(String respondentEmail2) {
        this.respondentEmail2 = respondentEmail2;
    }   

    public String getRespondentEmail3() {
        return respondentEmail3;
    }

    public void setRespondentEmail3(String respondentEmail3) {
        this.respondentEmail3 = respondentEmail3;
    }

    public String getRespondentEmail4() {
        return respondentEmail4;
    }

    public void setRespondentEmail4(String respondentEmail4) {
        this.respondentEmail4 = respondentEmail4;
    }

    
    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
     public String getSurveyIds(int surveyIdArg, int userIdArg){
        surveyId = surveyIdArg;
        userID = userIdArg;
        return "respondent";
    }
   
    public int getRespondentId() {
        return respondentId;
    }

    public void setRespondentId(int respondentId) {
        this.respondentId = respondentId;
    }

    public Respondent getSelected() {
        if(selected == null){
            selected = new Respondent();
        }
        return selected;
    }

    public void setSelected(Respondent selected) {
        this.selected = selected;
    }

    public int getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(int selectedId) {
        this.selectedId = selectedId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    
    public String getValFlag() {
        return valFlag;
    }

    public void setValFlag(String valFlag) {
        this.valFlag = valFlag;
    }
    

    public String getSurveyTitle() {
        surveyTitle = helper.getSurveyTitleByID(surveyId, userID);
        return surveyTitle;
    }

    public void setSurveyTitle(String surveyTitle) {
        this.surveyTitle = surveyTitle;
    }    
    
    public String getEmailResponse() {
        
        emailResponse = null;
        
        
        if(respondentEmail != null  && !respondentEmail.isEmpty()){
            
            int result = 0;
            
            // Need to build the html body here. Look at YouTube
            StringBuilder emailBody = new StringBuilder();
            emailBody.append("<table width=\"100%\" height=\"100%\" style=");
            emailBody.append("\"background-color: transparent; border-spacing: 0; border-collapse: collapse; border-top: 1px");
            emailBody.append("><tbody>");
            emailBody.append("<tr><td style=");
            emailBody.append("\"padding: .5em 1em; vertical-align: top; text-align: left; border-bottom: 1px");
            emailBody.append(">You've been asked to complete the following survey entitled " + getSurveyTitle() + ".");
            emailBody.append("</td></tr>");
            emailBody.append("<tr><td style=");
            emailBody.append(">http://localhost:8080/SurveyAngelJoshNEWREPO/</td><td style=>");
            emailBody.append("</td></tr>");
            emailBody.append("</tbody></table>");
            
            String subject = "Please Respond to the Following Survey";
            
            HTMLEmailHelper emailHelper = new HTMLEmailHelper();
            result = emailHelper.send(respondentEmail, subject, emailBody.toString());
            
            if(result == 1){
                emailAddress = null;
                emailResponse = "A Email Was Sent.";
            }else{
                emailAddress = null;
                emailResponse = "Email Not Sent.";
            }
        }
        
        if(respondentEmail1 != null  && !respondentEmail1.isEmpty()){
            
            int results = 0;
            
            
            // Need to build the html body here. Look at YouTube
            StringBuilder emailBody = new StringBuilder();
            emailBody.append("<table width=\"100%\" height=\"100%\" style=");
            emailBody.append("\"background-color: transparent; border-spacing: 0; border-collapse: collapse; border-top: 1px");
            emailBody.append("><tbody>");
            emailBody.append("<tr><td style=");
            emailBody.append("\"padding: .5em 1em; vertical-align: top; text-align: left; border-bottom: 1px");
            emailBody.append(">You've been asked to complete the following survey entitled " + getSurveyTitle() + ".");
            emailBody.append("</td></tr>");
            emailBody.append("<tr><td style=");
            emailBody.append(">http://localhost:8080/SurveyAngelJoshNEWREPO/</td><td style=>");
            emailBody.append("</td></tr>");
            emailBody.append("</tbody></table>");
            
            String subject = "Please Respond to the Following Survey";
            
            HTMLEmailHelper emailHelper = new HTMLEmailHelper();
            results = emailHelper.send(respondentEmail1, subject, emailBody.toString());
            
            if(results == 1){
                emailAddress = null;
                emailResponse = "Two Emails Were Sent.";
            }else{
                emailAddress = null;
                emailResponse = "Emails Were Not Sent.";
            }
        }
        
        if(respondentEmail2 != null  && !respondentEmail2.isEmpty()){
            
            int result3 = 0;
            
            // Need to build the html body here. Look at YouTube
            StringBuilder emailBody = new StringBuilder();
            emailBody.append("<table width=\"100%\" height=\"100%\" style=");
            emailBody.append("\"background-color: transparent; border-spacing: 0; border-collapse: collapse; border-top: 1px");
            emailBody.append("><tbody>");
            emailBody.append("<tr><td style=");
            emailBody.append("\"padding: .5em 1em; vertical-align: top; text-align: left; border-bottom: 1px");
            emailBody.append(">You've been asked to complete the following survey entitled " + getSurveyTitle() + ".");
            emailBody.append("</td></tr>");
            emailBody.append("<tr><td style=");
            emailBody.append(">http://localhost:8080/SurveyAngelJoshNEWREPO/</td><td style=>");
            emailBody.append("</td></tr>");
            emailBody.append("</tbody></table>");
            
            String subject = "Please Respond to the Following Survey";
            
            HTMLEmailHelper emailHelper = new HTMLEmailHelper();
            result3 = emailHelper.send(respondentEmail2, subject, emailBody.toString());
            
            if(result3 == 1){
                emailAddress = null;
                emailResponse = "Three Emails Were Sent.";
            }else{
                emailAddress = null;
                emailResponse = "Emails Not Sent.";
            }
        }
        
        if(respondentEmail3 != null  && !respondentEmail3.isEmpty()){
            
            int result4 = 0;
            
            // Need to build the html body here. Look at YouTube
            StringBuilder emailBody = new StringBuilder();
            emailBody.append("<table width=\"100%\" height=\"100%\" style=");
            emailBody.append("\"background-color: transparent; border-spacing: 0; border-collapse: collapse; border-top: 1px");
            emailBody.append("><tbody>");
            emailBody.append("<tr><td style=");
            emailBody.append("\"padding: .5em 1em; vertical-align: top; text-align: left; border-bottom: 1px");
            emailBody.append(">You've been asked to complete the following survey entitled " + getSurveyTitle() + ".");
            emailBody.append("</td></tr>");
            emailBody.append("<tr><td style=");
            emailBody.append(">http://localhost:8080/SurveyAngelJoshNEWREPO/</td><td style=>");
            emailBody.append("</td></tr>");
            emailBody.append("</tbody></table>");
            
            String subject = "Please Respond to the Following Survey";
            
            HTMLEmailHelper emailHelper = new HTMLEmailHelper();
            result4 = emailHelper.send(respondentEmail3, subject, emailBody.toString());
            
            if(result4 == 1){
                emailAddress = null;
                emailResponse = "Four Emails Were Sent.";
            }else{
                emailAddress = null;
                emailResponse = "Emails Were Not Sent.";
            }
        }
        
        if(respondentEmail4 != null  && !respondentEmail4.isEmpty()){
            
            int result5 = 0;
            
            // Need to build the html body here. Look at YouTube
            StringBuilder emailBody = new StringBuilder();
            emailBody.append("<table width=\"100%\" height=\"100%\" style=");
            emailBody.append("\"background-color: transparent; border-spacing: 0; border-collapse: collapse; border-top: 1px");
            emailBody.append("><tbody>");
            emailBody.append("<tr><td style=");
            emailBody.append("\"padding: .5em 1em; vertical-align: top; text-align: left; border-bottom: 1px");
            emailBody.append(">You've been asked to complete the following survey entitled " + getSurveyTitle() + ".");
            emailBody.append("</td></tr>");
            emailBody.append("<tr><td style=");
            emailBody.append(">http://localhost:8080/SurveyAngelJoshNEWREPO/</td><td style=>");
            emailBody.append("</td></tr>");
            emailBody.append("</tbody></table>");
            
            String subject = "Please Respond to the Following Survey";
            
            HTMLEmailHelper emailHelper = new HTMLEmailHelper();
            result5 = emailHelper.send(respondentEmail4, subject, emailBody.toString());
            
            if(result5 == 1){
                emailAddress = null;
                emailResponse = "Five Emails Were Sent.";
            }else{
                emailAddress = null;
                emailResponse = "Emails Were Not Sent.";
            }
        }
        
        return emailResponse;
    }

    public String prepareEmail(){
        response = " ";
        return "respondent";
    }
    
    
    //heres a second demo for pushing
    public void clear() {
      
    respondentEmail = null;
    respondentEmail1 = null;
    respondentEmail2 = null;
    respondentEmail3 = null;
    respondentEmail4 = null;
    response = null;
    
    surveyId = getSurveyId();
    
    helper = null;
    
    respondent = null;
    survey = null;
    
    emailAddress = null;
    //valFlag="true";
     QuestionController questionController = new QuestionController();
     UserController userController = new UserController();
     surveyController surveyController = new surveyController();
     
     
     //userController.clearFlag();
     //userController.valFlag="true";
     //surveyController.setValFlag("true");
     //questionController.setValFlag("true");
     //valFlag="true";
     
     

    }
    

    public String getResponse() {
        
        response = null;
        
        if(respondentEmail != null  && !respondentEmail.isEmpty()){
            
            respondent = new Respondent(respondentEmail);
            
            if(helper.insert(respondentEmail, surveyId)== 1){
                respondentEmail = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "A Respondent Was Added.";
                  valFlag="false";
            }else{
                respondentEmail = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "A Respondent Was Not Added.";
            }
        }
        
        if(respondentEmail1 != null && !respondentEmail1.isEmpty()){
            
            respondent = new Respondent(respondentEmail);
            

            if(helper.insert(respondentEmail1, surveyId)== 1){
                respondentEmail1 = null;                
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Two Respondents Were Added.";
            }else{
                respondentEmail1 = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Two Respondents Were Not Added.";
            }
        }    
        
        if(respondentEmail2 != null && !respondentEmail2.isEmpty()){
            
            respondent = new Respondent(respondentEmail);
            
 
            if(helper.insert(respondentEmail2, surveyId)== 1){
                respondentEmail2 = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Three Respondents Were Added.";
            }else{
                respondentEmail2 = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Three Respondents Were Not Added.";
            }
        }
        
        if(respondentEmail3 != null && !respondentEmail3.isEmpty()){
            
            respondent = new Respondent(respondentEmail);
            
            
            if(helper.insert(respondentEmail3, surveyId)== 1){
                respondentEmail3 = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Four Respondents Were Added.";
            }else{
                respondentEmail3 = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Four Respondents Were Not Added.";
            }
        } 
        
        if(respondentEmail4 != null && !respondentEmail4.isEmpty()){
    
            respondent = new Respondent(respondentEmail);
            
            
            if(helper.insert(respondentEmail4, surveyId)== 1){
                respondentEmail4 = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Five Respondents Were Added.";
            }else{
                respondentEmail4 = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Five Respondents Were Not Added.";
            }
        } 
     return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
}
