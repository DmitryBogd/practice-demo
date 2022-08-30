package components;

import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Data;

@Data
public class User {
    private String email;
    private String password;

    public User(){
        setGenerateEmail();
    }

    public void setGenerateEmail(){
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd_hh.mm.ss");

        email = "testuser+"+formatForDateNow.format(dateNow)+"@test.com";
    }

}
