import java.util.ArrayList;

public class Quiz {
    private ArrayList<Questions> questions;

    private Answer answer1 = new Answer("Ja", true);
    private Answer answer2 = new Answer("Nein", false);
    private Answer answer3 = new Answer("Ich enthalte mich", false);
    private Answer answer4 = new Answer("Counterstrike Global Offensive", true);
    private Answer answer5 = new Answer("Combat Strike Global Operation", false);
    private Answer answer6 = new Answer("Counter Shot Global Online", false);
    private Answer answer7 = new Answer("Nirvana", false);
    private Answer answer8 = new Answer("AC/DC", false);
    private Answer answer9 = new Answer("Queen", true);

    public ArrayList<Questions> getQuestions() {
        return questions;
    }

    public Quiz() {
        ArrayList<Answer> answerListYesTrue = new ArrayList<>();
        answerListYesTrue.add(answer1);
        answerListYesTrue.add(answer2);
        answerListYesTrue.add(answer3);

        ArrayList<Answer> answerListCs = new ArrayList<>();
        answerListCs.add(answer4);
        answerListCs.add(answer5);
        answerListCs.add(answer6);

        ArrayList<Answer> answerListBR = new ArrayList<>();
        answerListBR.add(answer7);
        answerListBR.add(answer8);
        answerListBR.add(answer9);

        Questions q1 = new Questions("Funktioniert das Programm?", answerListYesTrue);
        Questions q2 = new Questions("Was heißt CS:GO ausgeschrieben?", answerListCs);
        Questions q3 = new Questions("Welche Band hat das Lied Bohemian Rhapsody geschrieben?",  answerListBR);

        questions = new ArrayList<>();
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);

    }



}
