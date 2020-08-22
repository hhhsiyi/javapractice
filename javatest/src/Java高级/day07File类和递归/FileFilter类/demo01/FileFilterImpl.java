package Java高级.day07File类和递归.FileFilter类.demo01;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File file) {
        if(file.isDirectory()){
            return true;
        }
        return file.getPath().toLowerCase().endsWith(".lock");
    }
}
