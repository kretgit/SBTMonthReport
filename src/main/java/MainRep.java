public class MainRep {


    static String pathToXLSFile =
//            "//Users//mackret//Downloads/13_выполнено.xlsx";
          "C://Users//SBT-Kretov-AA//Downloads/11_Выполнено.xlsx";

    static String[] weekEndDays = {"04","05","11","12","18","19","25","26"};

    static int sheetNumber = 0;



    public static void main(String[]args) {


//        TestDateFormat.testDateFormat(pathToXLSFile);

        FromXLSXToArr.gotFromExcel(pathToXLSFile, weekEndDays);

        MethodArrayParsing.arrayParsing(FromXLSXToArr.arrWorkDay,FromXLSXToArr.arrWeekEnd);
        FromArrToTxt.fileWriter(MethodArrayParsing.requestsAndResponsible);



    }

}




