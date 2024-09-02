package com.artifactId.leetcode.medium.findthestudentthatwillreplacethechalk1894;

import com.artifactId.TestUtils;
import org.junit.jupiter.api.Test;

import javax.sound.sampled.AudioFormat;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        assertThat(new Solution().chalkReplacer(TestUtils.toArray("[5,1,5]"), 22)).isEqualTo(0);
    }

    @Test
    void leet2() {
        assertThat(new Solution().chalkReplacer(TestUtils.toArray("[3,4,1,2]"), 25)).isEqualTo(1);
    }

    @Test
    void leet3() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("leetcode/findthestudentthatwillreplacethechalk1894/leet3.txt").getFile());
        String content = Files.readString(Path.of(file.getPath()), StandardCharsets.UTF_8);
        assertThat(new Solution().chalkReplacer(TestUtils.toArray(content), 539095482)).isEqualTo(10737);
    }

    public static String getFileContent(
            FileInputStream fis,
            String encoding) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new InputStreamReader(fis, encoding))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append('\n');
            }
            return sb.toString();
        }
    }


}