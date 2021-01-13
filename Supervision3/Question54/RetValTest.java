package Question54;

import java.util.NoSuchElementException;

public class RetValTest {
    public static String extractCamEmail(String sentence) {
        String sEmail = "";
        try {
            if (sentence == null || sentence.length() == 0)
                throw new Exception("Supplied string empty"); // Error - sentence empty
            String tokens[] = sentence.split(" "); // split into tokens
            for (int i = 0; i < tokens.length; i++) {
                if (tokens[i].endsWith("@cam.ac.uk")) {
                    sEmail = tokens[i];// success
                }
            }
            if (sEmail == "") {
                throw new NoSuchElementException("Error - no cam email found"); // Error - no cam email found
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sEmail;
    }

    public static void main(String[] args) {
        String res = RetValTest.extractCamEmail("My email is rkh23@cam.ac.uk");
        System.out.println(res);
        res = RetValTest.extractCamEmail("");
        System.out.println(res);
    }
}
