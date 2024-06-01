package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoIdade(){
        People pessoa = new People("Gabriel", LocalDate.of(2003,1,1));
        Assertions.assertEquals(21,pessoa.getIdade());
    }
}
