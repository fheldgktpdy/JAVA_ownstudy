package practice;

import java.io.IOException;
import java.io.PrintWriter;

public class Filewrite {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("c:/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" ��° ���Դϴ�.";
            pw.println(data);
        }
        pw.close();
    }
}
