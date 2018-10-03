package ch.jonasgredig.localexpenses;

import ch.jonasgredig.localexpenses.util.TerminalGuiUtils;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TerminalGuiUtilsTest {

    TerminalGuiUtils utils;

    @BeforeEach
    void before() {
        utils = new TerminalGuiUtils();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Jonasss", "50", "50000000000000000", "jkdsafjlksdfurregeriueeerioe", "SDIOJFRGERGERERIJOERIJOTEIJOTIJERURIOJJJJOIIOJIJIJRIJGFI9IJOGHIJOERIOJUJGIUIOJ4IUTGREUGTRGTUERGUI", "J", "ASDFASDFASDF"})
    void testSetStringLength(String testString) {
        String result = utils.setStringLength(testString, 6);
        Assertions.assertEquals(6, result.length());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Jonasss", "50", "50000000000000000", "jkdsafjlksdfurregeriueeerioe", "SDIOJFRGERGERERIJOERIJOTEIJOTIJERURIOJJJJOIIOJIJIJRIJGFI9IJOGHIJOERIOJUJGIUIOJ4IUTGREUGTRGTUERGUI", "J", "ASDFASDFASDF"})
    void testSetStringLength2(String testString) {
        String result = utils.setStringLength(testString, 1);
        Assertions.assertEquals(1, result.length());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Jonasss", "50", "50000000000000000", "jkdsafjlksdfurregeriueeerioe", "SDIOJFRGERGERERIJOERIJOTEIJOTIJERURIOJJJJOIIOJIJIJRIJGFI9IJOGHIJOERIOJUJGIUIOJ4IUTGREUGTRGTUERGUI", "J", "ASDFASDFASDF"})
    void testSetStringLength3(String testString) {
        String result = utils.setStringLength(testString, 0);
        Assertions.assertEquals(0, result.length());
    }
}
