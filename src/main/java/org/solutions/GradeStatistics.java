package org.solutions;

import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> gradeList;

    public GradeStatistics() {

        this.gradeList = new ArrayList<>();
    }

    public void addGrade(int gradeToAdd) {
        if ((gradeToAdd >= 0) && (gradeToAdd <= 100)) {
            this.gradeList.add(gradeToAdd);

        }
    }

    public float totalAverage() {
        if (gradeList == null || gradeList.isEmpty()) {
            return 0.0f;
        }

        float sum = 0;
        for (int grade : gradeList) {
            sum += grade;
        }
        return sum / gradeList.size();
    }

    public float passingTotalAverage() {
        if (gradeList == null || gradeList.isEmpty()) {
            return 0.0f;
        }

        float sum = 0;
        int counter = 0;
        for (int grade : gradeList) {
            if (grade >= 50) {
                sum += grade;
                counter++;
            }
        }
        return sum / counter;
    }

    public float passPercentage() {
        if (gradeList == null || gradeList.isEmpty()) {
            return 0.0f;
        }

        float sum = 0;
        int passedCounter = 0;
        for (int grade : gradeList) {
            if (grade >= 50) {
                sum += grade;
                passedCounter++;
            }
        }

        return (float) (100.0 * passedCounter / gradeList.size());
    }

    public String gradeDistribution() {
        int[] grades = new int[6];

        for (int points : gradeList) {
            int grade;

            if (points < 50) {
                grade = 0;
            } else if (points < 60) {
                grade = 1;
            } else if (points < 70) {
                grade = 2;
            } else if (points < 80) {
                grade = 3;
            } else if (points < 90) {
                grade = 4;
            } else {
                grade = 5;
            }

            grades[grade]++;
        }

        StringBuilder result = new StringBuilder();
        result.append("Grade distribution:\n");

        for (int i = 5; i >= 0; i--) {
            result.append(i).append(": ");
            for (int j = 0; j < grades[i]; j++) {
                result.append("*");
            }
            result.append("\n");
        }

        return result.toString();
    }
}
