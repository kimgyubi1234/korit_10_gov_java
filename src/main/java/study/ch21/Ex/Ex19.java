package study.ch21.Ex;

//
//import javax.swing.text.Style;
//import java.util.HashMap;
//import java.util.Map;
//
//class InvalidScoreException extends Exception {
//    public InvalidScoreException() {
//        super("점수 범위 오류 (0~100)");
//    }
//}
//
//class StudentNotFoundException extends Exception {
//    public StudentNotFoundException() {
//        super("학생 미존재");
//    }
//}
//
//class Student {
//    private String name;
//    private int score;
//
//    public Student(String name, int score) throws InvalidScoreException {
//        this.name = name;
//        if (score < 0 || score > 100) {
//            throw new InvalidScoreException();
//        }
//        this.score = score;
//    }
//    public void setScore(int score) throws InvalidScoreException {
//        this.score = score;
//    }
//}
//
//class GradeManager {
//    private static GradeManager instance;
//    private Map<String, Student> studentMap;
//
//    public GradeManager () {
//        this.studentMap = new HashMap<>();
//    }
//
//    public static GradeManager getInstance() {
//        if (instance == null) instance = new GradeManager();
//        return instance;
//    }
//
//    public void addStudent (String name; int score) throws InvalidScoreException {
//        studentMap.put(name, new Student(name, score);
//    }
//
//    public Student getStudent(String name) {
//        Student foundStudent = null;
//        try {
//            for (Student student : studentMap.values()) {
//                if (student.getName().equals(name)) foundStudent = student;
//            }
//            if (foundStudent == null) throw new StudentNotFoundException();
//            return foundStudent;
//        }
//    }
//
//    public void updateScore(String name, int score) throws StudentNotFoundException, InvalidScoreException{
//        getStudent(name).setScore(score);
//    }
//
//    public void printAll() {
//        for (Student student : studentMap.values()) {
//            System.out.println(student);
//        }
//    }
//}
//
//
//
//public class Ex19 {
//    public static void main(String[] args) {
//        GradeManager gradeManager = GradeManager.getInstance();
//        try {
//            gradeManager.addStudent("김준일", 101);
//            Student foundStudent = gradeManager.getStudent("김준일");
//            System.out.println(foundStudent);
//        } catch (InvalidScoreException e) {
//            e.printStackTrace();
//        } catch (StudentNotFoundException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
