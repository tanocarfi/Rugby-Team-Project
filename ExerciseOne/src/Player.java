public class Player extends Person {
    private String role;
    private int number;

    public Player(String name, String surname, String address, String fiscalCode, String role, int number) {
        super(name, surname, address, fiscalCode);
        this.role = role;
        this.number = number;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Name = " + getName() +
                "\nSurname = " + getAddress() +
                "\nAddress = " + getAddress() +
                "\nFiscal code = " + getFiscalCode() +
                "\nRole = " + role +
                "\nNumber of shirt = " + number;

    }
}
