package src.main.java.pkgHelper;

public class PuzzleViolation {
	
	private ePuzzleViolation ePuzzleViolation;
	private int iValue;
	
	public PuzzleViolation(ePuzzleViolation ePuzzleViolation, int iValue) {
		this.ePuzzleViolation = ePuzzleViolation;
		this.iValue = iValue;
	}
	
	public ePuzzleViolation getePuzzleViolation() {
		return ePuzzleViolation;
	}
	
	public int getiValue() {
		return iValue;
	}
}
