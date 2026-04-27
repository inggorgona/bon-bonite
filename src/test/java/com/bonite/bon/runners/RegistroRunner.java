package com.bonite.bon.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty",
        features = "src/test/resources/features/registroUsuario.feature",
        glue = "com.bonite.bon.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
        //tags = ""
)

public class RegistroRunner {
}