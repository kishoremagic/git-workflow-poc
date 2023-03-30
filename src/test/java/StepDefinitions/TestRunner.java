package StepDefinitions;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"},
		features="src/test/resources/Features",glue= {"StepDefinitions"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestRunner {

}
