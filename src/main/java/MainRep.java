public class MainRep {


    static String pathToXLSFile =
            "//Users//mackret//Downloads/12_Выполнено.xlsx";
//          "C://Users//SBT-Kretov-AA//Downloads/11_Выполнено.xlsx";

    static String[] weekEndDays = {"02","03","09","10","16","17","23","24","30","31"}; //december

    static int sheetNumber = 0;



    public static void main(String[]args) {


//        TestDateFormat.testDateFormat(pathToXLSFile);

        FromXLSXToArr.gotFromExcel(pathToXLSFile, weekEndDays);

        MethodArrayParsing.arrayParsing(FromXLSXToArr.arrWorkDay,FromXLSXToArr.arrWeekEnd);
        FromArrToTxt.fileWriter(MethodArrayParsing.requestsAndResponsible);



    }

}




