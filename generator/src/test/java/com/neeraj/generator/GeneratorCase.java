package com.neeraj.generator;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neeraj.generator.controller.GeneratorController;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GeneratorApplication.class)
public abstract class GeneratorCase {

	@Autowired
	GeneratorController generator;

	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(generator);
	}
}
