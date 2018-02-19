package com.kodilla.stream.sand;

import com.sun.deploy.security.SandboxSecurity;

import java.math.BigDecimal;

public final class Europe implements SandStorage{
    @Override
    public BigDecimal getSandBeansQuantity(){
        BigDecimal sandQuantity = new BigDecimal("12345678901234567890");
        return sandQuantity;
    }
}
