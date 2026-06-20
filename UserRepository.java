public class UserRepository {
    public void save(User user){
        System.out.println("Saving the user to database: " + user.getName());
    }

    //Other methods like read, update, delete can go here.
}

// This UserRepository class will only handle the databse related operation.