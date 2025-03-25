package task01.app;

import java.time.LocalDate;
import java.time.Period;

public class TaskSolution {
	
	ReadDataFromConsole readDataFromConsoleObj = new ReadDataFromConsole();
	User userData = readDataFromConsoleObj.getUserData();
	
	public User getUser() {
        return userData;
    }
	
	public int getAge(User user) {
        LocalDate today = LocalDate.now();
        return Period.between(user.getDateOfBirth(), today).getYears();
    }

}
