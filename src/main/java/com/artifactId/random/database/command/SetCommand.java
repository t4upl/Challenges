package com.artifactId.random.database.command;

import com.artifactId.random.database.Database;
import lombok.Value;

@Value
public class SetCommand implements Command {

    String key;
    Integer value;


    @Override
    public ComamndType getCommandType() {
        return ComamndType.SET;
    }

    @Override
    public void run(Database database) {

        database.set(key, value);
    }
}
