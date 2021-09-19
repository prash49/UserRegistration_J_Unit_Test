package com.bridgelabz.userregistrationjunittest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */


public class UserRegistrationTest {
    UserRegistration userRegistration;

    @Before
    public void before() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.firstName("Prash");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        try {
            boolean result = userRegistration.firstName("prashanth");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }

    }

    @Test
    public void givenFirstName_null_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName(null);
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_emptyString_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName("");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.lastName("Navin");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.lastName("navin");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLAstName_null_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName(null);
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_emptyString_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName("");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.email("abc@yahoo.com");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.email("abc()*@gmail.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_null_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName(null);
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_emptyString_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName("");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.phoneNumber("91 9876543210");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFlase() {
        try {
            boolean result = userRegistration.phoneNumber("+91 9876543210");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_null_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.phoneNumber(null);
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_emptyString_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.phoneNumber("");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.passwordRule1("password@123");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.passwordRule1("psw@");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule1_null_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName(null);
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule1_emptyString_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName("");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }


    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.passwordRule2("passWord@123");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.passwordRule2("psw@");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_null_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName(null);
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule2_emptyString_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName("");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.passwordRule3("123Aa@123");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.passwordRule3("123456789");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule3_null_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName(null);
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule3_emptyString_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName("");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.passwordRule4("@123@Abc");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.passwordRule4("@@@@@@@@@A");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule4_null_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName(null);
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule4_emptyString_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName("");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail1_null_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName(null);
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail1_emptyString_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName("");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail2_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail2_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }


    @Test
    public void givenEmail2_null_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName(null);
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail2_emptyString_ShouldReturnMessage() {
        try {
            boolean result = userRegistration.firstName("");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() {
        String result = MoodAnalyser.analyseMood("User is Happy");
        Assert.assertEquals("Entry Successful", result);
    }

    @Test
    public void givenMessage_WhenNotProper_ShouldReturnEntryFailed() {
        String result = MoodAnalyser.analyseMood("User is Sad");
        Assert.assertEquals("Entry Failed", result);
    }

}
