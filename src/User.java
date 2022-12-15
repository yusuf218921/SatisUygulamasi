
public class User extends Account{

    private String firstName, lastName, phone, email;

    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
    public String getPhone(){ return phone; }
    public String getEmail(){ return email; }

    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setPhone(String phone){this.phone = phone;}
    public void setEmail(String email){this.email = email;}

}
