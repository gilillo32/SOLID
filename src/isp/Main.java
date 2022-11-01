package isp;

import java.nio.file.FileSystemAlreadyExistsException;

public class Main{


    public static void main(String[] args){
        GmailAccount gAccount = new GmailAccount("Iñigo", "gilmarti32@gmail.com");
        EmailSender.sendEmail(gAccount, "Mezuaren gorputza");
    }
}
