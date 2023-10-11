import java.util.*;

public class Points {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passing;
    private ArrayList<Integer> grades;

    public Points() {
        this.points = new ArrayList<>();
        this.passing = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void add(int point) {
        points.add(point);
        if (point >= 50) {
            passing.add(point);
        }
        grades.add(gradeDistribution(point));
    }

    public double passingAverage() {
        int passSum = 0;
        int passCount = passing.size();
        if (passing.isEmpty()) {
            return -1;
        } else {
            for (Integer pass : passing) {
                passSum += pass;
            }
        }
        return 1.0 * passSum / passCount;
    }

    public double average() {
        int sum = 0;
        int count = points.size();
        if (points.isEmpty()) {
            return -1;
        } else {
            for (Integer point : points) {
                sum += point;
            }
        }
        return 1.0 * sum / count;
    }

    public double passPercentage() {
        int total = points.size();
        int passTotal = passing.size();

        if (points.isEmpty() || passing.isEmpty()) {
            return -1;
        }
        return 100.0 * passTotal / total;
    }
    
    public int gradeDistribution(int point) {
        int grade = 0;
        if (point < 50) {
            grade = 0;
        } else if (point < 60) {
            grade = 1;
        } else if (point < 70) {
            grade = 2;
        } else if (point < 80) {
            grade = 3;
        } else if (point < 90) {
            grade = 4;
        } else if (point <= 100) {
            grade = 5;
        }
        return grade;
    }
    
    public void gradeStar(){
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (Integer grade: grades) {
                if (grade == i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

}
