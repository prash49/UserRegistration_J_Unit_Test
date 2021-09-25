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
            boolean result = userRegistration.validateFirstName.validate("Prash");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        try {
            boolean result = userRegistration.validateFirstName.validate("prashanth");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }

    }

    @Test
    public void givenFirstName_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateFirstName.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateFirstName.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validateLastName.validate("Navin");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validateLastName.validate("navin");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateLastName.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateLastName.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validateEmail.validate("abc@yahoo.com");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validateEmail.validate("abc()*@gmail.com");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateEmail.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_emptyString_ShouldThrowUserRegistrationException() {
        try {
            boolean result = userRegistration.validateEmail.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validatePhoneNumber.validate("91 9876543210");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validatePhoneNumber.validate("+91 9876543210");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePhoneNumber.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePhoneNumber.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validatePassword.validate("password@123");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validatePassword.validate("psw@");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule1_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule1_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }


    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validatePassword.validate("passWord@123");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validatePassword.validate("psw@");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule2_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validatePassword.validate("123Aa@123");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validatePassword.validate("123456789");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule3_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule3_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validatePassword.validate("@123@Abc");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validatePassword.validate("@@@@@@@@@A");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule4_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule4_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validateEmailId.validate("abc.100@abc.com.au");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validateEmailId.validate("abc()*@gmail.com");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail1_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateEmailId.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail1_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateEmailId.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail2_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validateEmailId.validate("abc.100@abc.com.au");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail2_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validateEmailId.validate("abc()*@gmail.com");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }


    @Test
    public void givenEmail2_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateEmailId.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail2_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateEmailId.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() throws MoodAnalyserException {
        try {
            String result = MoodAnalyser.analyseMood("User is Happy");
            Assert.assertEquals("Entry Successful", result);
        } catch (MoodAnalyserException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMessage_WhenNotProper_ShouldReturnEntryFailed() throws MoodAnalyserException {
        try {
            String result = MoodAnalyser.analyseMood("User is Sad");
            Assert.assertEquals("Entry Failed", result);
        } catch (MoodAnalyserException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMessage_NULL_ShouldReturnMoodAnalyserException() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            MoodAnalyser.analyseMood(null);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.type.NULL, e.type);
        }
    }

    @Test
    public void givenMessage_EMPTY_ShouldReturnMoodAnalyserException() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            MoodAnalyser.analyseMood("");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.EMPTY, MoodAnalyserException.type);
        }
    }
}

