package com.razormist.simplequizapp;

/**
 * Created by Arvin on 2/21/2018.
 */

public class Answers {

    public String Answers[] = {
            "Which is a Programming Language?",
            "In COMAL language program, after name of procedure parameters must be in?",
            "Programming language COBOL works best for use in?"
    };

    public String choices[][] = {
            {"HTML", "CSS", "Vala", "PHP"},
            {"Punction Marks", "Back-Slash", "Brackets", "Semi Colon"},
            {"Siemens Applications", "Student Applications", "Social Applications", "Commercial Applications"}
    };

    public String correctAnswer[] = {
        "PHP",
        "Brackets",
        "Commercial Applications"
    };

    public String getAnswers(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
