package org.jnario.tests;

import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.tests.TestingASimpleCalculatorUsingJNarioFeatureAddingTwoNumbers;
import org.junit.runner.RunWith;

@Contains(TestingASimpleCalculatorUsingJNarioFeatureAddingTwoNumbers.class)
@Named("Testing a simple calculator using JNario")
@RunWith(FeatureRunner.class)
@SuppressWarnings("all")
public class TestingASimpleCalculatorUsingJNarioFeature {
}
