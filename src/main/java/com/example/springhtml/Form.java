package com.example.springhtml;

public class Form {
    private String fio;
    private String email;
    private String phone;
    private String q1;
    private String q2;
    private String q3;

    public Form(String fio, String email, String phone, String q1, String q2, String q3) {
        this.fio = fio;
        this.email = email;
        this.phone = phone;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
    }

    public Form() {
        this.fio = "";
        this.email = "";
        this.phone = "";
        this.q1 = "";
        this.q2 = "";
        this.q3 = "";
    }

    @Override
    public String toString() {
        return "Form{" +
                "fio='" + fio + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", q1='" + q1 + '\'' +
                ", q2='" + q2 + '\'' +
                ", q3='" + q3 + '\'' +
                '}';
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }
}
