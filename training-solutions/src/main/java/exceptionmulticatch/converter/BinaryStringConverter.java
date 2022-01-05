package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String binaryString) {
        validateString(binaryString);
        boolean[] result = new boolean[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                result[i] = false;
            } else if (binaryString.charAt(i) == '1') {
                result[i] = true;
            }
        }
        return result;
    }

    public String booleanArrayToBinaryString(boolean[] items) {
        validateArray(items);
        StringBuilder sb = new StringBuilder();
        for (boolean b: items) {
            if (b == true) {
                sb.append("1");
            } else if (b == false) {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    private void validateArray(boolean[] items) {
        if (items.length == 0) {
            throw new IllegalArgumentException("Boolean array is empty.");
        }
        if (items == null) {
            throw new NullPointerException("Boolean array is null.");
        }
    }

    private void validateString(String binaryString) {
        if (binaryString == null) {
            throw new NullPointerException("Binary string is null.");
        }
        String replaced = binaryString.replaceAll("0", "").replaceAll("1", "");
        if (replaced.length() > 0) {
            throw new IllegalArgumentException("Binary string is not valid.");
        }
    }
}