public class Person {
    protected String name;
    protected String surname;
    protected int amountTickets;

    public Person(String name, String surname, int amountTickets) {
        this.name = name;
        this.surname = surname;
        this.amountTickets = amountTickets;
    }

    @Override
    public String toString() {
        return "Имя посетителя - " + name + " " + surname + ", количество билетов - " + amountTickets;
    }
}
