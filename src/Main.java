public class Main {
    public static void main(String[] args) {

        Bank bobsAccount = new Bank(42069, 1000.00, "Bob Brown", "bobbrown14@bob.com",
                "+63 445 678 9123");
        Bank defaultAccount = new Bank();
        System.out.println(bobsAccount.getBalance());
        System.out.println(defaultAccount.getBalance());

        Bank timAccount = new Bank("Tim", "tim@email.com", "659089");
        System.out.println(timAccount.getPhoneNumber() + " name " + timAccount.getCustomerName());

        VipCustomer npc1 = new VipCustomer();
        System.out.println(npc1.getName());

        VipCustomer npc2 = new VipCustomer("Bob", 20000.00);
        System.out.println(npc2.getName());

        VipCustomer npc3 = new VipCustomer("Tim", 50000.00, "tim@bossemail.com");
        System.out.println(npc3.getName());
    }
}
