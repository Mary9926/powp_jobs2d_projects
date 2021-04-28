package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.visitor.Visitor;
import edu.kis.powp.jobs2d.drivers.transformation.Point;

/**
 * Implementation of Job2dDriverCommand for operateTo command functionality.
 */
public class OperateToCommand implements DriverCommand {

    private final Point point;

    public OperateToCommand(int posX, int posY) {
        super();
        point = new Point(posX, posY);
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public void execute(Job2dDriver driver) {
        driver.operateTo(point.x, point.y);
    }

	@Override
	public DriverCommand clone() {
		return new OperateToCommand(this.posX,this.posY);
	}

    @Override
    public void accept(Visitor visitor) {
        visitor.visitOperateToCommand(this);
    }
}
