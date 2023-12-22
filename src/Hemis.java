import java.io.*;

public class Hemis {
    public static void main(String[] args) {
        try {
            // Specify the path to your input text file
            String inputFilePath = "/Users/akbarhasanov/IdeaProjects/LeetCode/test.txt";

            // Specify the path to the output text file
            String outputFilePath = "/Users/akbarhasanov/IdeaProjects/LeetCode/output.txt";

            // Process the questions and answers and save to a new file
            processQuestionsAndAnswers(inputFilePath, outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processQuestionsAndAnswers(String inputFilePath, String outputFilePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;
            boolean isQuestion = false;
            int counter = 1;

            while ((line = br.readLine()) != null) {
                // Process each line
                if (line.trim().equals("++++")) {
                    // Toggle between questions and answers
                    isQuestion = !isQuestion;
                } else if (isQuestion && !line.trim().equals("")) {
                    // This is a question
                    bw.write(counter +". " + line.trim());
//                    bw.write("\"" + line.trim() + "\" : ");
                    bw.newLine();
                    counter++;
                    isQuestion = false;
                } else if (line.trim().startsWith("#")) {
                    // This is a correct answer
                    bw.write(line.trim());
//                    bw.write("\"" + line.trim().substring(1) + "\",");
                    bw.newLine();
                    bw.newLine();
                }
            }
        }
    }

}


