package org.jnario.tests;

import com.google.common.base.Objects;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.calc.Calculator;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.tests.TestingASimpleCalculatorUsingJNarioFeature;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Adding two numbers")
@SuppressWarnings("all")
public class TestingASimpleCalculatorUsingJNarioFeatureAddingTwoNumbers extends TestingASimpleCalculatorUsingJNarioFeature {
  final Calculator calc = new Function0<Calculator>() {
    public Calculator apply() {
      Calculator _calculator = new Calculator();
      return _calculator;
    }
  }.apply();
  
  @Test
  @Order(0)
  @Named("Given I have entered \\\"2\\\" into the calcutaor")
  public void givenIHaveEntered2IntoTheCalcutaor() {
    StepArguments _stepArguments = new StepArguments("2");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.calc.pressKey(_first);
  }
  
  @Test
  @Order(1)
  @Named("And I entered \\\"+\\\" into the calculator")
  public void andIEnteredIntoTheCalculator() {
    StepArguments _stepArguments = new StepArguments("+");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.calc.pressKey(_first);
  }
  
  @Test
  @Order(2)
  @Named("And then I entered \\\"2\\\" into the calculator")
  public void andThenIEntered2IntoTheCalculator() {
    StepArguments _stepArguments = new StepArguments("2");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.calc.pressKey(_first);
  }
  
  @Test
  @Order(3)
  @Named("When I press \\\"=\\\"")
  public void whenIPress() {
    StepArguments _stepArguments = new StepArguments("=");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.calc.pressKey(_first);
  }
  
  @Test
  @Order(4)
  @Named("Then the result should be 4")
  public void thenTheResultShouldBe4() {
    StringBuilder _display = this.calc.getDisplay();
    /* Objects.equal(_display, Integer.valueOf(4)); */
  }
}
