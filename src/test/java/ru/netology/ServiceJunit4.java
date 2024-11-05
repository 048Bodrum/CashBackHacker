package ru.netology;

import org.junit.Test;
import org.junit.Assert;

public class ServiceJunit4 {
    @Test
    public void calculateRemain() {

 CashbackHackService service = new CashbackHackService();
int amount = 900;
int actual = service.remain(amount);
int expected = 100;

Assert.assertEquals(expected,actual);
    }



}
