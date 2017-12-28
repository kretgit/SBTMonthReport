import java.io.FileWriter;

public class FromArrToTxt {





    static void fileWriter(String str) {

        String pathToTXTFile = MainRep.pathToXLSFile.replaceFirst(".xlsx",".txt");

        try {

            FileWriter fw = new FileWriter(pathToTXTFile);
          //  for (int i:str[]) {fw.write(str[i]);}
            fw.write(str);
            fw.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Get your file at: " + pathToTXTFile);

    }



}
