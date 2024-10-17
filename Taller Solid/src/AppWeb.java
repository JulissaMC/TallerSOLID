public class AppWeb {
    private LogIn logIn;

    public AppWeb(LogIn logIn) {
        this.logIn = logIn;
    }

    public void authenticateUser(User user) {
        logIn.log(user);  // La autenticación y manejo de usuarios es responsabilidad de LogIn y UserRepository
    }

    public User getUserData(String nickname) {
        return logIn.getUser(nickname);  // La consulta de usuarios es responsabilidad de LogIn y UserRepository
    }
}



