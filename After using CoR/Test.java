public class Test {

    public static void main(String[] args) {

        System.out.print("Chain of Responsibility Pattern \nProject participant Mays Najjar & Raja' Asad \n");
        RMCompany rm = new RMCompany();

        EmailRM emailrm1 = new EmailRM("ad for the blackFriday", "first email");
        rm.handel(emailrm1);
        
        EmailRM emailrm3 = new EmailRM("Help", "We need a help from you");
        rm.handel(emailrm3);

        EmailRM emailrm4 = new EmailRM("Hey", "Hope enjoy in your day");
        rm.handel(emailrm4);

        EmailRM emailrm5 = new EmailRM("Invetation", "We are Harri company invitess you to our event, location Ramallah");
        rm.handel(emailrm5);

    }

}
