// 8.5
// (Modifying the Internal Data Representation of a Class) It would be
// perfectly reasonable for the Time2 class of Fig. 8.5 to represent  time
// internally, as the number of seconds since midnight rather than the three
// integer values hour, minute and second. Clients could use the same public
// methods and get the same results. Modify the Time2 class of Fig. 8.5 to
// implement the time as number of seconds since midnight and show that no
// change is visible to the clients of the class.
//
// [Note: For Excercise 8.5, also include your modified version of Figure 8.6;
// i.e., include all files needed to run your program.]

public class Time2Test {
	public static void main(String[] args) {
		Time2 t1 = new Time2();
		Time2 t2 = new Time2(2);
		Time2 t3 = new Time2(21, 34);
		Time2 t4 = new Time2(12, 25, 42);
		Time2 t5 = new Time2(t4);

		System.out.println("Constructed with:");
		displayTime("t1: all default arguments", t1);
		displayTime("t2: hour specified", t2);
		displayTime("t3: hour and minute specified", t3);
		displayTime("t4: hour, minute and second specified", t4);
		displayTime("t5: Time2 object t4 specified", t5);

		// attempt to initialize with invalid args
		try {
			Time2 t6 = new Time2(27, 74, 99);
		}
		catch (IllegalArgumentException e) {
			System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
		}

	}

	public static void displayTime(String header, Time2 t) {
		System.out.printf("%s%n %s%n %s%n",
			header, t.toUniversalString(), t);
	}
}
