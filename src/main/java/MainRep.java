public class MainRep {


    static String pathToXLSFile = System.getProperty("user.home") + "//Downloads/" + "04_выполнено.xlsx";
            //"//Users//mackret//Downloads/12_Выполнено.xlsx"; // for mac
          //"C://Users//SBT-Kretov-AA//Downloads/04_выполнено.xlsx"; //for win

    static String[] weekEndDays = {"01","07","08","14","15","21","22","29","30"}; //apr



    static int sheetNumber = 0; //sheet num in xlxs

    public static void main(String[]args) {

//
        TestDateFormat.testDateFormat(pathToXLSFile); //should be like: "Sat Dec 30 10:56:28 MSK 2017"

//        FromXLSXToArr.gotFromExcel(pathToXLSFile, weekEndDays);
//        MethodArrayParsing.arrayParsing(FromXLSXToArr.arrWorkDay,FromXLSXToArr.arrWeekEnd);
//        FromArrToTxt.fileWriter(MethodArrayParsing.requestsAndResponsible);
//        WeekEndAlarmCount.countWeekEndAlarm();


    }

}



/*дальнейшее развитие:

0. чтоб свои же заявки (организация = ОПП) не читались. Сейчас обрабатываем вручную;
1. интервал между разными выходными при выводе алярма;
2. перераспределение заявок, если на выходном у какого-то специалиста не хватает, а у другого их много;
3. автоматическая отправка в приложенный целевой xlsx
4. интерфейс

 */
