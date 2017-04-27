/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Named(value = "responseController")
@SessionScoped
public class responseController implements Serializable {

    /**
     * Creates a new instance of responseController
     */
    public responseController() {
        helper = new responseHelper();
    }
    DataModel ratingValues;
    DataModel respondentValues;
    int respondentId = 0;
    int questionId;
    int rating;
    int surveyRespondent;
    String responses;
    String responseMessage = null;

    int rating1;
    int rating2;
    int rating3;
    int rating4;
    int rating5;
    int rating6;
    int rating7;
    int rating8;
    int rating9;
    int rating10;
    responseHelper helper;
    Response responseObject;

    int RespCheck = 0;

    String responseText;
    String responseText1;
    String responseText2;
    String responseText3;
    String responseText4;
    String responseText5;
    String responseText6;
    String responseText7;
    String responseText8;
    String responseText9;
    int i = 0;

    int submitPush = 0;

    String respondentEmail = null;

    public int getRating1() {
        return rating1;
    }

    public void setRating1(int rating1) {
        this.rating1 = rating1;
    }

    public int getRating2() {
        return rating2;
    }

    public void setRating2(int rating2) {
        this.rating2 = rating2;
    }

    public int getRating3() {
        return rating3;
    }

    public void setRating3(int rating3) {
        this.rating3 = rating3;
    }

    public int getRating4() {
        return rating4;
    }

    public void setRating4(int rating4) {
        this.rating4 = rating4;
    }

    public int getRating5() {
        return rating5;
    }

    public void setRating5(int rating5) {
        this.rating5 = rating5;
    }

    public int getRating6() {
        return rating6;
    }

    public void setRating6(int rating6) {
        this.rating6 = rating6;
    }

    public int getRating7() {
        return rating7;
    }

    public void setRating7(int rating7) {
        this.rating7 = rating7;
    }

    public int getRating8() {
        return rating8;
    }

    public void setRating8(int rating8) {
        this.rating8 = rating8;
    }

    public int getRating9() {
        return rating9;
    }

    public void setRating9(int rating9) {
        this.rating9 = rating9;
    }

    public int getRating10() {
        return rating10;
    }

