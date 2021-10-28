package typeconversion;

public class Conversion {

    public double convertDoubleToDouble(double number) {
        int convertedToInt = (int)number;
        return (double)convertedToInt;
    }

    public byte[] convertIntArrayToByteArray(int[] numbers) {
        byte[] numbersToByte = new byte[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0 || numbers[i] > 127) {
                numbersToByte[i] = -1;
            } else {
                numbersToByte[i] = (byte)numbers[i];
            }
        }
        return numbersToByte;
    }

    public int getFirstDecimal(double number) {
        int numberToIntFirst = (int)number;
        double numberToDoubleAgain = (number - numberToIntFirst) * 10;
        return (int)numberToDoubleAgain;
    }
}