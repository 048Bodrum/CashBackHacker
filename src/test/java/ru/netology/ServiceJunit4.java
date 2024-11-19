package ru.netology;

import org.junit.Test;
import org.junit.Assert;

public class ServiceJunit4 {
    @Test
    public void calculateRemain() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }


}
