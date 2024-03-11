package com.artifactId.random.database.command;

import com.artifactId.random.database.Database;

public interface Command {

    ComamndType getCommandType();

    void run(Database database);
}
