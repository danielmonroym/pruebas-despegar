package com.udea.despegar.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"com.udea.despegar.stepdefinitions"},
        features = "src/test/resources/despegar/features/despegar.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Despegar {
}