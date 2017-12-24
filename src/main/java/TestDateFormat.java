import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

import java.util.Iterator;


public class TestDateFormat {

    static String buffStr;


    static void testDateFormat(String pathToFile) {


        try {
            File myFile = new File(pathToFile);
            FileInputStream fis = new FileInputStream(myFile);

            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(MainRep.sheetNumber);

            Iterator<Row> rowIterator = mySheet.iterator(); //cursor

            rowIterator.next();
            rowIterator.next();
            rowIterator.next();
            rowIterator.next(); //row in sheet will start not from header, but from 5-th row


            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();


                while (cellIterator.hasNext()) {

                    Cell cell = cellIterator.next();

                    if (cell.getColumnIndex() == 13) {
                        //working only if date format is: Tue Jun 14 14:34:34 MSK 2016
                        buffStr += cell.getDateCellValue() + ";";
                    }
                }
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        String[] buffArr = buffStr.split(";");


        for (int i = 0; i < buffArr.length; i++) {

            System.out.println(buffArr[i]);

        }

    } //end of method

} //end of class
