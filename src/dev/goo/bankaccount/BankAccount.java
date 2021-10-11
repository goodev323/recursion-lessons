package dev.goo.bankaccount;

public class BankAccount {
    private String bankName;
    private String ownerName;
    private int saving;
    private double interestPerDay = 0.010001;

    public BankAccount(String bankName, String ownerName, int saving, double interestPerDay) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.saving = saving;
        this.interestPerDay = interestPerDay;
    }

    public String showInfo() {

        String bankNameStr = "bank: " + this.bankName;
        String ownerNameStr = "owner name: " + this.ownerName;
        String bankAccountStr = "bank account number: " + getRandomInteger();
        return  bankNameStr + " " + ownerNameStr + " " + bankAccountStr;
    }

    public int depositMoney(int depositAmount) {
        int commission = this.saving < 20000 ? 100 : 0;
        this.saving += (depositAmount - commission);
        return this.saving;
    }

    public int withdrawMoney(int withdrawAmount) {
        withdrawAmount = Math.min((int) Math.round(this.saving * 0.2), withdrawAmount);
        this.saving -= withdrawAmount;
        return withdrawAmount;
    }

    public double pasttime(int day) {
        return (double) Math.round(this.saving * Math.pow((1 + this.interestPerDay),
                day) * 10000000) / 10000000;
    }

    private String getRandomInteger() {
        return String.valueOf(Math.random() * (100000000 - 1) + 1);
    }
}
