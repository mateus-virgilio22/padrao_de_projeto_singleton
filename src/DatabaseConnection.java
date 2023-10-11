public class DatabaseConnection {
    // Instância única da conexão com o banco de dados
    private static DatabaseConnection instance;

    // Construtor privado para impedir a criação de instâncias diretas
    private DatabaseConnection() {
        // Simule a inicialização da conexão com o banco de dados
        System.out.println("Conexão com o banco de dados criada.");
    }

    // Método estático para obter a instância única
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Outros métodos para interagir com o banco de dados
    public void executeQuery(String query) {
        System.out.println("Executando a query: " + query);
    }

    public void closeConnection() {
        System.out.println("Conexão com o banco de dados fechada.");
    }
}
