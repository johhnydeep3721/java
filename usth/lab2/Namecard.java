public class Namecard{
    private String Name;
    private int Phone;
    private String Email;

    public String getName(){
        return Name;
    }
    public int getPhone(){
        return Phone;
    }
    public String getEmail(){
        return Email;
    }
    public void setName(String newName){
        this.Name = newName;
    }
    public void setPhone(int newPhone){
        this.Phone = newPhone;
    }
    public void setEmail(String newEmail){
        this.Email = newEmail;
    }
}