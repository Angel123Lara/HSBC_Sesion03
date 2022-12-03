package Project_Junit;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPizzeriaEjercicio1 {

    CommonMethods Common;
    PizzaOrden nuevaOrden;
    String stdOutputPath;

    PrintStream originalPrintStream = System.out;
    @BeforeClass
    public void initialConditions() {
        Common = new CommonMethods();
        stdOutputPath = "output.txt";

    }

    @BeforeTest
    public void preConditions() {
        nuevaOrden = new PizzaOrden();
    }
    
    

    @Test
    public void verificarMensajeDeInicioSeDespliega() throws FileNotFoundException {

        Common.redirectStdOutput(stdOutputPath);
        nuevaOrden.desplegarMensajeInicio();
		System.setOut(originalPrintStream);
        String actualResult = Common.readFileContents(stdOutputPath);
        String expectedResult = "Bienvenido a la aplicación para ordenar pizza.\n\n"
                                    + "Sigue las instrucciones por favor.\n\n";

        Assert.assertEquals(actualResult, expectedResult);
    }

   
}
