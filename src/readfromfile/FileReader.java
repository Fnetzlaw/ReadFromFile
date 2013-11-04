package readfromfile;

import java.io.BufferedReader;
import java.io.File;

/**
 *
 * @author Expression Fnetzlaw is undefined on line 7, column 14 in
 * Templates/Classes/Class.java.
 */
public class FileReader implements Reader {

    @Override
    public String readLine() {
        BufferedReader in = null;
        String line = null;

        File data = new File("build" + File.separator + "classes" 
                        + File.separator + "addresFile.txt");

        
        in = new BufferedReader(new java.io.FileReader(data));
        line = in.readLine();
        
        
        return line;
    }
}
