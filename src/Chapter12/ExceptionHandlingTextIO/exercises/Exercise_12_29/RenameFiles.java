
package Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_29;

import java.io.File;

public class RenameFiles {
    public static void main(String[] args) {
        String pathDir = "src/Chapter12/ExceptionHandlingTextIO/exercises/Exercise_12_27/TestFilesDirectory/ChapterTest";
        File rootFile = new File(pathDir);
        String[] files = rootFile.list();
        int numberOfFiles = files.length;

        for (int i = 0; i < numberOfFiles; i++) {
            String currentFilePath = pathDir + "//" + files[i];
            File currentFile = new File(currentFilePath);
            String currentFileName = currentFile.getName();
            String newName = "//Exercise";
            for (int j = newName.length() - 3; j < currentFileName.length() - 1; j++) {
                char c = currentFileName.charAt(j);
                if (c == 'e') {
                    String number = currentFileName.substring(currentFileName.indexOf("se") + 2, currentFileName.indexOf("_"));
                    newName += String.format("%02d", Integer.parseInt(number));
                    continue;
                } else if (c == '_') {
                    String number = currentFileName.substring(currentFileName.indexOf('_') + 1, currentFileName.indexOf("."));
                    newName += String.format("_%02d", Integer.parseInt(number));
                    break;
                }
            }


            currentFile.renameTo(new File(pathDir + newName + ".java"));
        }
    }


}
