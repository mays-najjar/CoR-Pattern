import java.util.List;

public abstract class EmailHandler {
    public EmailHandler nextHandler;
    public List<String> keywords; // simple technique to AI sysytem

    public void setNext(EmailHandler handler) {
        nextHandler = handler;
    }

    public void handleRequest(EmailRM emailrm) {
        if (nextHandler != null) {
            nextHandler.handleRequest(emailrm);
        }
    }

    public boolean isMatch(EmailRM emailrm) { // to search about word that we will filtr the emails according
        for (String keyword : keywords) {
            if (emailrm.getSubject().contains(keyword) || emailrm.getBody().contains(keyword)) { // contains built in

                return true;
            }
        }
        return false;
    }

}
