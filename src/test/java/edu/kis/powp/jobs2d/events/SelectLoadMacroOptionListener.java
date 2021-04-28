package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.manager.DriverCommandManager;
import edu.kis.powp.jobs2d.drivers.MacroDriver;

public class SelectLoadMacroOptionListener implements ActionListener {
	private MacroDriver macroDriver;
	private DriverCommandManager driverCommandManager;
	
	public SelectLoadMacroOptionListener(MacroDriver macroDriver, DriverCommandManager driverCommandManager) {
		this.macroDriver = macroDriver;
		this.driverCommandManager = driverCommandManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		driverCommandManager.setCurrentCommand(macroDriver.getMacro());
	}
	
}