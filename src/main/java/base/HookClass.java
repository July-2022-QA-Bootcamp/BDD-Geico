package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass {

	BaseClass baseClass;
	
	@Before
	public void beforeHook() {
		baseClass = new BaseClass();
		baseClass.setUpDriver();
	}
	
	@After
	public void afterHook() {
		baseClass.closingDriverSession();
	}
}
