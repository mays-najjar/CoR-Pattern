import java.util.ArrayList;

public class InvetationsHandler extends EmailHandler {
    public InvetationsHandler() {
        keywords = new ArrayList<>();
        keywords.add("invite");
        keywords.add("welcome");
    }

    @Override
    public void handleRequest(EmailRM emailrm) {
        if (isMatch(emailrm)) {
            System.out.println("Send email to manager team \n"); 
        } else {
            super.handleRequest(emailrm);
        }
    }

}
