package isp;

public class GmailAccount implements InterfaceEmail{

    String name, emailAdress;

    public GmailAccount(String pName, String pEmailAdress){
        this.name = pName;
        this.emailAdress = pEmailAdress;
    }

    public String getEmail(){
        return this.emailAdress;
    }

    public void setEmail(String pEmail){
        this.emailAdress = pEmail;
    }
}
