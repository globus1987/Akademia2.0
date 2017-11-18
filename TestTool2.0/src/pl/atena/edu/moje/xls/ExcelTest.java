package pl.atena.edu.moje.xls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.rowset.internal.Row;

public class ExcelTest {

	public static void main(final String[] args)
			throws FileNotFoundException, IOException, EncryptedDocumentException, InvalidFormatException {
		FileInputStream nowyplik = new FileInputStream("D:/Akademia JAVA/TST.xls");
		Workbook wb = WorkbookFactory.create(new File("D:/Akademia JAVA/TST.xls"));
		System.out.println(wb);

		int SheetNumber;
		int RowNumber;
		int ColumnNumber;
		Sheet sheet = wb.getSheetAt(3);
		for (int k = 0; k <= sheet.getLastRowNum(); k++) {
			Row row = (Row) sheet.getRow(k);
			for (int i = 0; i <= ((org.apache.poi.ss.usermodel.Row) row).getLastCellNum(); i++) {
				if (((org.apache.poi.ss.usermodel.Row) row).getCell(i) != null) {
					if (((org.apache.poi.ss.usermodel.Row) row).getCell(i).getCellType()==0 && DateUtil.isCellDateFormatted(((org.apache.poi.ss.usermodel.Row) row).getCell(i))){
						System.out.println("to jest format daty "+((org.apache.poi.ss.usermodel.Row) row).getCell(i)+" "+((org.apache.poi.ss.usermodel.Row) row).getCell(i).getDateCellValue());
						CreationHelper createhelper = wb.getCreationHelper();
						CellStyle cellStyle = ((org.apache.poi.ss.usermodel.Row) row).getCell(i).getCellStyle();
						cellStyle.setDataFormat(createhelper.createDataFormat().getFormat("yyyy-MM-dd"));
						((org.apache.poi.ss.usermodel.Row) row).getCell(i).setCellStyle(cellStyle);
						System.out.println("to jest format daty "+((org.apache.poi.ss.usermodel.Row) row).getCell(i)+" "+((org.apache.poi.ss.usermodel.Row) row).getCell(i).getDateCellValue());

					}
				}

			}
		}

	}

}
