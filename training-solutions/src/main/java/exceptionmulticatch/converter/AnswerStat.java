package exceptionmulticatch.converter;

public class AnswerStat {

    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String binaryString) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(binaryString);
        }
        catch (NullPointerException | IllegalArgumentException e) {
            throw new InvalidBinaryStringException("Something went wrong while converting.", e);
        }
    }

    public int answerTruePercent(String answers) {
        boolean[] items = convert(answers);
        int count = 0;
        for (boolean b: items) {
            if (b == true) {
                count++;
            }
        }
        return  (int) Math.round((double) count / items.length * 100);
    }
}