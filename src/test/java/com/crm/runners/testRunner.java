package com.crm.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
                "pretty"





        },

        features = "src/test/resources/features",
        glue = "com/crm/step_definitions",
        dryRun = false,
        tags = "@Google"


)
public class testRunner {

}
