package com.artifactId.random.database.command;

import com.artifactId.random.database.Database;
import lombok.Value;

@Value
public class CommitCommand implements Command{
    @Override
    public ComamndType getCommandType() {
        return ComamndType.COMMIT;
    }

    @Override
    public void run(Database database) {

    }
}
