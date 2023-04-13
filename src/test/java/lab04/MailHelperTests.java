package lab04;

import lab04.refactoring.DBManager;
import lab04.refactoring.MailHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MailHelperTests {
    private String to;
    private String subject;
    private String body;
    DBManager mockDBManager = Mockito.mock(DBManager.class);
    private MailHelper mailHelper = new MailHelper(mockDBManager);

    @BeforeEach
    public void setMailData(){
        to = "Receiver";
        subject = "Subject of email";
        body = "Mail body";
        mailHelper.setMail(to, subject, body);
    }
    @Test
    public void setMail_toReturnsExpectedString_returnsTo(){
        Assertions.assertEquals(to, mailHelper.getMail().getTo());
    }
    @Test
    public void setMail_subjectReturnsExpectedString_returnsSubject(){
        Assertions.assertEquals(subject, mailHelper.getMail().getSubject());
    }
    @Test
    public void setMail_bodyReturnsExpectedString_returnsBody(){
        Assertions.assertEquals(body, mailHelper.getMail().getBody());
    }
}
