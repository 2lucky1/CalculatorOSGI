package com.muntian.calculator.listeners;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import com.muntian.calculator.logic.Calculations;

public class ListenerForButtonCalculate implements SelectionListener {

	private Calculations calculation;

	public ListenerForButtonCalculate(Calculations calculation) {
		this.calculation = calculation;
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		calculation.calculate();
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		System.out.println("Ignore this method");
	}
}
