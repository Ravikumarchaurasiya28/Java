class Account {
    public String name;
    protected String email;
    private String password;
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Ravi";
        a1.email = "ravi123@gmail.com";
        a1.setPassword("123");
        System.err.println(a1.getPassword());
    }
}