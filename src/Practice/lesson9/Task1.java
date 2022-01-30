package Practice.lesson9;

public class Task1 {
    public static void main(String[] args) {
        Student st = new Student("Ivanov ivan", "M032");
        Teacher teacher = new Teacher("Petrov Fedor", "informatica");
        System.out.println("Название учебной группы студента " + st.getGroup());
        System.out.println("Название предмета преподавателя " + teacher.getObject());
        st.printInfo();
        teacher.printInfo();

    }
}
