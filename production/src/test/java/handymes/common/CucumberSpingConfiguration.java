package handymes.common;

import handymes.ProductionApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProductionApplication.class })
public class CucumberSpingConfiguration {}
