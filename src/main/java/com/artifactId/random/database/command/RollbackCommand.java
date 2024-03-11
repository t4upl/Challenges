package com.artifactId.random.database.command;

import com.artifactId.random.database.Database;

public class RollbackCommand implements Command{
    @Override
    public ComamndType getCommandType() {
        return ComamndType.ROLLBACK;
    }

    @Override
    public void run(Database database) {
        database.rollback();
    }
}
