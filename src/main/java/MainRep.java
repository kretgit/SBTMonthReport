public class MainRep {



static String pathToXLSFile = "//Users//mackret//Downloads/13_выполнено.xlsx";
    //      "C://Users//SBT-Kretov-AA//Downloads/11_выполнено.xlsx"

static String[]weekEndDays = {"08","10","11"};

        public static void main (String[]args) {


//TestDateFormat.testDateFormat(pathToXLSFile);

FromXLSXToArr.gotFromExcel(pathToXLSFile, weekEndDays);


//выходные в июне: 3,4,10,11,17,18,24,25



        }

    }




