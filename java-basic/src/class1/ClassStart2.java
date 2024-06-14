package class1;


public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentsName = {"학생1", "학생3", "학생4"};
        int[] studentAges = {15, 16, 17, 20};
        int[] studentGrade = {90, 80, 70, 60};


        for (int i = 0; i < studentsName.length; i++) {
            System.out.println("이름: " + studentsName[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrade[i]);
        }
    }
}
