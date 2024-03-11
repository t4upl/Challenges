package com.artifactId.random.database.command;

import com.artifactId.random.database.Database;
import lombok.Value;

@Value
public class GetCommand implements Command{

    String key;

    @Override
    public ComamndType getCommandType() {
        return null;
    }

    @Override
    public void run(Database database) {
        database.getOutput().add(database.get(key.toString()).orElse("NULL"));
    }
}
