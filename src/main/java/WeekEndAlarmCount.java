import java.util.Arrays;

public class WeekEndAlarmCount {


    static String strCountForWeekEndAlarm = "";

    public static void countWeekEndAlarm () {

        String[]arrWeekEndAlarm = strCountForWeekEndAlarm.split("\n");
        int count = 0;
        String strCount = "";

        int indexLowSpace = 0;


//цикл для подсчета дублей - группировка
       for (int i = 0; i < arrWeekEndAlarm.length; i++) {

           if ( strCount.contains(arrWeekEndAlarm[i]) ) {
               continue;
           } else {


           for (int j = 0; j < arrWeekEndAlarm.length; j++) {

                if (arrWeekEndAlarm[j].equals(arrWeekEndAlarm[i])) {
                    count++;
                }

            }

            //System.out.println(arrWeekEndAlarm[i]);
               indexLowSpace = arrWeekEndAlarm[i].indexOf("_") + 1;
               arrWeekEndAlarm[i] = arrWeekEndAlarm[i].substring(indexLowSpace,arrWeekEndAlarm[i].length()-2) + " " + count + "шт. " + arrWeekEndAlarm[i];

               strCount += arrWeekEndAlarm[i] + "\n";
               count = 0;
           }
        }

        //System.out.println("\n" + strCount);
        System.out.println("\n");
//для сортировка массива данные из стринга снова перегоняем в массив
        String[]arrFinalWeekEndAlarm = strCount.split("\n");
        Arrays.sort(arrFinalWeekEndAlarm);

    for (int i = 0; i < arrFinalWeekEndAlarm.length; i++) {
        System.out.println(arrFinalWeekEndAlarm[i]);
    }


    }

}
