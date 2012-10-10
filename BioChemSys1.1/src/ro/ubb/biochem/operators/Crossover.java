package ro.ubb.biochem.operators;

import ro.ubb.biochem.exceptions.InvalidProgramException;
import ro.ubb.biochem.program.elements.Program;

public interface Crossover {

	public Program generateOffspring(Program firstParent, Program secondParent)
			throws InvalidProgramException;
}
