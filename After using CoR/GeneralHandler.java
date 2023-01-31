import java.util.ArrayList;

public class GeneralHandler extends EmailHandler {
    public GeneralHandler() {
        keywords = new ArrayList<>();

    }

    @Override
    public void handleRequest(EmailRM emailrm) {
        System.out.println("Send email to container. These emails will handeled manual \n"); 
    }
}
