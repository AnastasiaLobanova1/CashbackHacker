package ru.netology;


import static org.junit.Assert.assertEquals;


public class CashBackHackerTest {

    @org.junit.Test

    public void testRemainWithCashBack() {
        CashBackHacker hacker = new CashBackHacker();
        int amount = 900;
        int actual = hacker.remain(amount);

        int expected = 100;
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testRemain() {
        CashBackHacker hacker = new CashBackHacker();
        int amount = 1000;
        int actual = hacker.remain(amount);

        int expected = 0;
        assertEquals(actual, expected);

    }
}
