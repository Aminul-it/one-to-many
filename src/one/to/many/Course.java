
package one.to.many;


public class Course {
    private String course_name;
    private String course_credit
    private String gpa;

    public Course(String course_name, String course_credit, String gpa) {
        this.course_name = course_name;
        this.course_credit = course_credit;
        this.gpa = gpa;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_credit() {
        return course_credit;
    }

    public void setCourse_credit(String course_credit) {
        this.course_credit = course_credit;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Course{" + "course_name=" + course_name + ", course_credit=" + course_credit + ", gpa=" + gpa + '}';
    }
    
    
}
