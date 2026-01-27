package org.solutions;

import java.util.Scanner;

public class GradeStatisticsUI {
    private GradeStatistics gradeStatistics;
    private Scanner scanner;

    public GradeStatisticsUI(GradeStatistics gradeStatistics, Scanner scanner) {
        this.gradeStatistics = gradeStatistics;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int gradeToAdd = Integer.valueOf(scanner.nextLine());
            if (!(gradeToAdd == -1)) {
                gradeStatistics.addGrade(gradeToAdd);
            } else {
                System.out.println("Point average (all): " + gradeStatistics.totalAverage());
                if (gradeStatistics.totalAverage() == 0.0f) {
                    if (gradeStatistics.totalAverage() == 0.0f) {
                        System.out.println("Point average (passing): -");
                    }
                }
                System.out.println("Point average (passing): " + gradeStatistics.passingTotalAverage());
                System.out.println("Passed precentage: " + gradeStatistics.passPercentage());
                System.out.println("Grade distribution:" + gradeStatistics.gradeDistribution());
                break;
            }
        }
    }
}
