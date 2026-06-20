public class EmailService {
    public void sendEmail(String email){
        System.out.println("Sending welcome email: " + email);
    }
}

// EmailService is used to send the emails, no knowledge of the user object or the business logic.