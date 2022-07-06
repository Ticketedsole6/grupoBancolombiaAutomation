package com.grupobancolombia.tests.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/generateReport.feature",
        glue =  "com.grupobancolombia.tests.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@test")
public class GenerateReportRunner {
}
