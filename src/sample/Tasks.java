package sample;


import java.sql.*;
import java.util.Scanner;

public class Tasks {
    // Name of the user // and defining the task which user can enter
    // Creating a database name tasks.db at the location described below
    public static final String DB_NAME = "tasks.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/zsyed/IdeaProjects/UIForProgressList/" + DB_NAME;
    // Creating the first task table for AWSDeveloper
    public static final String TABLE_TASK1 = "AWSDEVELOPER";
    //public static final String COLUMN_AWSDEVELOPER_ID = "_id";
    public static final String COLUMN_AWSDEVELOPER_WEEKID = "Week_id";
    public static final String COLUMN_AWSDEVELOPER_SUNDAY = "Sunday";
    public static final String COLUMN_AWSDEVELOPER_MONDAY = "Monday";
    public static final String COLUMN_AWSDEVELOPER_TUESDAY = "Tuesday";
    public static final String COLUMN_AWSDEVELOPER_WEDNESDAY = "Wednesday";
    public static final String COLUMN_AWSDEVELOPER_THURSDAY = "Thursday";
    public static final String COLUMN_AWSDEVELOPER_FRIDAY = "Friday";
    public static final String COLUMN_AWSDEVELOPER_SATURDAY = "Saturday";
    // Creating the second task table for Java
    public static final String TABLE_TASK2 = "Java";
    //public static final String COLUMN_Java_ID = "_id";
    public static final String COLUMN_Java_WEEKID = "Week_id";
    public static final String COLUMN_Java_SUNDAY = "Sunday";
    public static final String COLUMN_Java_MONDAY = "Monday";
    public static final String COLUMN_Java_TUESDAY = "Tuesday";
    public static final String COLUMN_Java_WEDNESDAY = "Wednesday";
    public static final String COLUMN_Java_THURSDAY = "Thursday";
    public static final String COLUMN_Java_FRIDAY = "Friday";
    public static final String COLUMN_Java_SATURDAY = "Saturday";
    // Creating Third Task table for JSHTMLCSS
    public static final String TABLE_TASK3 = "JSHTMLCSS";
    //public static final String COLUMN_JSHTMLCSS_ID = "_id";
    public static final String COLUMN_JSHTMLCSS_WEEKID = "Week_id";
    public static final String COLUMN_JSHTMLCSS_SUNDAY = "Sunday";
    public static final String COLUMN_JSHTMLCSS_MONDAY = "Monday";
    public static final String COLUMN_JSHTMLCSS_TUESDAY = "Tuesday";
    public static final String COLUMN_JSHTMLCSS_WEDNESDAY = "Wednesday";
    public static final String COLUMN_JSHTMLCSS_THURSDAY = "Thursday";
    public static final String COLUMN_JSHTMLCSS_FRIDAY = "Friday";
    public static final String COLUMN_JSHTMLCSS_SATURDAY = "Saturday";
    // Creating a fourth task table for Pentesting
    public static final String TABLE_TASK4 = "PenTesting";
    //public static final String COLUMN_PenTesting_ID = "_id";
    public static final String COLUMN_PenTesting_WEEKID = "Week_id";
    public static final String COLUMN_PenTesting_SUNDAY = "Sunday";
    public static final String COLUMN_PenTesting_MONDAY = "Monday";
    public static final String COLUMN_PenTesting_TUESDAY = "Tuesday";
    public static final String COLUMN_PenTesting_WEDNESDAY = "Wednesday";
    public static final String COLUMN_PenTesting_THURSDAY = "Thursday";
    public static final String COLUMN_PenTesting_FRIDAY = "Friday";
    public static final String COLUMN_PenTesting_SATURDAY = "Saturday";
    // Creating a fifth task table for Code Review
    public static final String TABLE_TASK5 = "CodeReview";
    //public static final String COLUMN_CodeReview_ID = "_id";
    public static final String COLUMN_CodeReview_WEEKID = "Week_id";
    public static final String COLUMN_CodeReview_SUNDAY = "Sunday";
    public static final String COLUMN_CodeReview_MONDAY = "Monday";
    public static final String COLUMN_CodeReview_TUESDAY = "Tuesday";
    public static final String COLUMN_CodeReview_WEDNESDAY = "Wednesday";
    public static final String COLUMN_CodeReview_THURSDAY = "Thursday";
    public static final String COLUMN_CodeReview_FRIDAY = "Friday";
    public static final String COLUMN_CodeReview_SATURDAY = "Saturday";
    // creating a query to create a table for AWSDEVELOPER TASK
    public final String QUERY_AWSDEVELOPER_TABLE_CREATION = "CREATE TABLE IF NOT EXISTS " +
            TABLE_TASK1 + '(' + COLUMN_AWSDEVELOPER_WEEKID + " int PRIMARY KEY, " +
            COLUMN_AWSDEVELOPER_SUNDAY +
            " int, " + COLUMN_AWSDEVELOPER_MONDAY +
            " int, " + COLUMN_AWSDEVELOPER_TUESDAY +
            " int, " + COLUMN_AWSDEVELOPER_WEDNESDAY +
            " int, " + COLUMN_AWSDEVELOPER_THURSDAY +
            " int, " + COLUMN_AWSDEVELOPER_FRIDAY +
            " int, " + COLUMN_AWSDEVELOPER_SATURDAY + " int, UNIQUE(" + COLUMN_AWSDEVELOPER_WEEKID + "))";
    // creating a query to create a table for Java task
    public final String QUERY_Java_TABLE_CREATION = "CREATE TABLE IF NOT EXISTS " +
            TABLE_TASK2 + '(' + COLUMN_Java_WEEKID + " int PRIMARY KEY, " + COLUMN_Java_SUNDAY +
            " int, " + COLUMN_Java_MONDAY +
            " int, " + COLUMN_Java_TUESDAY +
            " int, " + COLUMN_Java_WEDNESDAY +
            " int, " + COLUMN_Java_THURSDAY +
            " int, " + COLUMN_Java_FRIDAY +
            " int, " + COLUMN_Java_SATURDAY + " int, UNIQUE(" + COLUMN_Java_WEEKID + "))";
    // creating a query to create a table for JSHTMLCSS task
    public final String QUERY_JSHTMLCSS_TABLE_CREATION = "CREATE TABLE IF NOT EXISTS " +
            TABLE_TASK3 + '(' + COLUMN_JSHTMLCSS_WEEKID + " int PRIMARY KEY, " + COLUMN_JSHTMLCSS_SUNDAY +
            " int, " + COLUMN_JSHTMLCSS_MONDAY +
            " int, " + COLUMN_JSHTMLCSS_TUESDAY +
            " int, " + COLUMN_JSHTMLCSS_WEDNESDAY +
            " int, " + COLUMN_JSHTMLCSS_THURSDAY +
            " int, " + COLUMN_JSHTMLCSS_FRIDAY +
            " int, " + COLUMN_JSHTMLCSS_SATURDAY + " int, UNIQUE(" + COLUMN_JSHTMLCSS_WEEKID + "))";
    //creating a query to create a table for PenTesting task
    public final String QUERY_PenTesting_TABLE_CREATION = "CREATE TABLE IF NOT EXISTS " +
            TABLE_TASK4 + '(' + COLUMN_PenTesting_WEEKID + " int PRIMARY KEY, " + COLUMN_PenTesting_SUNDAY +
            " int, " + COLUMN_PenTesting_MONDAY +
            " int, " + COLUMN_PenTesting_TUESDAY +
            " int, " + COLUMN_PenTesting_WEDNESDAY +
            " int, " + COLUMN_PenTesting_THURSDAY +
            " int, " + COLUMN_PenTesting_FRIDAY +
            " int, " + COLUMN_PenTesting_SATURDAY + " int, UNIQUE(" + COLUMN_PenTesting_WEEKID + "))";
    // creating  a query to create a table for CodeReview task
    public final String QUERY_CodeReview_TABLE_CREATION = "CREATE TABLE IF NOT EXISTS " +
            TABLE_TASK5 + '(' + COLUMN_CodeReview_WEEKID + " int PRIMARY KEY, " + COLUMN_CodeReview_SUNDAY +
            " int, " + COLUMN_CodeReview_MONDAY +
            " int, " + COLUMN_CodeReview_TUESDAY +
            " int, " + COLUMN_CodeReview_WEDNESDAY +
            " int, " + COLUMN_CodeReview_THURSDAY +
            " int, " + COLUMN_CodeReview_FRIDAY +
            " int, " + COLUMN_CodeReview_SATURDAY + " int, UNIQUE(" + COLUMN_CodeReview_WEEKID + "))";

