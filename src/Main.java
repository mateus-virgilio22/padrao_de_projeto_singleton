public class Main {
    public static void main(String[] args) {
        // Obtemos a instância única da conexão com o banco de dados
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        // As duas referências apontam para a mesma instância
        System.out.println("connection1 == connection2: " + (connection1 == connection2));

        // Podemos usar a conexão
        connection1.executeQuery("SELECT * FROM tabela1");
        connection2.executeQuery("INSERT INTO tabela2 VALUES (1, 'exemplo')");

        // Não esqueça de fechar a conexão quando terminar
        connection1.closeConnection();
    }
}
