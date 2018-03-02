package agc.data;

public class AccelerationByAxes {
	private MinMaxAcceleration x_Axis;
	private MinMaxAcceleration y_Axis;
	private MinMaxAcceleration z_Axis;
	
	public MinMaxAcceleration getX_Axis() {
		return x_Axis;
	}
	public MinMaxAcceleration getY_Axis() {
		return y_Axis;
	}
	public MinMaxAcceleration getZ_Axis() {
		return z_Axis;
	}

	public AccelerationByAxes ()
	{
		this.x_Axis = new MinMaxAcceleration ();
		this.y_Axis = new MinMaxAcceleration ();
		this.z_Axis = new MinMaxAcceleration ();
	}

	public AccelerationByAxes (double xMinValue, double xMaxValue, double yMinValue, double yMaxValue, double zMinValue, double zMaxValue)
	{
		this.x_Axis = new MinMaxAcceleration (xMinValue, xMaxValue);
		this.y_Axis = new MinMaxAcceleration (yMinValue, yMaxValue);
		this.z_Axis = new MinMaxAcceleration (zMinValue, zMaxValue);
	}
}
