package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void TestAmount0() {      //не было покупок
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
}
    @org.testng.annotations.Test
    public void TestAmountMinusLog1() {      //проверка на отрицательные с логикой 1
        CashbackHackService service = new CashbackHackService();
        int amount = -100;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void TestAmountMinusLog2() {      //проверка на отрицательные с логикой 2
        CashbackHackService service = new CashbackHackService();
        int amount = -100;
        int actual = service.remain(amount);
        int expected = 1100;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
public void AmountMinStep() { //минимум до 1000
    CashbackHackService service = new CashbackHackService();
    int amount = 999;
    int actual = service.remain(amount);
    int expected = 1;
    assertEquals(actual, expected);
}

    @org.testng.annotations.Test
public void AmountNextStep() { //проверка на последующую 1000
    CashbackHackService service = new CashbackHackService();
    int amount = 1001;
    int actual = service.remain(amount);
    int expected = 999;
    assertEquals(actual, expected);
}

    @org.testng.annotations.Test
public void AmountEquallyStep1() { //равными долями
    CashbackHackService service = new CashbackHackService();
    int amount = 1000;
    int actual = service.remain(amount);
    int expected = 0;
    assertEquals(actual, expected);
}
    @org.testng.annotations.Test
    public void AmountEquallyStep2() { //равными долями в логике максимального кешбека
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
public void Amount1() { //максимум до 1000
    CashbackHackService service = new CashbackHackService();
    int amount = 1;
    int actual = service.remain(amount);
    int expected = 999;
    assertEquals(actual, expected);
}

    @org.testng.annotations.Test
public void AmountFiftyFifty() { //пополам
    CashbackHackService service = new CashbackHackService();
    int amount = 500;
    int actual = service.remain(amount);
    int expected = 500;
    assertEquals(actual, expected);
}
    @org.testng.annotations.Test
    public void AmountFractions() { //проверка пазлом
        CashbackHackService service = new CashbackHackService();
        int amount = 483;
        int actual = service.remain(amount);
        int expected = 517;
        assertEquals(actual, expected);
    }

}