public class RMCompany {

    private EmailHandler spamHandler = new SpamHandler();
    private EmailHandler kickStartHandler = new KickStartHandler();
    private EmailHandler invetationHandler = new InvetationsHandler();
    private EmailHandler supportHandler = new SupportHandler();
    private EmailHandler generalHandler = new GeneralHandler();

    public RMCompany() {

        spamHandler.setNext(kickStartHandler); // All emails must be fillterd by spamHandler
        kickStartHandler.setNext(invetationHandler);
        invetationHandler.setNext(supportHandler);
        supportHandler.setNext(generalHandler);

    }

    public void handel(EmailRM rm) {
        spamHandler.handleRequest(rm);
    }
}
