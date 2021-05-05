package passwordMeterTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import passwordMeter.PasswordMeterV1;

public class PasswordMeterTest {

    @InjectMocks
    PasswordMeterV1 passwordMeterV1;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void TestComplexity(){
        passwordMeterV1.checkPassword("SAHUD123");

        String result = passwordMeterV1.sComplexity;

        if (passwordMeterV1.score < 20){
            Assertions.assertEquals("Very Weak",result);
        }else if(passwordMeterV1.score < 40){
            Assertions.assertEquals("Weak",result);
        }else if(passwordMeterV1.score < 60){
            Assertions.assertEquals("Good",result);
        }else if(passwordMeterV1.score < 80){
            Assertions.assertEquals("Strong",result);
        }else {
            Assertions.assertEquals("Very Strong",result);
        }
    }
}
