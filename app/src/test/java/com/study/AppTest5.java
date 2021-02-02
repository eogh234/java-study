package com.study;

import com.study.week4.App;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest5 {
    @BeforeAll
    static void init() {
        System.out.println("Before All");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before Each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each");
    }

    @AfterAll
    static void finish() {
        System.out.println("After All");
    }

    @Test
    @DisplayName("Greeting 테스트")
    void getGreeting() {
        App app = new App();
        System.out.println("Greeting Test");
        assertNotNull(app.getGreeting(), "Greeting Need");
    }

    @Test
    void main() {
        App app = new App();
        System.out.println("Main Test");
        assertNotNull(app, "App Need");
    }
}