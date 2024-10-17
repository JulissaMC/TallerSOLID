public class UserRepository {
    private Database database;  
    public UserRepository(Database database) {
        this.database = database;
    }

    public void insertUser(User user) {
        String query = "INSERT INTO users (nickname, password) VALUES ('" 
            + user.getNickname() + "', '" + user.getPassword() + "')";
        database.insert(query);
    }

    public User getUser(String nickname) {
        String query = "SELECT * FROM users WHERE nickname = '" + nickname + "'";
        database.select(query);
        // Lógica para devolver el usuario después de la consulta
        return new User(nickname, "passwordFromDatabase");
    }

}

