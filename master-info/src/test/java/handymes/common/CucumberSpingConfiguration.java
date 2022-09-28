package handymes.common;

import handymes.MasterInfoApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MasterInfoApplication.class })
public class CucumberSpingConfiguration {}
