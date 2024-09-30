import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month = 0;
        int year = 0;

        // Loop until valid month and year are entered
        while (true) {
            // Ask user to enter the month
            System.out.print("Enter the month (full name, abbreviation, or number): ");
            String monthInput = input.nextLine().trim();

            // Parse month input
            month = parseMonth(monthInput);
            if (month == -1) {
                System.out.println("Invalid month. Please try again.");
                continue;
            }

            // Ask user to enter the year
            System.out.print("Enter the year (4 digits): ");
            String yearInput = input.nextLine().trim();

            try {
                year = Integer.parseInt(yearInput);
                if (year < 0) {
                    System.out.println("Invalid year. Please enter a non-negative number.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid year. Please enter a valid 4-digit number.");
                continue;
            }

            // Now we have valid month and year
            break;
        }

        // Get the number of days in the entered month and year
        int days = getDaysInMonth(month, year);

        System.out.println("The number of days in " + getMonthName(month) + " " + year + " is: " + days);
        input.close();
    }

    // Method to parse the month input and return the corresponding number (1-12)
    public static int parseMonth(String monthInput) {
        monthInput = monthInput.toLowerCase();

        switch (monthInput) {
            case "1":
            case "january":
            case "jan":
            case "jan.":
                return 1;
            case "2":
            case "february":
            case "feb":
            case "feb.":
                return 2;
            case "3":
            case "march":
            case "mar":
            case "mar.":
                return 3;
            case "4":
            case "april":
            case "apr":
            case "apr.":
                return 4;
            case "5":
            case "may":
                return 5;
            case "6":
            case "june":
            case "jun":
                return 6;
            case "7":
            case "july":
            case "jul":
                return 7;
            case "8":
            case "august":
            case "aug":
            case "aug.":
                return 8;
            case "9":
            case "september":
            case "sep":
            case "sep.":
                return 9;
            case "10":
            case "october":
            case "oct":
            case "oct.":
                return 10;
            case "11":
            case "november":
            case "nov":
            case "nov.":
                return 11;
            case "12":
            case "december":
            case "dec":
            case "dec.":
                return 12;
            default:
                return -1; // Invalid month input
        }
    }

    // Method to get the number of days in a given month and year
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1; // This should never happen as month is already validated
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    // Method to get the full month name based on the month number
    public static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Unknown";
        }
    }
}