    public void setRating10(int rating10) {
        this.rating10 = rating10;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getSurveyRespondent() {
        return surveyRespondent;

    }

    public void setSurveyRespondent(int surveyRespondent) {
        this.surveyRespondent = surveyRespondent;
    }

    public String getResponses() {
        return responses;
    }

    public void setResponses(String responses) {
        this.responses = responses;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getSubmitPush() {
        return submitPush;
    }

    public void setSubmitPush(int submitPush) {
        this.submitPush = submitPush;
    }

    public String getRespondentEmail() {
        return respondentEmail;
    }

    public void setRespondentEmail(String respondentEmail) {
        this.respondentEmail = respondentEmail;
    }

    public void clear() {
        questionId = 0;
        rating1 = 0;
        surveyRespondent = 0;
        responseMessage = null;
    }

    public String getResponseMessage() {

        responseMessage = null;
        // if (respondentEmail != null) {

        questionId = helper.getQuestionId2();
        //rating=helper.getRatingId2();
        surveyRespondent = helper.getSurveyRespondentId3();

        //questionId=3;
        //rating=3;
        //surveyRespondent=3;
        if (helper.insertResponse((questionId - 9), rating1, surveyRespondent) == 1) {
            //if (helper.insert() == 1){
            //respondentEmail = null;
            questionId = 0;
            rating1 = 0;
            surveyRespondent = 0;
            responseMessage = "1 response added";
        }
        // valFlag="false";
        // } else {
        //   respondentEmail= null;
        //   responseMessage = "response not added.";
        // }
        // } else {
        //    responseMessage = " ";
        //}

        //  if (respondentEmail != null) {
        questionId = helper.getQuestionId2();
        //rating=helper.getRatingId2();
        surveyRespondent = helper.getSurveyRespondentId3();

        //questionId=3;
        //rating=3;
        //surveyRespondent=3;
        if (helper.insertResponse((questionId - 8), rating2, surveyRespondent) == 1) {
            //if (helper.insert() == 1){
            //respondentEmail = null;
            questionId = 0;
            rating2 = 0;
            surveyRespondent = 0;
            responseMessage = "2 responses added";
        }
        // valFlag="false";
        //} else {
        //  respondentEmail= null;
        //   responseMessage = "response not added.";
        // }
        // } else {
        //    responseMessage = " ";
        // }

        //if (respondentEmail != null) {
        questionId = helper.getQuestionId2();
        //rating=helper.getRatingId2();
        surveyRespondent = helper.getSurveyRespondentId3();

        //questionId=3;
        //rating=3;
        //surveyRespondent=3;
        if (helper.insertResponse((questionId - 7), rating3, surveyRespondent) == 1) {
            //if (helper.insert() == 1){
            //respondentEmail = null;
            questionId = 0;
            rating3 = 0;
            surveyRespondent = 0;
            responseMessage = "3 responses added";
        }
        // valFlag="false";
        // } else {
        //   respondentEmail= null;
        //  responseMessage = "response not added.";
        //}
        // } else {
        //     responseMessage = " ";
        //}

        // if (respondentEmail != null) {
        questionId = helper.getQuestionId2();
        //rating=helper.getRatingId2();
        surveyRespondent = helper.getSurveyRespondentId3();

        //questionId=3;
        //rating=3;
        //surveyRespondent=3;
        if (helper.insertResponse((questionId - 6), rating4, surveyRespondent) == 1) {
            //if (helper.insert() == 1){
            //respondentEmail = null;
            questionId = 0;
            rating4 = 0;
            surveyRespondent = 0;
            responseMessage = "4 responses added";
        }
        // valFlag="false";
        // } else {
        //   respondentEmail= null;
        //   responseMessage = "response not added.";
        //}
        //} else {
        //    responseMessage = " ";
        //}

        // if (respondentEmail != null) {
        questionId = helper.getQuestionId2();
        //rating=helper.getRatingId2();
        surveyRespondent = helper.getSurveyRespondentId3();

        //questionId=3;
        //rating=3;
        //surveyRespondent=3;
        if (helper.insertResponse((questionId - 5), rating5, surveyRespondent) == 1) {
            //if (helper.insert() == 1){
            // respondentEmail = null;
            questionId = 0;
            rating5 = 0;
            surveyRespondent = 0;
            responseMessage = "5 responses added";
        }
        // valFlag="false";
        // } else {
        //   respondentEmail= null;
        //  responseMessage = "response not added.";
        //}
        // } else {
        //    responseMessage = " ";
        //}

        //if (respondentEmail != null) {
        questionId = helper.getQuestionId2();
        //rating=helper.getRatingId2();
        surveyRespondent = helper.getSurveyRespondentId3();

        //questionId=3;
        //rating=3;
        //surveyRespondent=3;
        if (helper.insertResponse((questionId - 4), rating6, surveyRespondent) == 1) {
            //if (helper.insert() == 1){
            //respondentEmail = null;
            questionId = 0;
            rating6 = 0;
            surveyRespondent = 0;
            responseMessage = "6 responses added";
        }
        // valFlag="false";
        // } else {
        //    respondentEmail= null;
        //   responseMessage = "response not added.";
        //}
        // else {
        //    responseMessage = " ";
        //}

        // if (respondentEmail != null) {
        questionId = helper.getQuestionId2();
        //rating=helper.getRatingId2();
        surveyRespondent = helper.getSurveyRespondentId3();

        //questionId=3;
        //rating=3;
        //surveyRespondent=3;
        if (helper.insertResponse((questionId - 3), rating7, surveyRespondent) == 1) {
            //if (helper.insert() == 1){
            //respondentEmail = null;
            questionId = 0;
            rating7 = 0;
            surveyRespondent = 0;
            responseMessage = "7 responses added";
        }
        // valFlag="false";
        //} else {
        //   respondentEmail= null;
        //  responseMessage = "response not added.";
        //}
        //} else {
        //   responseMessage = " ";
        // }

        //if (respondentEmail != null) {
        questionId = helper.getQuestionId2();
        //rating=helper.getRatingId2();
        surveyRespondent = helper.getSurveyRespondentId3();

        //questionId=3;
        //rating=3;
        //surveyRespondent=3;
        if (helper.insertResponse((questionId - 2), rating8, surveyRespondent) == 1) {
            //if (helper.insert() == 1){
            //respondentEmail = null;
            questionId = 0;
            rating8 = 0;
            surveyRespondent = 0;
            responseMessage = "8 responses added";
        }
        // valFlag="false";
        //  } else {
        //    respondentEmail= null;
        //   responseMessage = "response not added.";
        // }
        // } else {
        //     responseMessage = " ";
        // }

        //if (respondentEmail != null) {
        questionId = helper.getQuestionId2();
        //rating=helper.getRatingId2();
        surveyRespondent = helper.getSurveyRespondentId3();

        //questionId=3;
        //rating=3;
        //surveyRespondent=3;
        if (helper.insertResponse((questionId - 1), rating9, surveyRespondent) == 1) {
            //if (helper.insert() == 1){
            //respondentEmail = null;
            questionId = 0;
            rating9 = 0;
            surveyRespondent = 0;
            responseMessage = "9 responses added";
        }
        // valFlag="false";
        // } else {
        //     respondentEmail= null;
        //    responseMessage = "response not added.";
        // }
        //} else {
        //    responseMessage = " ";
        //}

        //if (respondentEmail != null) {
        questionId = helper.getQuestionId2();
        //rating=helper.getRatingId2();
        surveyRespondent = helper.getSurveyRespondentId3();

        //questionId=3;
        //rating=3;
        //surveyRespondent=3;
        if (helper.insertResponse((questionId), rating10, surveyRespondent) == 1) {
            //if (helper.insert() == 1){
            // respondentEmail = null;
            questionId = 0;
            rating10 = 0;
            surveyRespondent = 0;
            responseMessage = "10 responses added";
        }
        // valFlag="false";
        // } else {
        //  respondentEmail= null;
        //  responseMessage = "response not added.";
        //  }
        //} else {
        //    responseMessage = " ";
        // }

        return responseMessage;

///////////////
        /* responseMessage = null;
        //loops here changing questiontext to "questiontext"1 ""2 "" 3...""10
        //case blocks would also work for each questiontext
        //if (responseText != null && !responseText.isEmpty()) {
        //if (responseObject == null){
        QuestionController QC = new QuestionController();
        responseObject = new Response(4, 4, 4);
        //for (i=0; i<0; i++){
        //if (i == 1) {
      //  if(submitPush==1){
      if(responseMessage!=null){
             if (helper.insertResponse(responseObject) == 1) {
            //helper.insertResponse(responseObject);
            questionId = 0;
            rating = 0;
            surveyRespondent = 0;
            responseMessage = "1 response added";
           //i=1;
            //return response;
        }
        }*/
/////////////////////
        /*if (QC.numQuestions >= 2 && i!=0) {
            i = 2;
        }

        if (i == 2) {
            helper.insertResponse(2, 2, 2);
            questionId = 0;
            rating = 0;
            surveyRespondent = 0;
            responseMessage = "2 responses added";

        }
        
         if (QC.numQuestions >= 3 && i!=0) {
            i = 3;
        }
         
          if (i == 3) {
            helper.insertResponse(3, 3, 3);
            questionId = 0;
            rating = 0;
            surveyRespondent = 0;
            responseMessage = "3 responses added";

        }
         

        //////////////////////////////////
        /* if (i==1){
                i=2;
            }
            
            if (i!=0){
           // if (helper.insertResponse(1, 1, 1) == 1) {
               helper.insertResponse(1, 1, 1);
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "1 response added";
                
                //return response;
            }
           i=1;
       // }/*/
        ///////////////////////////////////
        // return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public int getRespondentId() {
        return respondentId;
    }

    public void setRespondentId(int respondentId) {
        this.respondentId = respondentId;
    }

    public Response getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(Response responseect) {
        this.responseObject = responseObject;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    public String getResponseText1() {
        return responseText1;
    }

    public void setResponseText1(String responseText1) {
        this.responseText1 = responseText1;
    }

    public String getResponseText2() {
        return responseText2;
    }

    public void setResponseText2(String responseText2) {
        this.responseText2 = responseText2;
    }

    public String getResponseText3() {
        return responseText3;
    }

    public void setResponseText3(String responseText3) {
        this.responseText3 = responseText3;
    }

    public String getResponseText4() {
        return responseText4;
    }

    public void setResponseText4(String responseText4) {
        this.responseText4 = responseText4;
    }

    public String getResponseText5() {
        return responseText5;
    }

    public void setResponseText5(String responseText5) {
        this.responseText5 = responseText5;
    }

    public String getResponseText6() {
        return responseText6;
    }

    public void setResponseText6(String responseText6) {
        this.responseText6 = responseText6;
    }

    public String getResponseText7() {
        return responseText7;
    }

    public void setResponseText7(String responseText7) {
        this.responseText7 = responseText7;
    }

    public String getResponseText8() {
        return responseText8;
    }

    public void setResponseText8(String responseText8) {
        this.responseText8 = responseText8;
    }

    public String getResponseText9() {
        return responseText9;
    }

    public void setResponseText9(String responseText9) {
        this.responseText9 = responseText9;
    }

    /*public void setRatingValues(DataModel ratingValues) {
        this.ratingValues = ratingValues;
    }*/
    public DataModel getRatingValues() {
        if (ratingValues == null) {
            ratingValues = new ListDataModel(helper.getRatings());
        }
        return ratingValues;
    }

    public void setRatingValues(DataModel ratingValues) {
        this.ratingValues = ratingValues;
    }

    public DataModel getRespondentValues() {
        if (respondentValues == null) {
            respondentValues = new ListDataModel(helper.getRespondentEmails());
        }
        return respondentValues;
    }

    public void setRespondentValues(DataModel respondentValues) {
        this.respondentValues = respondentValues;
    }

    public String getResponse() {
        /*responseMessage = null;
        //loops here changing questiontext to "questiontext"1 ""2 "" 3...""10
        //case blocks would also work for each questiontext
        if (responseText != null && !responseText.isEmpty()) {
//QuestionController QC = new QuestionController();
            responseObject = new Response(1, 1, 1);
           
            if (helper.insertResponse(1, 1, 1) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "1 response added";
                //return response;
            }
        }

        /*if (responseText1 != null && !responseText1.isEmpty()) {

            responseObject = new Response(1, 1, 1);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "2 response added";
                //return response;
            }
        }

        if (responseText2 != null && !responseText2.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "3 response added";
                //return response;
            }
        }

        if (responseText3 != null && !responseText3.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "4 response added";
                //return response;
            }
        }

        if (responseText4 != null && !responseText4.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "5 response added";
                //return response;
            }
        }
        if (responseText5 != null && !responseText5.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "6 response added";
                //return response;
            }
        }
        if (responseText6 != null && !responseText6.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "7 response added";
                //return response;
            }
        }
        if (responseText7 != null && !responseText7.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "8 response added";
                //return response;
            }
        }
        if (responseText8 != null && !responseText8.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "9 response added";
                //return response;
            }
        }
        if (responseText9 != null && !responseText9.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "10 response added";
                //return response;
            }
        }*/

        return responseMessage;
    }

    public void setResponse(String response) {
        this.responseMessage = responseMessage;
    }

}
