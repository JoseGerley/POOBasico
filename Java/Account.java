public class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account(String name, String document) {
        this.name = name;
        this.document = document;
    }

    public void printAccountData(){
        System.out.println("Name: " + name);
        System.out.println("Document: " + document);
    }
}
