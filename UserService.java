public class UserService {
    private UserRepository userRepository = new UserRepository();
    private EmailService emailService = new EmailService();
    private LoggerService logger = new LoggerService();

    public void registerUser(String name, String email, String password) {
        String hashedPassword = Integer.toHexString(password.hashCode());
        User user = new User(name, email, hashedPassword);

        userRepository.save(user);
        emailService.sendEmail(email);
        logger.log("User registered: " + email);
    }
}

// This UserService class will handle the orchestration of all the logic.