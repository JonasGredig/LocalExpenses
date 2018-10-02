package ch.jonasgredig.localexpenses;

import ch.jonasgredig.localexpenses.util.TerminalGuiUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TerminalGuiUtilsTest {

    TerminalGuiUtils utils;

    @BeforeEach
    void before() {
        utils = new TerminalGuiUtils();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Jonas","50","50000000000000000","jkdsafjlksdfurregeriueeerioe","SDIOJFRGERGERERIJOERIJOTEIJOTIJERURIOJJJJOIIOJIJIJRIJGFI9IJOGHIJOERIOJUJGIUIOJ4IUTGREUGTRGTUERGUI","J","ASDFASDFASDF"})
    void testSetStringLength(String testString) {
        String result = utils.setStringLength(testString, 6);
        Assertions.assertEquals(6, result.length());
    }
}
