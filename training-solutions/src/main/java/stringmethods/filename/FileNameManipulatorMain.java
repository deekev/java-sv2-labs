package stringmethods.filename;

public class FileNameManipulatorMain {

    public static void main(String[] args) {

        FileNameManipulator manipulator = new FileNameManipulator();

        System.out.println(manipulator.findLastCharacter(" hóember  "));
        System.out.println(manipulator.findFileExtension("hjk.féj.txt  "));
        System.out.println(manipulator.identifyFilesByExtension(".txt ", "hkjf.fjnfn.txt  "));
        System.out.println(manipulator.compareFilesByName(" bnnk_gNk.exe  ", " Bnnk_gNk.exe"));
        System.out.println(manipulator.changeExtensionToLowerCase("jnkjn.BAT "));
        System.out.println(manipulator.replaceStringPart("jmx,bnm.fjn", ",bam", "kfjn"));
    }
}