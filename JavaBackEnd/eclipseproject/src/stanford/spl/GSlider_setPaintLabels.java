package stanford.spl;

import acm.graphics.GObject;
import acm.util.TokenScanner;

public class GSlider_setPaintLabels extends JBECommand {
	public void execute(TokenScanner paramTokenScanner, JavaBackEnd paramJavaBackEnd) {
		paramTokenScanner.verifyToken("(");
		String interactorID = nextString(paramTokenScanner);
		paramTokenScanner.verifyToken(",");
		boolean value = nextBoolean(paramTokenScanner);
		paramTokenScanner.verifyToken(")");
		
		GObject localGObject = paramJavaBackEnd.getGObject(interactorID);
		if (localGObject != null && localGObject instanceof GSlider) {
			((GSlider) localGObject).setPaintLabels(value);
		}
	}
}
