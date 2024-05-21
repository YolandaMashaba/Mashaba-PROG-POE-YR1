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
public class TaskTest {
    
    public TaskTest() {
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
     * Test of get_developer_name method, of class Task.
     */
    @Test
    public void testGet_developer_name() {
        System.out.println("get_developer_name");
        Task instance = new Task();
        String expResult = "";
        String result = instance.get_developer_name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_task_name method, of class Task.
     */
    @Test
    public void testGet_task_name() {
        System.out.println("get_task_name");
        Task instance = new Task();
        String expResult = "";
        String result = instance.get_task_name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_description method, of class Task.
     */
    @Test
    public void testGet_description() {
        System.out.println("get_description");
        Task instance = new Task();
        String expResult = "";
        String result = instance.get_description();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_duration method, of class Task.
     */
    @Test
    public void testGet_duration() {
        System.out.println("get_duration");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.get_duration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_task_ID method, of class Task.
     */
    @Test
    public void testGet_task_ID() {
        System.out.println("get_task_ID");
        Task instance = new Task();
        String expResult = "";
        String result = instance.get_task_ID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_number_of_tasks method, of class Task.
     */
    @Test
    public void testGet_number_of_tasks() {
        System.out.println("get_number_of_tasks");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.get_number_of_tasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_task_status method, of class Task.
     */
    @Test
    public void testGet_task_status() {
        System.out.println("get_task_status");
        Task instance = new Task();
        String expResult = "";
        String result = instance.get_task_status();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdeveloper_name method, of class Task.
     */
    @Test
    public void testSetdeveloper_name() {
        System.out.println("setdeveloper_name");
        String developer = "";
        Task instance = new Task();
        instance.setdeveloper_name(developer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of settask_name method, of class Task.
     */
    @Test
    public void testSettask_name() {
        System.out.println("settask_name");
        String task_name = "";
        Task instance = new Task();
        instance.settask_name(task_name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of settask_number method, of class Task.
     */
    @Test
    public void testSettask_number() {
        System.out.println("settask_number");
        int task_number = 0;
        Task instance = new Task();
        instance.settask_number(task_number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdescription method, of class Task.
     */
    @Test
    public void testSetdescription() {
        System.out.println("setdescription");
        String description = "";
        Task instance = new Task();
        instance.setdescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setduration method, of class Task.
     */
    @Test
    public void testSetduration() {
        System.out.println("setduration");
        int duration = 0;
        Task instance = new Task();
        instance.setduration(duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of settask_ID method, of class Task.
     */
    @Test
    public void testSettask_ID() {
        System.out.println("settask_ID");
        String task_ID = "";
        Task instance = new Task();
        instance.settask_ID(task_ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setnumber_of_tasks method, of class Task.
     */
    @Test
    public void testSetnumber_of_tasks() {
        System.out.println("setnumber_of_tasks");
        int number_of_tasks = 0;
        Task instance = new Task();
        instance.setnumber_of_tasks(number_of_tasks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_task_status method, of class Task.
     */
    @Test
    public void testSet_task_status() {
        System.out.println("set_task_status");
        String task_status = "";
        Task instance = new Task();
        instance.set_task_status(task_status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of check_description method, of class Task.
     */
    @Test
    public void testCheck_description() {
        System.out.println("check_description");
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.check_description();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enter_task_details method, of class Task.
     */
    @Test
    public void testEnter_task_details() {
        System.out.println("enter_task_details");
        Task instance = new Task();
        instance.enter_task_details();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generate_task_ID method, of class Task.
     */
    @Test
    public void testGenerate_task_ID() {
        System.out.println("generate_task_ID");
        String task_name = "";
        int task_number = 0;
        String developer_name = "";
        String expResult = "";
        String result = Task.generate_task_ID(task_name, task_number, developer_name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print_task_details method, of class Task.
     */
    @Test
    public void testPrint_task_details() {
        System.out.println("print_task_details");
        Task instance = new Task();
        String expResult = "";
        String result = instance.print_task_details();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of return_total_hours method, of class Task.
     */
    @Test
    public void testReturn_total_hours() {
        System.out.println("return_total_hours");
        int expResult = 0;
        int result = Task.return_total_hours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of check_task_description method, of class Task.
     */
    @Test
    public void testCheck_task_description() {
        System.out.println("check_task_description");
        Task.check_task_description();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
