import java.util.ArrayList;
import java.util.List;

public class SamsaraPreScreen {

    public static void main(String[] args) {
        SamsaraPreScreen samsara = new SamsaraPreScreen();
        String[][] chat = {
                {"1", "Hello how r u"},
                {"2", "good ty"},
                {"2", "u"},
                {"1", "me too bro"}

        };
        int width = 15, userWidth = 5;
        String[] solution = samsara.solution(chat, width, userWidth);
        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }
    }

    private String[] solution(String[][] messages, int width, int userWidth) {
        //
        List<String> result = new ArrayList<>();
        String firstLine = "+" +
                "*".repeat(Math.max(0, width)) +
                "+";
        String lastLine = firstLine;
        result.add(firstLine);
        StringBuilder userMsg1 = new StringBuilder();
        StringBuilder userMsg2 = new StringBuilder();
        for (String[] message : messages) {
            List<String> words = new ArrayList<>();
            for (int i = 0; i < message[1].length();) {
                if((i+ userWidth)<message[1].length()){
                    if (message[1].charAt(i+userWidth) == ' '){
                        words.add(message[1].substring(i, i + userWidth));
                        i+=userWidth;
                        i++;
                    }
                    else {
                        String trim = message[1].substring(i).trim();
                        words.add(trim.substring(0, trim.indexOf(' ')));
                        i+=trim.indexOf(' ')+1;
                    }
                }
                else {
                    words.add(message[1].substring(i).trim());
                    break;

                }
            }
            if (message[0].equals("1")) {
                for (String word : words) {
                    userMsg1.append("|");
                    userMsg1.append(word).append(" ".repeat(width - word.length()));
                    userMsg1.append("|");
                    result.add(userMsg1.toString());
                    userMsg1 = new StringBuilder();
                }
            } else {
                for (String word : words) {
                        userMsg2.append("|");
                        userMsg2.append(" ".repeat(width - word.length())).append(word);
                    userMsg2.append("|");
                    result.add(userMsg2.toString());
                    userMsg2 = new StringBuilder();
                }

            }
        }
        result.add(lastLine);
        return result.toArray(String[]::new);
    }
}
