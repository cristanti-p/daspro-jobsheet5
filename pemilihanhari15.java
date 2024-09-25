import java.util.Scanner;

public class pemilihanhari15 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);

        String dayName,dayType;
        System.out.println("Input day name: ");
        dayName = util.nextLine();
        switch (dayName.toLowerCase()) {
            case "monday" :
            case "tuesday" :
            case "wednesday" :
            case "thursday" :
            case "friday" :
                dayType = "Weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "Weekday";
                break;
            default:
                dayType = "invalid day name";
        } 
        System.out.println(dayName + " is a " + dayType);
    }
}