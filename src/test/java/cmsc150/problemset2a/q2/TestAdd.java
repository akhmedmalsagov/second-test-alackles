package cmsc150.problemset2a.q2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestAdd {

   @Test
   public void testAdd()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Add.main(null);

     // assertion
     assertEquals("50\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }
}