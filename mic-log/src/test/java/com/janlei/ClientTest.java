package com.janlei;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClientTest {


    @Test
    void test() {

        Client client = new Client();
        String input = client.test("input");

        assertThat(input).isEqualTo("inputS");
    }
}