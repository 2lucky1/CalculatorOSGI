package com.muntian.calculator.listeners;

import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Combo;

import com.muntian.calculator.logic.MathData;
import com.muntian.calculator.ui.MainPanel;
import com.muntian.calculator.ui.MathOperationPanel;

public class ModifyListenerForOperator implements ModifyListener {

	private MathOperationPanel mathOperationPanel = MainPanel.getInstance().getMathOperationPanel();
	private MathData mathData;

	public ModifyListenerForOperator(MathData mathData) {
		this.mathData = mathData;
	}

	@Override
	public void modifyText(ModifyEvent e) {
		Combo widget = (Combo) e.widget;
		String operator = widget.getText();

		System.out.println("Modify listener!! operator");
		mathData.setSign(operator);
		
		if(operator != "" && !mathData.isOnFlyMode()) {
			mathOperationPanel.getBtnCalculate().setEnabled(true);
		}

	}

}
