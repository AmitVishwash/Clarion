package com.clarion.runner;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/"
        , format = {"pretty", "html:target/site/serenity", "json:target/cucumber.json"}
        ,tags = "@PromiseLog"
        , glue = "com.clarion.stepDef")
public class LoginRunner {
}
