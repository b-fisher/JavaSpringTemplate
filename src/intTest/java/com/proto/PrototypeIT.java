package com.proto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
        PrototypeImpl.class
})
public class PrototypeIT {

    @Inject
    PrototypeImpl prototype;

    @Test
    public void doesNothing(){
        prototype.doSomething();
    }
}
