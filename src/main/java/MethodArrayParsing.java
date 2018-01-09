import java.util.Arrays;

public class MethodArrayParsing {





//    static String[]buffArrWorkDay = {"ЗНО11463573:Клепиков А.В._08MM","IM32549893:Клепиков А.В._08MM","ЗНО11501918:Мокриюк В.В._08MM","ЗНО11523861:Мокриюк В.В._08MM","IM32720700:Мокриюк В.В._08MM","IM32721747:Харчук Е.С._08MM","IM32699599:Язвинский М.А._08MM","IM32743778:Язвинский М.А._08MM","IM32748351:Мокриюк В.В._08MM","ЗНО11449380:Хусаинов Ф.Ш._08MM","IM32710714:Хусаинов Ф.Ш._08MM","IM32709810:Жиленко П.В._08MM","IM32713585:Мокриюк В.В._08MM","IM32714629:Мокриюк В.В._08MM","IM32722148:Мокриюк В.В._08MM","ЗНО11535494:Клепиков А.В._09MM","IM32739740:Борисова Т.В._09MM","ЗНО11391799:Пузырин П.В._09MM","ЗНО11462537:Пузырин П.В._09MM","ЗНО11407704:Борисова Т.В._09MM","IM32725330:Пашкова Л.С._09MM","ЗНО11513288:Пашкова Л.С._09MM","IM32738665:Жиленко П.В._09MM","IM32378116:Пузырин П.В._09MM","IM32765409:Борисова Т.В._09MM","IM32708656:Хусаинов Ф.Ш._09MM","IM32685363:Кескин Р.И._09MM","IM32720858:Хусаинов Ф.Ш._09MM","IM32763915:Жиленко П.В._09MM","IM32721577:Пашкова Л.С._09MM","IM32666819:Кескин Р.И._09MM","ЗНО11523185:Кескин Р.И._09MM","ЗНО10075345:Жиленко П.В._09MM","IM32703128:Кескин Р.И._09MM","IM32714016:Ветошкин А.М._09MM","IM32767037:Хусаинов Ф.Ш._09MM","ЗНО10411277:Жиленко П.В._09MM","IM32713532:Хусаинов Ф.Ш._09MM"};
//    static String[]buffArrWeekEnd = {"IM32362032:Новиков А.М._03MM","IM32375263:Бондарева Е.Д._03MM","ЗНО11310770:Новиков А.М._03MM","ЗНО11316786:Клепиков А.В._03MM","ЗНО11356676:Клепиков А.В._03MM","IM32373518:Пашкова Л.С._03MM","IM32377709:Борисова Т.В._03MM","ЗНО11076755:Клепиков А.В._03MM","ЗНО11376127:Пашкова Л.С._03MM","ЗНО11302515:Пузырин П.В._03MM","IM32419208:Пашкова Л.С._03MM","ЗНО11155360:Борисова Т.В._03MM","ЗНО11033861:Жиленко П.В._03MM","IM32421308:Пашкова Л.С._03MM","IM32386689:Ветошкин А.М._03MM","ЗНО11180699:Мамонова Е.А._03MM","IM32406073:Борисова Т.В._03MM","ЗНО10767557:Пузырин П.В._03MM","ЗНО11330507:Клепиков А.В._05MM","ЗНО11374285:Клепиков А.В._05MM","IM32435301:Клепиков А.В._05MM","IM32391397:Клепиков А.В._05MM","IM32447407:Клепиков А.В._05MM","ЗНО11010294:Клепиков А.В._05MM","IM32514325:Захариков В.В._05MM","IM32428589:Клепиков А.В._05MM","ЗНО11381631:Клепиков А.В._05MM","ЗНО11312898:Клепиков А.В._05MM","ЗНО11357816:Клепиков А.В._05MM","ЗНО10905406:Клепиков А.В._05MM","IM32466581:Новиков А.М._05MM"};
    static String requestsAndResponsible = "";

//    public static void main (String[]xxx) {
      public static void arrayParsing (String[]buffArrWorkDay, String[]buffArrWeekEnd) {

        System.out.println("start parsing array with requests");

        int regexDateCount = 0;
        int regexReqCount = 0;


        //String[]arrWorkDay = new String[buffArrWorkDay.length];
        String responsible = "";

//подготавливаем список ответственных делавших заявки, делает из него массив, сортирует по алфавиту:
    try {
        for (int i = 0; i < buffArrWorkDay.length; i++) {
            regexDateCount = buffArrWorkDay[i].indexOf("_");
            buffArrWorkDay[i] = buffArrWorkDay[i].substring(0, regexDateCount); //without "_03MM"

            //buffArrWorkDay[i] = buffArrWorkDay[i].substring(regexReqCount+1); //Клепиков А.В.
            //buffArrWorkDay[i] = buffArrWorkDay[i].substring(0,regexReqCount); //ЗНО11463573
            regexReqCount = buffArrWorkDay[i].indexOf(":");
            if (responsible.contains(buffArrWorkDay[i].substring(regexReqCount + 1))) {
                continue;
            } else {
                responsible += buffArrWorkDay[i].substring(regexReqCount + 1) + ";";
            }

        }
    } catch (Exception ex) {
        System.out.println("there are no working days in file");
    }
//то же самое только для массива с выходными работниками, дата не обрезается:
        for (int i = 0; i < buffArrWeekEnd.length; i++) {

                regexReqCount = buffArrWeekEnd[i].indexOf(":");
                        if (responsible.contains(buffArrWeekEnd[i].substring(regexReqCount + 1)) ) {
                            continue;
                        } else {
                            responsible += buffArrWeekEnd[i].substring(regexReqCount + 1) + ";";
                        }

        }
                    //System.out.println(responsible);
                    String[]responsibleArr = responsible.split(";");
                    Arrays.sort(responsibleArr);


//проходимся по листу-списку и добавляем к нему заявки:
        for (int i = 0; i < responsibleArr.length; i++) {

            requestsAndResponsible += responsibleArr[i] + "\n";

     //заявки рабочих дней
            for (int j = 0; j < buffArrWorkDay.length; j++) {

               if (buffArrWorkDay[j].contains(responsibleArr[i]) ) {
                   requestsAndResponsible += buffArrWorkDay[j].substring(0,buffArrWorkDay[j].indexOf(":")) + "\n";
               }
            }

     //заявки выходных дней
            for (int j = 0; j < buffArrWeekEnd.length; j++) {

                if (buffArrWeekEnd[j].contains(responsibleArr[i]) && responsibleArr[i].contains("MM")) {
                    requestsAndResponsible += buffArrWeekEnd[j].substring(0,buffArrWeekEnd[j].indexOf(":")) + "\n";
                }
            }

            requestsAndResponsible +="\n";
        }


//System.out.println(requestsAndResponsible);
System.out.println("parsing complete");



    } //end of method

} //end of class
