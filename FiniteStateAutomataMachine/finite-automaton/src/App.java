import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		String inputstates = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the states for automata machine");
		inputstates = scan.next();
		System.out.println("for input string " + inputstates + " the machine will go as follows");
		System.out.print("Machine start with Initial State S0 :");
		parseInputString(inputstates);

	}

	public static void parseInputString(String inputstates) {

		ArrayList<String> states = new ArrayList<String>();
		String automataStates = "S0";

		for (int i = 0; i < inputstates.length(); i++) {
			states.add(inputstates.substring(i, i + 1));
		}

		for (int i = 0; i < states.size(); i++) {
			if (automataStates.equals("S0") && states.get(i).equals("0")) {
				System.out.print("S0");
				automataStates = "S0";
			} else if (automataStates.equals("S0") && states.get(i).equals("1")) {
				System.out.print("S1");
				automataStates = "S1";
			} else if (automataStates.equals("S1") && states.get(i).equals("0")) {
				System.out.print("S2");
				automataStates = "S2";
			} else if (automataStates.equals("S1") && states.get(i).equals("1")) {
				System.out.print("S0");
				automataStates = "S0";
			} else if (automataStates.equals("S2") && states.get(i).equals("0")) {
				System.out.print("S1");
				automataStates = "S1";
			} else if (automataStates.equals("S2") && states.get(i).equals("1")) {
				System.out.print("S2");
				automataStates = "S2";
			}

		}
	}
}