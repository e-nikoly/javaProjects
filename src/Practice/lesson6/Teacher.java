package Practice.lesson6;

import java.util.Random;

public class Teacher {

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }


    private String name;
    private String subject;

    public void evaluate(Student st){
        Random rand = new Random();
        int score = rand.nextInt(4) + 2;
        String scoreText = "";
        switch (score){
            case 2:
                scoreText = "неудовлетворительно";
                break;
            case 3:
                scoreText = "удовлетворительно";
                break;
            case 4:
                scoreText = "хорошо";
                break;
            case 5:
                scoreText = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " +
                st.getName() + " по предмету " + this.subject + " на оценку " + scoreText);

    }
}
