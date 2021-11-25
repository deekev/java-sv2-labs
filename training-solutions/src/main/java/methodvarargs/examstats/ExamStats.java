package methodvarargs.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints){
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (isEmpty(results)) {
            throw new IllegalArgumentException("Legalább egy pontszámot meg kell adni.");
        }
        int count = 0;
        for (int i: results) {
            if (i > maxPoints * (limitInPercent / 100D)) {
                count++;
            }
        }
        return count;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (isEmpty(results)) {
            throw new IllegalArgumentException("Legalább egy pontszámot meg kell adni.");
        }
        for (int i: results) {
            if (i < maxPoints * (limitInPercent / 100D)) {
                return true;
            }
        }
        return false;
    }

    private boolean isEmpty(int[] results) {
        return results == null || results.length == 0;
    }
}