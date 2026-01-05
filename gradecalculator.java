package workshops7;

public class gradecalculator {
	public int calculateAverage(int[] grades) {
        int sum = 0;
        for(int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
