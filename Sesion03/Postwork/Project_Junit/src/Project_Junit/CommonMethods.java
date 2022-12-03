package Project_Junit;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class CommonMethods {
	
	
	public void redirectStdOutput(String stdOutputPath) throws FileNotFoundException{
		
		PrintStream fichero = new PrintStream(new File(stdOutputPath));

		//Ahora podemos cambiar de pantalla a fichero y viceversa siempre que queramos
		System.setOut(fichero);
		
		
		
	}

	public String readFileContents(String stdOutputPath) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String texto = "";
		try {
            InputStreamReader entrada= new InputStreamReader(new FileInputStream(stdOutputPath), "UTF-8");

                int c=0;

                
				while(c!=-1) {
                    c=entrada.read();

                    char letra=(char)c;

                    texto+=letra;
                }

                entrada.close();

                System.out.println(texto);

        } catch (IOException e) {

            System.out.println("No se ha encontrado el archivo");
        }
		String texto1 = texto.substring(0,texto.length()-3);
		return texto1;
	}

	public void redirectStdInput(String stdInputPath) {
		// TODO Auto-generated method stub
		
	}

	

}
