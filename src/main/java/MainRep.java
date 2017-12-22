import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

import java.util.Iterator;



    public class MainRep {


        static int totalRowCount = 0;
        static String buffStr;

        public static void main (String[]args) {


            try {
                //File myFile = new File("C://Users//SBT-Kretov-AA//Downloads/11_выполнено.xlsx");
                File myFile = new File("//Users//mackret//Downloads/13_выполнено.xlsx");
                FileInputStream fis = new FileInputStream(myFile);

                XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
                XSSFSheet mySheet = myWorkBook.getSheetAt(0);

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


                       if (cell.getColumnIndex() ==0) {
                           //System.out.print(cell.getStringCellValue() + "\t");
                           buffStr +=cell.getStringCellValue() + ";";
                       }

                       else if (cell.getColumnIndex() ==5) {
                           //System.out.print(cell.getStringCellValue() + "\t");
                            buffStr +=cell.getStringCellValue()  + ";";
                           }

                       else if (cell.getColumnIndex() ==1) {
                           //System.out.print(cell.getDateCellValue() + "\t");
                           buffStr += cell.getDateCellValue()  + ";";
                       }


                        totalRowCount = cell.getRowIndex();
                    }
                    //System.out.println("");

                }

            } catch (Exception ex) {
                System.out.print(ex.getMessage());
            }

            System.out.println("total row count: " + totalRowCount + " bufArr.len = " + buffStr.length());

            for (int i = 0; i < buffStr.length(); i++) {
                System.out.print(buffStr.charAt(i));
            }


        }



    }




