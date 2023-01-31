import java.util.ArrayList;

public class SupportHandler extends EmailHandler {
    public SupportHandler() {
        keywords = new ArrayList<>();
        keywords.add("Help");
        keywords.add("Issue");
        keywords.add("Problem");
    }

    @Override
    public void handleRequest(EmailRM emailrm) {
        if (isMatch(emailrm)) {
            System.out.println("Send email to support team\n");
        } else {
            super.handleRequest(emailrm);
        }
    }
}
