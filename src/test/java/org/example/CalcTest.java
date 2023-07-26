package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("before all");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After each");
    }

    @ParameterizedTest
    @DisplayName("Проверка суммирования")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @Tag("summ")
    void calc (int a, int b, int expectedResult ) {
        Calc calculator = new Calc();
        int result = calculator.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Неверный ответ");
    }

    @ParameterizedTest
    @DisplayName("Проверка вычитания")
    @CsvSource({"1, 2, -1", "-1, -2, 1", "0, 0, 0"})
    @Tag("subt")
    void calcSubt (int a, int b, int expectedResult ) {
        Calc calculator = new Calc();
        int result = calculator.subt(a, b);
        Assertions.assertEquals(expectedResult, result, "Неверный ответ");
    }
}