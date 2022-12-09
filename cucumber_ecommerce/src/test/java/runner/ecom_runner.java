package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = ".\\Features\\ecom.feature",
        glue="Steps_DefinationPack",
        dryRun=false,
        monochrome=true
        
        )

public class ecom_runner {

}
