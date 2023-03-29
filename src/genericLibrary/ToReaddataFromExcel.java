package genericLibrary;

public class ToReaddataFromExcel {

	public static void main(String[] args) {
		String exceldata = ReadData.fromExcel("Sheet1", 5, 2);
		System.out.println(exceldata);
		String property = ReadData.fromPropertyFile("Url");
		System.out.println(property);
	}

}
