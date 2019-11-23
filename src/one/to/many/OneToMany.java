  
package one.to.many;

import java.util.ArrayList;


public class OneToMany {

    
    public static void main(String[] args) {
         
                        
       Student s1 = new Student("aminul","25");
       
        
        ArrayList<Course> c1= new ArrayList<>();
            
        c1.add(new Course("Computer graphics", "3.5","3.40"));
        c1.add(new Course("linear algebra ", "3.5","3.40"));
        s1.setCour(c1);
        for( Course c2 : s1.getCour()){
            System.out.println(c2); 
                     }
        
   
        s1.setCont(new StudentContact("Dhaka", "784349", "aminul78@gmail.com", "938479384"));
        s1.setDept(new Department("Aminul", "Aminul Islam Kayser"));
        System.out.println(s1.getCont().getEmail());
        System.out.println(s1.getDept().getDepartmenthead());
        
        
    }
    
}
