public class MySQLDatabase implements Database {
    @Override
    public void insert(String statement) {
        System.out.println("Inserting into MySQL: "+statement);
    }

    @Override
    public void select(String statement) {
        System.out.println("Selecting from MySQL: "+statement);
    }

    @Override
    public void update(String statement) {
        System.out.println("Updating MySQL: "+statement);
    }

    @Override
    public void delete(String statement) {
        System.out.println("Deleting from MySQL: "+statement);
    }
}
