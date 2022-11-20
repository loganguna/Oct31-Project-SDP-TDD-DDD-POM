package com.retry.analyse;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Transform_Utility implements IAnnotationTransformer{
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		//Test(retryAnalyzer = Retry_Utility.class)
		annotation.setRetryAnalyzer(Retry_Utility.class);
		
	}

}
