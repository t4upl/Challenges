package com.artifactId.random.database;

import com.artifactId.random.database.command.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DatabaseTest {

    Database database;

    @BeforeEach
    void setUp() {
        database = new Database();
    }

    @Test
    void shouldSetValue() {
        database.runCommands(List.of(new SetCommand("A", 1), new GetCommand("A")));
        assertThat(database.getOutput().get(0)).isEqualTo("1");
    }

    @Test
    void shouldGetNullWhenValueNotPresent() {
        database.runCommands(List.of(new SetCommand("A", 1), new GetCommand("B")));
        assertThat(database.getOutput().get(0)).isEqualTo("NULL");
    }

    @Test
    void shouldDeleteValue() {
        database.runCommands(List.of(new SetCommand("A", 1), new DeleteCommand("A"), new GetCommand("A")));
        assertThat(database.getOutput().get(0)).isEqualTo("NULL");
    }

    @Test
    void shouldCountValues() {
        database.runCommands(List.of(new SetCommand("A", 1), new SetCommand("B", 1), new CountCommand("1"), new CountCommand("60")));
        assertThat(database.getOutput().get(0)).isEqualTo("2");
        assertThat(database.getOutput().get(1)).isEqualTo("0");
    }

    @Test
    void shouldCommitTransaction() {
        database.runCommands(List.of(new SetCommand("A", 1), new CommitCommand(), new GetCommand("A")));

    }


}