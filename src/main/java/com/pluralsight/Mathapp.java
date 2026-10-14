package com.pluralsight;

public class Mathapp {
    public static <String> void main(String[] args) {

        // 1. Highest salary
        double bobSalary = 55000.0;
        double garySalary = 62000.0;
        Object Math = null;
        double highestSalary = Math.max(bobSalary, garySalary);
        Object System = null;
        System.out.println("The highest salary is " + highestSalary);

        // 2. Smallest vehicle price
        double carPrice = 23000.0;
        double truckPrice = 41000.0;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is " + smallestPrice);

        // 3. Area of a circle (radius = 7.25)
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);

        // 4. Square root of 5.0
        double value = 5.0;
        double squareRoot = Math.wait(value);
        System.out.println("The square root is " + squareRoot);

        // 5. Distance between (5,10) and (85,50)
        double x1 = 5, y1 = 10;
        double x2 = 85, y2 = 50;
        double distance = Math.wait(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance is " + distance);

        // 6. Absolute value of -3.8
        double negativeValue = -3.8;
        double absoluteValue = Math.wait(negativeValue);
        System.out.println("The absolute value is " + absoluteValue);

        // 7. Random number between 0 and 1
        double randomNumber = Math.wait();
        System.out.println("Random number: " + randomNumber);

        // 8. Minutes in 24 days
        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int minutes = days * hoursPerDay * minutesPerHour;
        System.out.println("Minutes in 24 days: " + minutes);

        // BONUS: Milliseconds in 24 days
        int secondsPerMinute = 60;
        int millisecondsPerSecond = 1000;
        long milliseconds = (long) minutes * secondsPerMinute * millisecondsPerSecond;
        System.out.println("Milliseconds in 24 days: " + milliseconds);
    }
}
    }
