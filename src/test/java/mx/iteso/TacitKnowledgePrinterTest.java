package mx.iteso;

import org.junit.Test;
import org.junit.Before;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


public class TacitKnowledgePrinterTest {

    //Test printNumbers with a limit of 10
        //Verify calculate being called 10 times
        //Verify expected result

    //Test printNumbers with a limit of 0
        //Verify Exception

    //What else can we test?
        //What should we verify?

    private Printer printer;
    private TacitKnowledgePrinter TK_printer;

    @Before
    public void SetUp() {
        printer = mock(Printer.class);
        TK_printer = new TacitKnowledgePrinter(printer);
    }

    @Test
    public void testPrintNumber10Times(){
        TK_printer.printNumbers(10);
        verify(printer, times(10)).print(anyString());
    }

    @Test(expected = Exception.class)
    public void testPrintNumberLimitZero(){
        TK_printer.printNumbers(0);
    }

    @Test
    public void testCalculate1(){
        assertEquals(TK_printer.calculate(3), "Tacit");
    }

    @Test
    public void testCalculate2(){
        assertEquals(TK_printer.calculate(15), "TacitKnowledge");
    }

    @Test
    public void testCalculate3(){
        assertEquals(TK_printer.calculate(5), "Knowledge");
    }




}
