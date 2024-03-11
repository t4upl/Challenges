package com.artifactId.random.database.command;

import com.artifactId.random.database.Database;
import lombok.Value;

@Value
public class CountCommand implements Command{

    String value;

    @Override
    public ComamndType getCommandType() {
        return ComamndType.COUNT;
    }

    @Override
    public void run(Database database) {
        database.getOutput().add(database.count(value).toString());
    }
}
