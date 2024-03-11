package com.artifactId.random.database.command;

import com.artifactId.random.database.Database;

public class StartCommand implements Command {



    @Override
    public ComamndType getCommandType() {
        return ComamndType.START;
    }

    @Override
    public void run(Database database) {
        database.start();
    }
}
