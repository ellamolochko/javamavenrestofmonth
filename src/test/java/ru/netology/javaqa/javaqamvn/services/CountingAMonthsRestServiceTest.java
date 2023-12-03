package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.CountingAMonthsRestService;

public class CountingAMonthsRestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Months.csv")
    public void testMonthsOfRest(int expected, int income, int expenses, int threshold) {
        CountingAMonthsRestService service = new CountingAMonthsRestService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
