import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person client = queue.poll();
            if (client.amountTickets - 1 != 0) {
                queue.offer(client);
            }
            client.amountTickets = client.amountTickets - 1;
            System.out.println("На аттракционе прокатился " + client.toString());
        }
    }

    public static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Иван", "Фёдоров", 5));
        clients.add(new Person("Евгений", "Васильев", 1));
        clients.add(new Person("Михаил", "Соловьёв", 2));
        clients.add(new Person("Роман", "Агапов", 8));
        clients.add(new Person("Иннокентий", "Иванов", 4));
        return clients;
    }
}
