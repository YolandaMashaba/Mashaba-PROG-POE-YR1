/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package rc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of get_full_name method, of class Login.
     */
    @Test
    public void testGet_full_name() {
        System.out.println("get_full_name");
        Login instance = new Login();
        String expResult = "";
        String result = instance.get_full_name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_last_name method, of class Login.
     */
    @Test
    public void testGet_last_name() {
        System.out.println("get_last_name");
        Login instance = new Login();
        String expResult = "";
        String result = instance.get_last_name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_username method, of class Login.
     */
    @Test
    public void testGet_username() {
        System.out.println("get_username");
        Login instance = new Login();
        String expResult = "";
        String result = instance.get_username();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_password method, of class Login.
     */
    @Test
    public void testGet_password() {
        System.out.println("get_password");
        Login instance = new Login();
        String expResult = "";
        String result = instance.get_password();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setfull_name method, of class Login.
     */
    @Test
    public void testSetfull_name() {
        System.out.println("setfull_name");
        String full_name = "";
        Login instance = new Login();
        instance.setfull_name(full_name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setlast_name method, of class Login.
     */
    @Test
    public void testSetlast_name() {
        System.out.println("setlast_name");
        String last_name = "";
        Login instance = new Login();
        instance.setlast_name(last_name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setusername method, of class Login.
     */
    @Test
    public void testSetusername() {
        System.out.println("setusername");
        String username = "";
        Login instance = new Login();
        instance.setusername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setpassword method, of class Login.
     */
    @Test
    public void testSetpassword() {
        System.out.println("setpassword");
        String password = "";
        Login instance = new Login();
        instance.setpassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of check_username method, of class Login.
     */
    @Test
    public void testCheck_username() {
        System.out.println("check_username");
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.check_username();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of check_password_complexity method, of class Login.
     */
    @Test
    public void testCheck_password_complexity() {
        System.out.println("check_password_complexity");
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.check_password_complexity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register_user method, of class Login.
     */
    @Test
    public void testRegister_user() {
        System.out.println("register_user");
        Login instance = new Login();
        String expResult = "";
        String result = instance.register_user();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login_user method, of class Login.
     */
    @Test
    public void testLogin_user() {
        System.out.println("login_user");
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.login_user();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of return_login_status method, of class Login.
     */
    @Test
    public void testReturn_login_status() {
        System.out.println("return_login_status");
        Login instance = new Login();
        String expResult = "";
        String result = instance.return_login_status();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
