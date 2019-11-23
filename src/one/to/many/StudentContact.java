package one.to.many;
public class StudentContact {
    private String City;
    private String Zipcode;
     private String email;
     private String phone ;

    public StudentContact(String City, String Zipcode, String email, String phone) {
        this.City = City;
        this.Zipcode = Zipcode;
        this.email = email;
        this.phone = phone;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "StudentContact{" + "City=" + City + ", Zipcode=" + Zipcode + ", email=" + email + ", phone=" + phone + '}';
    }
     
     
     
    
}
