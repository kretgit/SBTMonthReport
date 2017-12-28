import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

import java.util.Iterator;


public class FromXLSXToArr {


    static int totalRowCount = 0;
    static String buffStr;

    static String[] buffArrWorkDay;
    static String[] buffArrWeekEnd;


    static void gotFromExcel(String pathToFile, String[] weekEndArr) {


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

            String buffStrDate;

            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();


                while (cellIterator.hasNext()) {

                    Cell cell = cellIterator.next();


                    if (cell.getColumnIndex() == 0) {
                        //System.out.print(cell.getStringCellValue() + "\t");
                        buffStr += cell.getStringCellValue() + ":";
                    } else if (cell.getColumnIndex() == 4) {
                        //System.out.print(cell.getStringCellValue() + "\t");
                        buffStr += cell.getStringCellValue() + "_";
                    } else if (cell.getColumnIndex() == 13) {
                        //System.out.print(cell.getDateCellValue() + "\t");

                        //working only if date format is: Tue Jun 14 14:34:34 MSK 2016
                        buffStrDate = cell.getDateCellValue() + "";
                        buffStrDate = buffStrDate.substring(8, 10);
                        buffStr += buffStrDate + "MM;";
                    }


                    totalRowCount = cell.getRowIndex();
                }

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("total row count: " + totalRowCount/* + " bufArr.len = " + buffStr.length()*/);


        //string into array. Array devides for weekends and working days
        String[] buffArr = buffStr.split(";");
        buffArrWorkDay = new String[buffArr.length];
        buffArrWeekEnd = new String[buffArr.length];

        for (int i = 0; i < buffArr.length; i++) {

            for (int j = 0; j < weekEndArr.length; j++) {

                if (buffArr[i].contains(weekEndArr[j] + "MM")) {
                    buffArrWeekEnd[i] = buffArr[i];
                    buffArr[i] = "";
                }
            }

            buffArrWorkDay[i] = buffArr[i];

            System.out.println(buffArrWeekEnd[i]);
            //System.out.println(buffArrWorkDay[i]);
        }


    } //end of method

} //end of class




