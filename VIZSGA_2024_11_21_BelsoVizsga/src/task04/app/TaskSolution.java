package task04.app;

import java.util.ArrayList;
import java.util.List;

public class TaskSolution {
	
	List<FootWear> footWearList = new ArrayList<FootWear>();
	
	public void fillFootWearList() {
        ReadDataFromFile readDataObj = new ReadDataFromFile();
        footWearList = readDataObj.readDataFromCsv();
    }
	
	public void printAllFootWearData() {
		System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %n", "Azonosító", "Gyártó", "Modell", "Nettó Ár", "Kategória", "Leárazás");
        for (FootWear foot : footWearList) {
            System.out.println(foot.toStringDivider());
        }
    }
	
	public void getLeastExpensiveSaleFootWear() {
		Double min = footWearList.get(0).getNetPrice();
		for (FootWear footWear : footWearList) {
			if (footWear.isSale() == true && (footWear.getNetPrice() < min)) {
				min = footWear.getNetPrice();
			}
		}
		for (FootWear footWear : footWearList) {
			if (footWear.isSale() == true && (footWear.getNetPrice() == min)) {
				System.out.println(footWear.toStringDivider());
			}
		}
	}

}
