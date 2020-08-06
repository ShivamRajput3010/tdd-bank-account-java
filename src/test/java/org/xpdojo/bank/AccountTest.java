package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {

        assertThat("your first test").isBlank();
    }

    @Test
    public void checkZeroBalance() {
        Account ac = new Account();
        assertThat(ac.Balance()).isEqualTo(0);
    }

    @Test
    public void depositAmountShouldIncreaseBalance(){
        Account ac = new Account();
        ac.deposit(10);
        assertThat(ac.Balance()).isEqualTo(10);
    }
}
