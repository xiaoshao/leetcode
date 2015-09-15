package com.first;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class FirstSpec {

    @Test
    public void test1(){
        assertEquals("kkkk", "kkkk");
        assertThat("Magci", equalTo("Magci"));
    }
}