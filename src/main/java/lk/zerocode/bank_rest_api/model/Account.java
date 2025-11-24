package lk.zerocode.bank_rest_api.model;

public class Account {

    private Long id;
    private String name;
    private Double balance;

    public Account(String name, Double balance, Long id) {
        this.name = name;
        this.balance = balance;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}
