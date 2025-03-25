package task01.app;

public class App {

	public static void main(String[] args) {
		
		TaskSolution taskSolutionObj = new TaskSolution();
        User user = taskSolutionObj.getUser();
        System.out.println(user.toStringDivider() + ", Életkor: " + taskSolutionObj.getAge(user));

	}

}
