package com.sophos.gft.runners;


import Utils.exceldata.BeforeSuite;
import Utils.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import java.io.IOException;

@RunWith(CustomRunner.class)
@CucumberOptions(

        features = "src/test/resources/Features/registro.feature",
        glue = "com.sophos.gft.stepDefinitions",
        snippets = SnippetType.CAMELCASE
    )

public class Registro {
    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("src/test/resources/Features/registro.feature");
    }
}
