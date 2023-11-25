package com.artifactId.random.bny;

import com.artifactId.random.bny.sip2024.Nurses;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NursesTest {

    Nurses nurses = new Nurses();

    @BeforeEach
    void setUp() {
        nurses = new Nurses();
    }

    @Test
    void sampleCase0() {
        List<List<Integer>> of = List.of(List.of(0, 2), List.of(1, 3), List.of(0, 7));
        assertThat(Nurses.findHardestWorkingNurse(of)).isEqualTo('a');
    }

    @Test
    void sampleCase1() {
        List<List<Integer>> of = List.of(List.of(0, 1), List.of(0, 3), List.of(4, 5), List.of(5, 6), List.of(4, 10));
        assertThat(Nurses.findHardestWorkingNurse(of)).isEqualTo('e');
    }

}