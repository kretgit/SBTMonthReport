public class MainRep {


    static String pathToXLSFile =
//            "//Users//mackret//Downloads/12_Выполнено.xlsx";
          "C://Users//SBT-Kretov-AA//Downloads/01_Выполнено.xlsx";

    static String[] weekEndDays = {"01","02","03","04","05","06","07","08","13","14","20","21","27","28"}; //january

    static int sheetNumber = 0;



    public static void main(String[]args) {


//        TestDateFormat.testDateFormat(pathToXLSFile);

        FromXLSXToArr.gotFromExcel(pathToXLSFile, weekEndDays);

        MethodArrayParsing.arrayParsing(FromXLSXToArr.arrWorkDay,FromXLSXToArr.arrWeekEnd);
        FromArrToTxt.fileWriter(MethodArrayParsing.requestsAndResponsible);



    }

}




