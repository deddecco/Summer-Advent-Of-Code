import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class SolutionDay1 {
     public int getNumberFromLine(String[] lines, int position) {
          String stringToParse = lines[position];

          StringBuilder num = new StringBuilder();
          for (int i = 0; i < stringToParse.length(); i++) {
               if (stringToParse.charAt(i) >= '0' && stringToParse.charAt(i) <= '9') {
                    num.append(stringToParse.charAt(i));
                    break;
               }
          }
          for (int i = stringToParse.length() - 1; i >= 0; i--) {
               if (stringToParse.charAt(i) >= '0' && stringToParse.charAt(i) <= '9') {
                    num.append(stringToParse.charAt(i));
                    break;
               }
          }

          return parseInt(num.toString());
     }

     public int getResult(String[] lines) {
          int result = 0;
          for (int i = 0; i < lines.length; i++) {
               result += getNumberFromLine(lines, i);
          }

          return result;
     }

     public String[] makeLines(String filePath) throws IOException {
          ArrayList<String> tempList = new ArrayList<>();

          BufferedReader reader = new BufferedReader(new FileReader(filePath));

          String line;
          while ((line = reader.readLine()) != null) {
               tempList.add(line);
          }
          String[] lines = new String[tempList.size()];
          for (int i = 0; i < tempList.size(); i++) {
               lines[i] = tempList.get(i);
          }
          return lines;
     }

     public static void main(String[] args) throws IOException {
          String filePath = "C:\\Users\\andre\\IdeaProjects\\Summer-Advent-Of-Code\\src\\main\\java\\day1file.txt";
          SolutionDay1 sd1 = new SolutionDay1();
          String[] lines = sd1.makeLines(filePath);
          int result = sd1.getResult(lines);
          System.out.println(result);
     }
}
