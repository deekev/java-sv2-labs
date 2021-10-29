package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter(String text) {
        text = text.trim();
        return text.charAt(text.length()-1);
    }

    public String findFileExtension(String fileName) {
        fileName = fileName.trim();
        return fileName.substring(fileName.lastIndexOf("."));
    }

    public boolean identifyFilesByExtension(String extension, String fileName) {
        extension = extension.trim();
        fileName = fileName.trim();
        return fileName.endsWith(extension);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        searchedFileName = searchedFileName.trim();
        actualFileName = actualFileName.trim();
        return searchedFileName.equalsIgnoreCase(actualFileName);
    }

    public String changeExtensionToLowerCase(String fileName) {
        fileName = fileName.trim();
        String extension = fileName.trim().substring(fileName.lastIndexOf("."));
        return fileName.replace(extension, extension.toLowerCase());
    }

    public String replaceStringPart(String fileName, String present, String target) {
        fileName = fileName.trim();
        return fileName.replace(present, target);
    }
}