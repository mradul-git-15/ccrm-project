package edu.ccrm.config;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AppConfig {
    private static AppConfig instance = new AppConfig();
    private Path dataDir;

    private AppConfig() {
        this.dataDir = Paths.get("data");
    }

    public static AppConfig getInstance() {
        return instance;
    }

    public Path getDataDir() {
        return dataDir;
    }
}