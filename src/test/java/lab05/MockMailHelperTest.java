package lab05;

import lab04.refactoring.DBManager;
import lab04.refactoring.Mail;
import lab04.refactoring.MailHelper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockMailHelperTest {

    DBManager mockDBManager = Mockito.mock(DBManager.class);
    MailHelper mailHelper = new MailHelper(mockDBManager);

    @Test
    public void positiveVerifySendMailOnce(){
        mailHelper.sendMail(Mockito.anyInt());
        Mockito.verify(mockDBManager, Mockito.times(1)).findMail(Mockito.anyInt());
    }

    @Test
    public void negativeVerifySendMailTwice(){
        mailHelper.sendMail(Mockito.anyInt());
        Mockito.verify(mockDBManager, Mockito.times(2)).findMail(Mockito.anyInt());
    }

    @Test
    public void mockTest(){
        int mailId = 1;
        mailHelper.setMail("Mockedto", "MockedSubject", "MockedBody");
        Mail mail = mailHelper.getMail();
        Mockito.when(mockDBManager.findMail(mailId)).thenReturn(mail);
        mailHelper.sendMail(mailId);
        System.out.println(mailHelper.getMail().getBody());

        Mockito.verify(mockDBManager).findMail(mailId);
    }
}
