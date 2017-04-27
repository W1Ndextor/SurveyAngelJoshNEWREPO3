
package survey;

/**
 *
 * @author Angel
 */

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SQLQuery;

public class deleteSurveyHelper {
    
    Session session = null;
    
    public deleteSurveyHelper(){
    
    try{
            this.session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
        } catch (Exception e){
            e.printStackTrace();
        }
}
    
    public List getSurveyTitleByID(int surveyId, int userId){
        
        List<Survey> surveyList = null;
        
        String sql = "select * from survey where User_ID = :userId";
        //String sql = "select * from survey order by Survey_Name limit 10";
        
        try{
             
            // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Survey.class);
            
            //q.setParameter("surveyId", surveyId);
            q.setParameter("userId", userId);
            
            // executes the query and returns it as a list
            //survey = (Survey) q.uniqueResult();
            surveyList = (List<Survey>) q.list();
            
        }catch (Exception e){
            e.printStackTrace();
        }
             
        return surveyList;
    }
    
    private int deleteFromSurveyRespondent(int surveyId){
        
        
        int result = 0;
 
        
        String sql = "delete from survey_respondent where Survey_ID = :surveyId";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the survey respondent table and the actor POJO
            q.addEntity(SurveyRespondent.class);
            
            q.setParameter("surveyId", surveyId);
            
            // executes the query and returns it as a list
            //surveyRespondentList = (List<SurveyRespondent>) q.list();
            result = q.executeUpdate();
            
            session.getTransaction().commit();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
    
    private int deleteFromQuestion(int surveyId){
        
        int result = 0;
        
        String sql = "delete from question where Survey_ID = :surveyId";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Question.class);
            
            q.setParameter("surveyId", surveyId);
            
            // executes the query and returns it as a list
            result = q.executeUpdate();
            
            session.getTransaction().commit();
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
    
    private int deleteFromSurvey(int surveyId){
        
        int result = 0;
        
        
        String sql = "delete from survey where Survey_ID = :surveyId";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Survey.class);
            
            q.setParameter("surveyId", surveyId);
            
            // executes the query and returns it as a list
            result = q.executeUpdate();
            
            session.getTransaction().commit();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
    
    public int deleteSurvey(int surveyId){
        
        int result = 0;
        
        int questionResults = deleteFromQuestion(surveyId);
        int surveyRespondentResults = deleteFromSurveyRespondent(surveyId);       
        int surveyResults = deleteFromSurvey(surveyId);
        
        if(surveyRespondentResults == 0 && questionResults == 0 && surveyResults == 0){
            result = 1;
        }
        
        return result;
    }
}
