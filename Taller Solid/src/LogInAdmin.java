public class LogInAdmin extends LogIn {
    private RoleChecker roleChecker;

    public LogInAdmin(RoleChecker roleChecker, Database database) {
        super(database);
        this.roleChecker = roleChecker;
    }

    @Override
    public void log(User user) {
        super.log(user);  // Mantiene el comportamiento de LogIn

        // Usamos RoleChecker para manejar la lógica del rol de administrador
        if (roleChecker.verifyIfTheUserIsAdmin(user)) {
            System.out.println("Has access to the website in admin mode");
        } else {
            System.out.println("Access denied: Not an admin");
        }
    }
}
