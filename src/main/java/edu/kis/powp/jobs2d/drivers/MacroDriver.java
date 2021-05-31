package edu.kis.powp.jobs2d.drivers;

import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.driverCommands.ICompoundCommands.CompoundCommand;
import edu.kis.powp.jobs2d.command.driverCommands.DriverCommand;
import edu.kis.powp.jobs2d.command.driverCommands.OperateToCommand;
import edu.kis.powp.jobs2d.command.driverCommands.SetPositionCommand;

public class MacroDriver implements Job2dDriver {
	private List<DriverCommand> commands = new ArrayList<>();
	
	
	@Override
	public void setPosition(int x, int y) {
		commands.add(new SetPositionCommand(x, y));
	}

	@Override
	public void operateTo(int x, int y) {
		commands.add(new OperateToCommand(x, y));		
	}
	
	public CompoundCommand getMacro() {
		return new CompoundCommand(commands);
	}
	
	public void clearMacro() {
		commands.clear();
	}
	
}
