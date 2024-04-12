public class Customer {
    public String name;
    public Long creditLimit;
    public String email;


    static String nationality;


    Customer(String name, Long creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    Customer() {
        this(
                "customer name",
                1000L,
                "email@mail.com"
        );
    }

    Customer(String name, String email) {
        this(
                name,
                500L,
                email
        );
    }

    public String getName() {
        return name;
    }

    public Long getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        Customer.nationality = nationality;
    }

//    public String toString() {
//        return "hello, this is overriden toString method!";
//    }
}
