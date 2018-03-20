package agc;

import agc.data.AccelerationByAxes;
import agc.data.FullTurnByAxes;
import agc.exceptions.AGCException;

public class AGCCalculator implements AgcCalculatorInterface {

	@Override
	public AccelerationByAxes CalculateMinMaxAcceleration(String InputFile, int InitialInstant, int FinalInstant)
			throws AGCException {
		// TODO Auto-generated method stub
		AccelerationByAxes result = new AccelerationByAxes();
		return result;
	}

	@Override
	public FullTurnByAxes CalculateFullTurn(String InputFile, int InitialInstant, int FinalInstant)
			throws AGCException {
		// TODO Auto-generated method stub
		
		FullTurnByAxes result = new FullTurnByAxes();
		return result;
	}

}
