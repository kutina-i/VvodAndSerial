import java.io.FilenameFilter;
import java.io.File;

public class FileFilter implements FilenameFilter {
    private String a;

    public FileFilter(String a){
     this.a = a.toLowerCase();
    }

     @Override
      public boolean accept(File file, String name) {
        return name.toLowerCase().endsWith(a);
    }


}
