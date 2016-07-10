package TestNG2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedExceptionTest {
    String message = "Manisha";	
    MessageUtil messageUtil = new MessageUtil(message);
    
  
    // expectedExceptions会是异常过滤掉，程序测试不会报错
    @Test(expectedExceptions = ArithmeticException.class)
    public void testPrintMessage() {	
        System.out.println("Inside testPrintMessage()");     
        messageUtil.printMessage();     
   }
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Manisha";
      Assert.assertEquals(message,messageUtil.salutationMessage());
   }

}