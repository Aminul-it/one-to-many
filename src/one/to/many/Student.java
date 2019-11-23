
package one.to.many;

import java.util.ArrayList;


public class Student {
    private String name;
    private String Age;
    private StudentContact cont; 
    private Department dept;
    private ArrayList<Course> cour;

    public Student(String name, String Age) {
        this.name = name;
        this.Age = Age;
        
    }

   

   
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public StudentContact getCont() {
        return cont;
    }

    public void setCont(StudentContact cont) {
        this.cont = cont;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public ArrayList<Course> getCour() {
        return cour;
    }

    public void setCour(ArrayList<Course> cour) {
        this.cour = cour;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", Age=" + Age + ", cont=" + cont + ", dept=" + dept + ", cour=" + cour + '}';
    }
    
    

  
    
}
