package com.lena.homework.ex1;

public class Exam {
    private final int examHour = 9;
    private final int examMinutes = 30;
    //Трансформируем время в минуты
    int examTimeMin = getTimeInMins(examHour, examMinutes);

    private int getTimeInMins(int hours, int minutes) {
        return hours * 60 + minutes;
    }

    public void processExam(int hour, int minutes) {
        int arrivalTime = getTimeInMins(hour, minutes);
        // Вовремя ли пришел студент на экзамен?
        if (arrivalTime == examTimeMin || (examTimeMin - arrivalTime <= 30 && arrivalTime < examTimeMin)) {
            System.out.println("Студент пришел вовремя! ");

        } else if (arrivalTime < examTimeMin - 30) {
            int timeEarly = examTimeMin - arrivalTime;
            int mins = timeEarly % 60;
            int hrs = (timeEarly - mins) / 60;

            System.out.println("Студент пришел слишком рано на " + hrs + " час (-a,-ов) и " + mins + " минут (-ы)");

        } else if (arrivalTime > examTimeMin) {
            int timeLate = arrivalTime - examTimeMin;
            int mins = timeLate % 60;
            int hrs = (timeLate - mins) / 60;

            System.out.println("Студент опоздал на " + hrs + " часа (-ов) и " + mins + " минут (-ы)");
        }
    }
}
