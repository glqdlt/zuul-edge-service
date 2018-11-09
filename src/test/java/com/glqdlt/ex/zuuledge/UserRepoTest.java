package com.glqdlt.ex.zuuledge;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

import java.util.Date;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class UserRepoTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    UserRepo userRepo;

    @Test
    public void testConst() {
        Assert.assertNotNull(dataSource);
    }

}