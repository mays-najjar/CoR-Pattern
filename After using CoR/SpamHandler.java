import java.util.ArrayList;

public class SpamHandler extends EmailHandler {
    public SpamHandler() {
        keywords = new ArrayList<>();
        keywords.add("ad"); 
        keywords.add("price");
        keywords.add("sales");
        keywords.add("investment");
    }
    @Override
    public void handleRequest(EmailRM emailrm) {
        if (isMatch(emailrm)) {
            System.out.println("Email needs to be deleted \n");
                } else {
            super.handleRequest(emailrm);
        }
    }

}
