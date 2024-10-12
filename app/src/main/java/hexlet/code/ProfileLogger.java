package hexlet.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ProfileLogger implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(ProfileLogger.class);

    @Autowired
    private Environment env;

    @Override
    public void run(String... args) {
        logger.info("Active profiles: {}", Arrays.toString(env.getActiveProfiles()));
        logger.info("Default profiles: {}", Arrays.toString(env.getDefaultProfiles()));
        logger.info("POSTGRES_URL: {}", env.getProperty("spring.datasource.url"));
        logger.info("POSTGRES_USER: {}", env.getProperty("spring.datasource.username"));
        logger.info("POSTGRES_PASSWORD is set: {}", 
            (env.getProperty("spring.datasource.password") != null && 
             !env.getProperty("spring.datasource.password").isEmpty()));
    }
}