    public void createNewTables() {
        try (Connection conn = DriverManager.getConnection(CONNECTION_STRING);
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(QUERY_AWSDEVELOPER_TABLE_CREATION);
            stmt.execute(QUERY_Java_TABLE_CREATION);
            stmt.execute(QUERY_JSHTMLCSS_TABLE_CREATION);
            stmt.execute(QUERY_PenTesting_TABLE_CREATION);
            stmt.execute(QUERY_CodeReview_TABLE_CREATION);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        while (option != 'F') {
            System.out.println("=======");
            System.out.println("Enter which Table you want to enter");
            System.out.println("\n");
            System.out.println("Welcome to the progress list ");
            System.out.println("\n");
            System.out.println("A. Table for AWSDeveloper Task");
            System.out.println("B. Table for Java Task");
            System.out.println("C. Table for JSHTMLCSS Task");
            System.out.println("D. Table for PenTesting Task");
            System.out.println("E. Table for CodeReview Task");
            System.out.println("F. For Exit");
            option = scanner.next().charAt(0);
            System.out.println("\n");
            switch (option) {
                case 'A':
                    char optionA = '\0';
                    while (optionA != 'F') {
                        System.out.println("Welcome to the AWSDeveloper Task ");
                        System.out.println("\n");
                        System.out.println("A. To Query the table for the progress throughout");
                        System.out.println("B. To update time for Week1");
                        System.out.println("C. To update time for Week2");
                        System.out.println("D. To update time for Week3");
                        System.out.println("E. To update time for Week4");
                        System.out.println("F. For Exit");
                        System.out.println("=======");
                        System.out.println("Please Enter your option");
                        System.out.println("\n");
                        optionA = scanner.next().charAt(0);
                        System.out.println("\n");
                        switch (optionA) {
                            case 'A':
                                System.out.println("=============");
                                System.out.println("Querying AWS Database");
                                Querytable(TABLE_TASK1);
                                break;
                            case 'B':
                                System.out.println("You can update your time for Week1 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek1 = '\0';
                                while (optionWeek1 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek1 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek1) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_SUNDAY, hoursworked, 1);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_MONDAY, hoursworked, 1);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_TUESDAY, hoursworked, 1);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_WEDNESDAY, hoursworked, 1);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_THURSDAY, hoursworked, 1);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_FRIDAY, hoursworked, 1);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_SATURDAY, hoursworked, 1);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'C':
                                System.out.println("You can update your time for Week2 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek2 = '\0';
                                while (optionWeek2 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek2 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek2) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_SUNDAY, hoursworked, 2);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_MONDAY, hoursworked, 2);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_TUESDAY, hoursworked, 2);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_WEDNESDAY, hoursworked, 2);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_THURSDAY, hoursworked, 2);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_FRIDAY, hoursworked, 2);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_SATURDAY, hoursworked, 2);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'D':
                                System.out.println("You can update your time for Week3 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek3 = '\0';
                                while (optionWeek3 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek3 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek3) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_SUNDAY, hoursworked, 3);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_MONDAY, hoursworked, 3);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_TUESDAY, hoursworked, 3);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_WEDNESDAY, hoursworked, 3);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_THURSDAY, hoursworked, 3);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_FRIDAY, hoursworked, 3);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_SATURDAY, hoursworked, 3);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;

                            case 'E':
                                System.out.println("You can update your time for Week4 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek4 = '\0';
                                while (optionWeek4 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek4 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek4) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_SUNDAY, hoursworked, 4);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_MONDAY, hoursworked, 4);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_TUESDAY, hoursworked, 4);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_WEDNESDAY, hoursworked, 4);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_THURSDAY, hoursworked, 4);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_FRIDAY, hoursworked, 4);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK1, COLUMN_AWSDEVELOPER_SATURDAY, hoursworked, 4);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'F':
                                System.out.println("Exiting");
                        }
                    }
                    break;
                case 'B':
                    char optionB = '\0';
                    while (optionB != 'F') {
                        System.out.println("Welcome to the Java Task ");
                        System.out.println("\n");
                        System.out.println("A. To Query the table for the progress throughout");
                        System.out.println("B. To update time for Week1");
                        System.out.println("C. To update time for Week2");
                        System.out.println("D. To update time for Week3");
                        System.out.println("E. To update time for Week4");
                        System.out.println("F. For Exit");
                        System.out.println("=======");
                        System.out.println("Please Enter your option");
                        System.out.println("\n");
                        optionB = scanner.next().charAt(0);
                        System.out.println("\n");
                        switch (optionB) {
                            case 'A':
                                System.out.println("=============");
                                System.out.println("Querying JAVA Database");
                                Querytable(TABLE_TASK2);
                                break;
                            case 'B':
                                System.out.println("You can update your time for Week1 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek1 = '\0';
                                while (optionWeek1 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek1 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek1) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_SUNDAY, hoursworked, 1);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_MONDAY, hoursworked, 1);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_TUESDAY, hoursworked, 1);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_WEDNESDAY, hoursworked, 1);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_THURSDAY, hoursworked, 1);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_FRIDAY, hoursworked, 1);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_SATURDAY, hoursworked, 1);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'C':
                                System.out.println("You can update your time for Week2 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek2 = '\0';
                                while (optionWeek2 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek2 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek2) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_SUNDAY, hoursworked, 2);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_MONDAY, hoursworked, 2);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_TUESDAY, hoursworked, 2);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_WEDNESDAY, hoursworked, 2);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_THURSDAY, hoursworked, 2);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_FRIDAY, hoursworked, 2);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_SATURDAY, hoursworked, 2);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'D':
                                System.out.println("You can update your time for Week3 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek3 = '\0';
                                while (optionWeek3 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek3 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek3) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_SUNDAY, hoursworked, 3);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_MONDAY, hoursworked, 3);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_TUESDAY, hoursworked, 3);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_WEDNESDAY, hoursworked, 3);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_THURSDAY, hoursworked, 3);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_FRIDAY, hoursworked, 3);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_SATURDAY, hoursworked, 3);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;

                            case 'E':
                                System.out.println("You can update your time for Week4 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek4 = '\0';
                                while (optionWeek4 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek4 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek4) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_SUNDAY, hoursworked, 4);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_MONDAY, hoursworked, 4);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_TUESDAY, hoursworked, 4);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_WEDNESDAY, hoursworked, 4);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_THURSDAY, hoursworked, 4);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_FRIDAY, hoursworked, 4);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK2, COLUMN_Java_SATURDAY, hoursworked, 4);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'F':
                                System.out.println("Exiting");
                        }
                    }
                    break;
                case 'C':
                    char optionC = '\0';
                    while (optionC != 'F') {
                        System.out.println("Welcome to the JSHTMLCSS Task ");
                        System.out.println("\n");
                        System.out.println("A. To Query the table for the progress throughout");
                        System.out.println("B. To update time for Week1");
                        System.out.println("C. To update time for Week2");
                        System.out.println("D. To update time for Week3");
                        System.out.println("E. To update time for Week4");
                        System.out.println("F. For Exit");
                        System.out.println("=======");
                        System.out.println("Please Enter your option");
                        System.out.println("\n");
                        optionC = scanner.next().charAt(0);
                        System.out.println("\n");
                        switch (optionC) {
                            case 'A':
                                System.out.println("=============");
                                System.out.println("Querying JSHTMLCSS Database");
                                Querytable(TABLE_TASK3);
                                break;
                            case 'B':
                                System.out.println("You can update your time for Week1 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek1 = '\0';
                                while (optionWeek1 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek1 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek1) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_SUNDAY, hoursworked, 1);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_MONDAY, hoursworked, 1);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_TUESDAY, hoursworked, 1);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_WEDNESDAY, hoursworked, 1);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_THURSDAY, hoursworked, 1);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_FRIDAY, hoursworked, 1);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_SATURDAY, hoursworked, 1);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'C':
                                System.out.println("You can update your time for Week2 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek2 = '\0';
                                while (optionWeek2 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek2 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek2) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_SUNDAY, hoursworked, 2);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_MONDAY, hoursworked, 2);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_TUESDAY, hoursworked, 2);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_WEDNESDAY, hoursworked, 2);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_THURSDAY, hoursworked, 2);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_FRIDAY, hoursworked, 2);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_SATURDAY, hoursworked, 2);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'D':
                                System.out.println("You can update your time for Week3 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek3 = '\0';
                                while (optionWeek3 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek3 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek3) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_SUNDAY, hoursworked, 3);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_MONDAY, hoursworked, 3);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_TUESDAY, hoursworked, 3);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_WEDNESDAY, hoursworked, 3);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_THURSDAY, hoursworked, 3);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_FRIDAY, hoursworked, 3);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_SATURDAY, hoursworked, 3);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;

                            case 'E':
                                System.out.println("You can update your time for Week4 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek4 = '\0';
                                while (optionWeek4 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek4 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek4) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_SUNDAY, hoursworked, 4);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_MONDAY, hoursworked, 4);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_TUESDAY, hoursworked, 4);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_WEDNESDAY, hoursworked, 4);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_THURSDAY, hoursworked, 4);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_FRIDAY, hoursworked, 4);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK3, COLUMN_JSHTMLCSS_SATURDAY, hoursworked, 4);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'F':
                                System.out.println("Exiting");
                        }
                    }
                    break;
                case 'D':
                    char optionD = '\0';
                    while (optionD != 'F') {
                        System.out.println("Welcome to the PenTesting Task ");
                        System.out.println("\n");
                        System.out.println("A. To Query the table for the progress throughout");
                        System.out.println("B. To update time for Week1");
                        System.out.println("C. To update time for Week2");
                        System.out.println("D. To update time for Week3");
                        System.out.println("E. To update time for Week4");
                        System.out.println("F. For Exit");
                        System.out.println("=======");
                        System.out.println("Please Enter your option");
                        System.out.println("\n");
                        optionD = scanner.next().charAt(0);
                        System.out.println("\n");
                        switch (optionD) {
                            case 'A':
                                System.out.println("=============");
                                System.out.println("Querying PenTesting Database");
                                Querytable(TABLE_TASK4);
                                break;
                            case 'B':
                                System.out.println("You can update your time for Week1 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek1 = '\0';
                                while (optionWeek1 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek1 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek1) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_SUNDAY, hoursworked, 1);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_MONDAY, hoursworked, 1);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_TUESDAY, hoursworked, 1);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_WEDNESDAY, hoursworked, 1);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_THURSDAY, hoursworked, 1);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_FRIDAY, hoursworked, 1);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_SATURDAY, hoursworked, 1);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'C':
                                System.out.println("You can update your time for Week2 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek2 = '\0';
                                while (optionWeek2 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek2 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek2) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_SUNDAY, hoursworked, 2);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_MONDAY, hoursworked, 2);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_TUESDAY, hoursworked, 2);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_WEDNESDAY, hoursworked, 2);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_THURSDAY, hoursworked, 2);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_FRIDAY, hoursworked, 2);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_SATURDAY, hoursworked, 2);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'D':
                                System.out.println("You can update your time for Week3 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek3 = '\0';
                                while (optionWeek3 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek3 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek3) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_SUNDAY, hoursworked, 3);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_MONDAY, hoursworked, 3);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_TUESDAY, hoursworked, 3);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_WEDNESDAY, hoursworked, 3);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_THURSDAY, hoursworked, 3);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_FRIDAY, hoursworked, 3);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_SATURDAY, hoursworked, 3);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;

                            case 'E':
                                System.out.println("You can update your time for Week4 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek4 = '\0';
                                while (optionWeek4 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek4 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek4) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_SUNDAY, hoursworked, 4);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_MONDAY, hoursworked, 4);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_TUESDAY, hoursworked, 4);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_WEDNESDAY, hoursworked, 4);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_THURSDAY, hoursworked, 4);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_FRIDAY, hoursworked, 4);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK4, COLUMN_PenTesting_SATURDAY, hoursworked, 4);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'F':
                                System.out.println("Exiting");
                        }
                    }
                    break;
                case 'E':
                    char optionE = '\0';
                    while (optionE != 'F') {
                        System.out.println("Welcome to the CodeReview Task ");
                        System.out.println("\n");
                        System.out.println("A. To Query the table for the progress throughout");
                        System.out.println("B. To update time for Week1");
                        System.out.println("C. To update time for Week2");
                        System.out.println("D. To update time for Week3");
                        System.out.println("E. To update time for Week4");
                        System.out.println("F. For Exit");
                        System.out.println("=======");
                        System.out.println("Please Enter your option");
                        System.out.println("\n");
                        optionE = scanner.next().charAt(0);
                        System.out.println("\n");
                        switch (optionE) {
                            case 'A':
                                System.out.println("=============");
                                System.out.println("Querying CodeReview Database");
                                Querytable(TABLE_TASK5);
                                break;
                            case 'B':
                                System.out.println("You can update your time for Week1 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek1 = '\0';
                                while (optionWeek1 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek1 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek1) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_SUNDAY, hoursworked, 1);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_MONDAY, hoursworked, 1);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_TUESDAY, hoursworked, 1);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_WEDNESDAY, hoursworked, 1);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_THURSDAY, hoursworked, 1);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_FRIDAY, hoursworked, 1);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_SATURDAY, hoursworked, 1);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'C':
                                System.out.println("You can update your time for Week2 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek2 = '\0';
                                while (optionWeek2 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek2 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek2) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_SUNDAY, hoursworked, 2);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_MONDAY, hoursworked, 2);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_TUESDAY, hoursworked, 2);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_WEDNESDAY, hoursworked, 2);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_THURSDAY, hoursworked, 2);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_FRIDAY, hoursworked, 2);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_SATURDAY, hoursworked, 2);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'D':
                                System.out.println("You can update your time for Week3 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek3 = '\0';
                                while (optionWeek3 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek3 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek3) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_SUNDAY, hoursworked, 3);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_MONDAY, hoursworked, 3);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_TUESDAY, hoursworked, 3);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_WEDNESDAY, hoursworked, 3);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_THURSDAY, hoursworked, 3);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_FRIDAY, hoursworked, 3);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_SATURDAY, hoursworked, 3);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;

                            case 'E':
                                System.out.println("You can update your time for Week4 here");
                                System.out.println("--------");
                                System.out.println("Please enter the Day you want to add hours to");
                                System.out.println("\n");
                                char optionWeek4 = '\0';
                                while (optionWeek4 != 'H') {
                                    System.out.println("=======");
                                    System.out.println("Enter the day you want to be updated");
                                    System.out.println("A. To update time for Sunday");
                                    System.out.println("B. To update time for Monday");
                                    System.out.println("C. To update time for Tuesday");
                                    System.out.println("D. To update time for Wednesday");
                                    System.out.println("E. To update time for Thursday");
                                    System.out.println("F. To update time for Friday");
                                    System.out.println("G. To update time for Saturday");
                                    System.out.println("H. To Exit");
                                    System.out.println("\n");
                                    optionWeek4 = scanner.next().charAt(0);
                                    System.out.println("\n");
                                    switch (optionWeek4) {
                                        case 'A':
                                            System.out.println("Please enter the number of hours for Sunday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            int hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_SUNDAY, hoursworked, 4);
                                            break;
                                        case 'B':
                                            System.out.println("Please enter the number of hours for Monday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_MONDAY, hoursworked, 4);
                                            break;
                                        case 'C':
                                            System.out.println("Please enter the number of hours for Tuesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_TUESDAY, hoursworked, 4);
                                            break;
                                        case 'D':
                                            System.out.println("Please enter the number of hours for Wednesday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_WEDNESDAY, hoursworked, 4);
                                            break;
                                        case 'E':
                                            System.out.println("Please enter the number of hours for Thursday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_THURSDAY, hoursworked, 4);
                                            break;
                                        case 'F':
                                            System.out.println("Please enter the number of hours for Friday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_FRIDAY, hoursworked, 4);
                                            break;
                                        case 'G':
                                            System.out.println("Please enter the number of hours for Saturday below");
                                            System.out.println("---------");
                                            System.out.println("\n");
                                            hoursworked = scanner.nextInt();
                                            EnteringHours(TABLE_TASK5, COLUMN_CodeReview_SATURDAY, hoursworked, 4);
                                            break;
                                        case 'H':
                                            System.out.println("Exiting");
                                            break;
                                    }
                                }
                                break;
                            case 'F':
                                System.out.println("Exiting");
                        }
                    }
                    break;

            }
        }
    }

    // driving a new method and provide the table name in the parameter itself
    public void Querytable(String tablename) {
        try (Connection conn = DriverManager.getConnection(CONNECTION_STRING);
             Statement stmt = conn.createStatement()) {
            // create a new table
            String querystring = "SELECT * FROM " + tablename;
            stmt.execute(querystring);
            ResultSet rs = stmt.executeQuery(querystring);
            while (rs.next()) {
                System.out.println(rs.getInt("Week_id") + "\t" + rs.getInt("Sunday") + "\t" +
                        rs.getInt("Monday") + "\t" + rs.getInt("Tuesday") + "\t" + rs.getInt("Wednesday") +
                        "\t" + rs.getInt("Thursday") + "\t" + rs.getInt("Friday") + "\t" + rs.getInt("Saturday"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void EnteringHours(String tablename, String day, int numberofhours, int weekid) {
        if ((weekid <= 4) && (weekid >= 0)) {
            try (Connection conn = DriverManager.getConnection(CONNECTION_STRING);
                 Statement stmt = conn.createStatement()) {
                // create a new table
                String sql = "UPDATE " + tablename + " SET " + day + " = '" + numberofhours + "'" + " WHERE  Week_id = " + "'" + weekid + "'";
                //WHERE " + COLUMN_AWSDEVELOPER_WEEKID + "= '1'" ;
                stmt.execute(sql);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Please enter a valid week number from 1 -4");
        }
    }

    public int Extractinghoursforoneweek(String tablename, int weekid) {
        if ((weekid <= 4) && (weekid >= 0)) {
            try (Connection conn = DriverManager.getConnection(CONNECTION_STRING)) {
                Statement stmt = conn.createStatement();
                String sql = "SELECT Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday FROM " + tablename + " WHERE  Week_id = " + "'" + weekid + "'";
                stmt.execute(sql);
                ResultSet rs = stmt.executeQuery(sql);
                int Sundaytime = rs.getInt("Sunday");
                int Mondaytime = rs.getInt("Monday");
                int Tuesdaytime = rs.getInt("Tuesday");
                int Wednesdaytime = rs.getInt("Wednesday");
                int Thursdaytime = rs.getInt("Thursday");
                int Fridaytime = rs.getInt("Friday");
                int Saturdaytime = rs.getInt("Saturday");
                int sum = Sundaytime + Mondaytime+Tuesdaytime+ Wednesdaytime+Thursdaytime+Fridaytime+Saturdaytime;
                return sum;
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Please enter a valid week number from 1 -4");
        }
        return 0;
    }
    public int Extractinghoursforall(String tablename) {
        int week1 = Extractinghoursforoneweek(tablename, 1);
        int week2 = Extractinghoursforoneweek(tablename, 2);
        int week3 = Extractinghoursforoneweek(tablename, 3);
        int week4 = Extractinghoursforoneweek(tablename, 4);
        int total = week1+week2+week3+week4;
        return total;
    }
}