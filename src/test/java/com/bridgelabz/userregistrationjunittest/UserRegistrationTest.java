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
        boolean result = userRegistration.firstName("Prash");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("prash");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Navin");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("navin");
        Assert.assertEquals(false, result);

    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.email("abc@gmail.com.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.email("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.phoneNumber("91 9876543210");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.phoneNumber("+91 9876543210");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.password("password@123");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.password("psw@");
        Assert.assertEquals(false, result);
    }

}
