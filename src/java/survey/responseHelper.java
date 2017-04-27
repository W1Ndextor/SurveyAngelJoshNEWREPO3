package survey;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import java.util.List;



/**
 *
 * @author Angel
 */
public class responseHelper {
    
    Session session = null;
    
    public responseHelper(){
        try{
            this.session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
        }catch(Exception e){
            e.printStackTrace(); 
        }
    }
    
    public int getQuestion(){
        
        List<Question> questionList = null;
        
        String sql = "select * from question order by Question_ID desc limit 1";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Question.class);
            
            // executes the query and returns it as a list
            questionList = (List<Question>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return questionList.get(0).getQuestionId();
    }
    
    
    
    public int getSurveyRespondentId(){
        
        List<SurveyRespondent> respondentList = null;
        
        String sql = "select * from surveyRespondent order by Survey_Respondent_ID desc limit 1";
        
         try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(User.class);
            
            // executes the query and returns it as a list
            respondentList = (List<SurveyRespondent>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return respondentList.get(0).getSurveyRespondentId();
    }
    
    public int insertResponse(int a, int b, int c){
        
        int result = 0;
        
        String sql = "insert into response (Question_ID, Rating_ID, Survey_Respondent_ID)"
                + "values (:question, :rating, :surveyRespondent)";
        
        try{
            // checks to see if the transaction is active
            if(!this.session.getTransaction().isActive()){   
                session.beginTransaction();
            }
            
            // creating a query that can be executed
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating User POJO and table with a query
            q.addEntity(Response.class);
            
            // binds values to the placeholders in the query
            q.setParameter("question", a);
            q.setParameter("rating", b);
            q.setParameter("surveyRespondent", c);
           
            // executes the query
            result = q.executeUpdate();
            
            // commits the query to the database
            session.getTransaction().commit();
            
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
    
    public List getRatings(){
        List<Rating> ratingList = null;
        
        String sql = "select * from rating";
        
        try{
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            SQLQuery q = session.createSQLQuery(sql);
            
            q.addEntity(Rating.class);
            
            ratingList = (List<Rating>) q.list();
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return ratingList;
    }
    
    
    
    /*public int insertResponse(Response a){
        int result = 0;
        
        
        
        String sql = "insert into response (Question_ID, Rating_ID, Survey_Respondent_ID)"
                + "values (:question, :rating, :surveyRespondent)";

        try{
            // checks to see if the transaction is active
            if(!this.session.getTransaction().isActive()){   
                session.beginTransaction();
            }
            
            // creating a query that can be executed
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating User POJO and table with a query
            q.addEntity(Response.class);
            
            // binds values to the placeholders in the query
            //q.setParameter("surveyName", a.getSurveyName());
            //q.setParameter("userId", a.getUser());
           q.setParameter("question", a.getQuestionFoo());
           q.setParameter("rating", a.getRatingFoo());
           q.setParameter("surveyRespondent", a.getSurveyRespondentFoo());
            // executes the query
            result = q.executeUpdate();
            
            // commits the query to the database
            session.getTransaction().commit();
            
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
     }*/
    
    
    
    public List getRespondentEmails(){
        List<String> respondentList = null;
        
        String sql = "select * from respondent order by Respondent_Email asc";
        
        try{
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            SQLQuery q = session.createSQLQuery(sql);
            
            q.addEntity(Respondent.class);
            
            respondentList = (List<String>) q.list();
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return respondentList;
    }
    
    public int getSurveyRespondentId2(){
        
        List<SurveyRespondent> respList = null;
        
        String sql = "select * from surveyRespondent where Respondent_ID = :respid";
        
         try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            responseController RC = new responseController();
            // associating the actor table and the actor POJO
            q.addEntity(User.class);
            q.setParameter("respid", RC.respondentId);
            
            // executes the query and returns it as a list
            respList = (List<SurveyRespondent>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return respList.get(0).getSurveyRespondentId();
    }
    
    
    
    
    public int getQuestionId(){
        
        List<Question> questionList = null;
        
        String sql = "select * from question order by Question_ID desc limit 1";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Question.class);
            
            // executes the query and returns it as a list
            questionList = (List<Question>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return questionList.get(0).getQuestionId();
    }
    
    
    public int getRespondentId(){
        
        List<Respondent> respondentList = null;
        
        String sql = "select * from respondent order by Respondent_ID desc limit 1";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Respondent.class);
            
            // executes the query and returns it as a list
            respondentList = (List<Respondent>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return respondentList.get(0).getRespondentId();
    }
    
     public int insert(){

        int result = 0;
        
        int survrespid = getSurveyRespondentId3();
        
        //gets the respondent id
       //int questid = getRespondentId();
       
       int questid = getQuestionId2();
       
       int ratid = getRatingId2();
        
       // int quid = 5;
        
        //int rating=5;
        
        //int respondentId = getRespondentId();
        int testingforresult = insertResponse(questid, ratid, survrespid);
        
        if(survrespid==1 && questid==1 && ratid==1 &&testingforresult == 1){
        
            result = 1;
        }
        
         return result;
    }
     
     
     public int getQuestionId2(){
        
        List<Question> questionList = null;
        
        String sql = "select * from question order by Question_ID desc limit 1";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Question.class);
            
            // executes the query and returns it as a list
            questionList = (List<Question>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return questionList.get(0).getQuestionId();
    }
     
     
     public int getRatingId2(){
        
        List<Rating> ratingList = null;
        
        String sql = "select * from rating order by Rating_ID asc limit 1";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Rating.class);
            
            // executes the query and returns it as a list
            ratingList = (List<Rating>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return ratingList.get(0).getRatingId();
    }
     
     /////////////////////////////////////////
    public int getSurveyRespondentId3(){
        
        List<SurveyRespondent> surveyRespondentList = null;
        
        String sql = "select * from survey_respondent order by Survey_Respondent_ID desc limit 1";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(SurveyRespondent.class);
            
            // executes the query and returns it as a list
            surveyRespondentList = (List<SurveyRespondent>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return surveyRespondentList.get(0).getSurveyRespondentId();
    }
    
     
     
    
}