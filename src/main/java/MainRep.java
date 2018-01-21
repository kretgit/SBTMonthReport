public class MainRep {


    static String pathToXLSFile =
            "//Users//mackret//Downloads/12_Выполнено.xlsx"; // for mac
//          "C://Users//SBT-Kretov-AA//Downloads/01_Выполнено.xlsx"; //for win

    static String[] weekEndDays = {"02","03","09","10","16","17","23","24","30","31"}; //dec



    static int sheetNumber = 0; //sheet num in xlxs

    public static void main(String[]args) {


//        TestDateFormat.testDateFormat(pathToXLSFile); //should be like: "Sat Dec 30 10:56:28 MSK 2017"

        FromXLSXToArr.gotFromExcel(pathToXLSFile, weekEndDays);
        MethodArrayParsing.arrayParsing(FromXLSXToArr.arrWorkDay,FromXLSXToArr.arrWeekEnd);
        FromArrToTxt.fileWriter(MethodArrayParsing.requestsAndResponsible);
        WeekEndAlarmCount.countWeekEndAlarm();


    }

}



/*дальнейшее развитие:

0. чтоб свои же заявки (организация = ОПП) не читались. Сейчас обрабатываем вручную;
1. интервал между разными выходными при выводе алярма;
2. перераспределение заявок, если на выходном у какого-то специалиста не хватает, а у другого их много;
3. автоматическая отправка в приложенный целевой xlsx
4. интерфейс

 */
