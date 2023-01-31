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
public class RMCompany {
    EmailRM email;


    public void handelRequest(EmailRM x){
        this.email=x;
        
        if (email.getSubject().contains("ad")||email.getBody().contains("ad")|| email.getSubject().contains("sales")||email.getBody().contains("sales")) { // contains built in
                System.out.print("emails needs to be deleted");  //spam Emails
                
        }else if (email.getSubject().contains("CV")||email.getBody().contains("CV")|| email.getSubject().contains("job")||email.getBody().contains("job")) { // contains built in
                System.out.print("Send email to recruitment Officer");  //kickstart Emails
                
        }else if (email.getSubject().contains("invite")||email.getBody().contains("invite")|| email.getSubject().contains("welcome")||email.getBody().contains("welcome")) { // contains built in
               System.out.print("Send email to manager team");//invetiation Emails
               
        }else if (email.getSubject().contains("help")||email.getBody().contains("help")|| email.getSubject().contains("issues")||email.getBody().contains("isses")) { // contains built in
               System.out.print("Send email to support team");
               
        }else{ 
            throw new NullPointerException("WE canont handel the request"); }
    
}
    public static void main(String []args){
        EmailRM emailx=new EmailRM("ad","this is an ad");// creat eamil
        
        RMCompany rmcomany= new RMCompany();
        rmcomany.handelRequest(emailx);
    }
}