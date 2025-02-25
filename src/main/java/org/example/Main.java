package org.example;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
		//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
		// to see how IntelliJ IDEA suggests fixing it.
		System.out.println("Hello and welcome!");

// код выдаёт не округлённый результат: 1.2 + 2.5 =  3.700000047683716
		double a = 1.2f;
		double b = 2.5f;
		double c = a+b;
		System.out.println(c);

		
// код округляет до 1/10 результат: 1.2 + 2.5 =  3.7
		BigDecimal sum = new BigDecimal("1.2").add(new BigDecimal("2.5"));
		System.out.println(sum);

			for (int i = 1; i <= 5; i++) {
			//TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
			// for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
			System.out.println("i = " + i);
		}
	}


}