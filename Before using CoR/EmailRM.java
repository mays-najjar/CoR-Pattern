/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoR;

/**
 *
 * @author Raja' Mohammad
 */
public class EmailRM {
    private String subject;
    private String body;

    public EmailRM(String subject, String bode) {
        this.subject = subject;
        this.body = bode;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
    
}
