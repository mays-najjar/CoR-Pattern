import java.util.ArrayList;

public class KickStartHandler extends EmailHandler { // job emails

    public KickStartHandler() {
        keywords = new ArrayList<>();
        keywords.add("CV");
        keywords.add("graduated");
        keywords.add("self-learner");
        keywords.add("job");
        keywords.add("team work");
    }

    @Override
    public void handleRequest(EmailRM emailrm) {
        if (isMatch(emailrm)) {
            System.out.println("Send email to recruitment Officer \n"); 
        } else {
            super.handleRequest(emailrm);
        }
    }

}