package task01.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class ReadDataFromConsole {
	
	public User getUserData() {
		String firstName;
		String lastName;
		String userName;
		LocalDate dateOfBirth;
		Boolean status;
		User userObj = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Kérem adja meg a felhasználó adatait: ");
			System.out.print("Keresztnév(szöveg): ");
			firstName = br.readLine();
			System.out.print("Vezetéknév(szöveg): ");
			lastName = br.readLine();
			System.out.print("Felhasználónév(szöveg): ");
			userName = br.readLine();
			System.out.print("Születési dátum(yyyy-MM-dd): ");
			dateOfBirth = LocalDate.parse(br.readLine());
			System.out.print("Állapot(igaz: 1, hamis: 2): ");
			status = br.readLine().equalsIgnoreCase("1");
			
            userObj = new User(firstName, lastName, userName, dateOfBirth, status);
            
		} catch (Exception e) {
			// TODO: handle exception
		}
		return userObj;
	}

}
