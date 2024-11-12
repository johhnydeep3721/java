public class Course {
    private String courseID;
    private String courseName;
    private LectureID lecture;

    public Course(String courseID, String courseName,LectureID lecture){
        this.courseID = courseID;
        this.courseName = courseName;
        this.lecture = lecture;
    }

    public String getCourseID(){
        return courseID;
    }
    public String getCourseName(){
        return courseName;
    }
    public LectureID getLecture(){
        return lecture;
    }
}
