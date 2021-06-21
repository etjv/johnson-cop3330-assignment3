package ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListOfNamesTest {

    @Test
    void sortNamesWorks1() {
        ListOfNames l = new ListOfNames();
        List<String> actual = new ArrayList<>();
        List<String> expected = new ArrayList<>();

        actual.add("Ling, Mai");
        actual.add("Johnson, Jim");
        actual.add("Zarnecki, Sabrina");
        actual.add("Jones, Chris");
        actual.add("Jones, Aaron");

        expected.add("Johnson, Jim");
        expected.add("Jones, Aaron");
        expected.add("Jones, Chris");
        expected.add("Ling, Mai");
        expected.add("Zarnecki, Sabrina");

        l.SortNames(actual);

        assertEquals(expected, actual);
    }

    @Test
    void sortNamesWorks2() {
        ListOfNames l = new ListOfNames();
        List<String> actual = new ArrayList<>();
        List<String> expected = new ArrayList<>();

        actual.add("Difo, Paul");
        actual.add("Janus, Hue");
        actual.add("Dover, Ben");


        expected.add("Difo, Paul");
        expected.add("Dover, Ben");
        expected.add("Janus, Hue");

        l.SortNames(actual);

        assertEquals(expected, actual);
    }
}