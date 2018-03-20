package agc.data;

public class FullTurnByAxes {
	private double fullTurn_X;
	private double fullTurn_Y;
	private double fullTurn_Z;
	
	public double getFullTurn_X() {
		return fullTurn_X;
	}

	public double getFullTurn_Y() {
		return fullTurn_Y;
	}

	public double getFullTurn_Z() {
		return fullTurn_Z;
	}
	
	public FullTurnByAxes ()
	{
		this.fullTurn_X = 0.0d;
		this.fullTurn_Y = 0.0d;
		this.fullTurn_Z = 0.0d;
	}
	
	public FullTurnByAxes (double xValue, double yValue, double zValue)
	{
		this.fullTurn_X = xValue;
		this.fullTurn_Y = yValue;
		this.fullTurn_Z = zValue;
	}
	
}
