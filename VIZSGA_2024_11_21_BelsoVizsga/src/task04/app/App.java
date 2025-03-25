package task04.app;

public class App {

	public static void main(String[] args) {
		
		TaskSolution taskSolutionObj = new TaskSolution();
		taskSolutionObj.fillFootWearList();
		taskSolutionObj.printAllFootWearData();
		
        System.out.println("\nLegolcsóbb akciós cipő(k):");
        taskSolutionObj.getLeastExpensiveSaleFootWear();
        
        // Kész

	}
}
