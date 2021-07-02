package practice;
import java.io.FileOutputStream;
import java.io.IOException;
public class Filewriteone {

	    public static void main(String[] args) throws IOException {
	        FileOutputStream output = new FileOutputStream("c:/out.txt");
	        output.close();
	}
}
