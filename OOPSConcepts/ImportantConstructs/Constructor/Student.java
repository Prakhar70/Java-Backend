package OOPSConcepts.ImportantConstructs.Constructor;

public class Student {
    int score;
    String email;
    char section;
    int age;
    public Student(String email, char section){
        this.email=email;
        this.section=section;
    }
    public Student(String email, char section, int age){
        this(email, section);
        this.age=age;
    }
    public void StudentScoreCalculator(){
        ScoreCalulator.CalculateScore(this);
    }
    public void IncreaseScore(int score){
        this.score+=score;
    }
}
