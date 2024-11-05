package ru.netology;

import org.testng.annotations.Test;
import org.testng.Assert;

public class ServiceTestng {
    
    @Test
    public void CalculateRemain() {

CashbackHackService service = new CashbackHackService();
int amount = 1000;
int actual = service.remain(amount);
int expected = 0;

Assert.assertEquals(actual,expected);

    }

}
