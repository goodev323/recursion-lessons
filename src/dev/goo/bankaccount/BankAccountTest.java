package dev.goo.bankaccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

    @Test
    void test1() {
        BankAccount user1 = new BankAccount("Chase", "Claire Simmmons", 30000,
                0.010001);
        System.out.println(user1.showInfo());
        assertEquals(user1.withdrawMoney(1000), 1000);
        assertEquals(user1.depositMoney(10000), 39000);
        assertEquals(user1.pasttime(200), 285381.20172766);
    }
    @Test
    void test2() {
        BankAccount user1 = new BankAccount("Bank Of America", "Remy Clay", 10000, 0.010001);
        System.out.println(user1.showInfo());
        assertEquals(user1.withdrawMoney(5000), 2000);
        assertEquals(user1.depositMoney(12000), 19900);
        assertEquals(user1.pasttime(500), 2882404.7506039);
    }
    @Test
    void showInfo() {

    }

    @Test
    void depositMoney() {

    }

    @Test
    void withdrawMoney() {
    }

    @Test
    void pasttime() {
    }
}