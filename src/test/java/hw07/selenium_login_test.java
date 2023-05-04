package hw07;

import org.junit.jupiter.api.Test;

public class selenium_login_test {
    POM_login pomLogin;
    @Test
    public void loginTest(){
        pomLogin = new POM_login();
        pomLogin.logIn("email@example.com", "password");
    }
}
