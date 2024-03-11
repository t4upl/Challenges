package com.artifactId.random.database.command;

import com.artifactId.random.database.Database;
import lombok.Value;

@Value
public class DeleteCommand implements Command{

    String key;

    @Override
    public ComamndType getCommandType() {
        return ComamndType.DELETE;
    }

    @Override
    public void run(Database database) {
        database.delete(key);
    }
}
