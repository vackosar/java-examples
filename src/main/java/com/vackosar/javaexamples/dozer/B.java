package com.vackosar.javaexamples.dozer;

public class B {
    private String name;
    private Long account;

    public B() {
    }

    public B(String name, Long account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Long getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Long account) {
        this.account = account;
    }
}
