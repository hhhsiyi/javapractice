package Java高级.day07File类和递归.FileFilter类.demo01;

import java.io.File;

public class main3 {
    public static void main(String[] args) {
        File f = new File("d:\\mongodb");
        getAllFile(f);
    }

    public static void getAllFile(File dir) {
//        File[]files = dir.listFiles(new FileFilter(){
//            @Override
//            public boolean accept(File file) {
//                if(file.isDirectory())
//                    return true;
//                return file.getName().endsWith(".lock");
//            }
//        });
//        File[]files = dir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File file, String s) {
//                return new File(dir, s).isDirectory()||s.toLowerCase().endsWith(".lock");
//            }
//        });
//        File[] files = dir.listFiles((file, s) -> {
//            return new File(dir, s).isDirectory() || s.toLowerCase().endsWith(".lock");
//        });
//        File[] files = dir.listFiles((file, s) -> new File(dir, s).isDirectory() || s.toLowerCase().endsWith(".lock")
//        );


//        File[]files = dir.listFiles((File file)-> {
//                if(file.isDirectory())
//                    return true;
//                return file.getName().endsWith(".lock");
//
//        });
        File[] files = dir.listFiles((file) ->  file.isDirectory() || file.getName().endsWith(".lock")
        );
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                String s = file.getPath();
                boolean b = s.endsWith(".lock");
                if (b)
                    System.out.println(file);
                //System.out.println(file);
            }
        }
    }
}
