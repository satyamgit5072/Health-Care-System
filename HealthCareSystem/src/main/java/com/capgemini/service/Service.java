package com.capgemini.service;

import com.capgemini.dto.DiagnosticCenter;

import java.util.List;

import com.capgemini.dto.CenterTest;

public interface Service {
	
	public boolean addCenter(DiagnosticCenter center);
	
	public boolean removeCenter(DiagnosticCenter center);
	
	public String addTest(DiagnosticCenter center,CenterTest test);
	
	public boolean removeTest(DiagnosticCenter center,CenterTest test);

	public List<DiagnosticCenter> viewCenters();
	
	public void viewCentersAndTests();

	public DiagnosticCenter getCenterObjectOfcenterId(String centerId);
	
	public boolean isCenterNamePresent(String centerName);
	
	public boolean isCenterIdPresent(String centerId);
	
	public CenterTest getTestObject(DiagnosticCenter center, String testId);
	
	public boolean isTestNamePresent(DiagnosticCenter centerObject,String testName);
	
	public boolean isTestIdPresent(DiagnosticCenter centerObject,String testId);
	
}
