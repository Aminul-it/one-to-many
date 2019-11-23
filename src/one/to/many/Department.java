package one.to.many;
public class Department {
    private String departmentName ;
    
    private String departmenthead;

    public Department(String departmentName, String departmenthead) {
        this.departmentName = departmentName;
        this.departmenthead = departmenthead;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmenthead() {
        return departmenthead;
    }

    public void setDepartmenthead(String departmenthead) {
        this.departmenthead = departmenthead;
    }

    @Override
    public String toString() {
        return "Department{" + "departmentName=" + departmentName + ", departmenthead=" + departmenthead + '}';
    }
    
    
    
    
}
