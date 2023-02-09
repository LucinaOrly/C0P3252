// 8.7
// (Enhancing Class Time2) Modify class Time2 of Fig. 8.5 to include a tick method that increments the time stored in a Time2 object by one second. Provide method incrementMinute to increment the minute by one and method incrementHour to increment the hour by one. Write a program that tests the tick method, the incrementMinute method and the incrementHour method to ensure that they work correctly. Be sure to test the following cases:
// 1. incrementing into the next minute,
// 2. incrementing into the next hour and
// 3. incrementing into the next day (i.e., 11:59:59 PM to 12:00:00 AM).
//
// Im going to utilize the same Time2.java as assignent 8.5

public class TickTest {
	public static void main(String[] args) {
		Time2 t1 = new Time2();
		Time2 t2 = new Time2(23,59,59);
		
		Time2Test.displayTime("t1: default args", t1);
		Time2Test.displayTime("t2: max values:", t2);

		for(int i = 1; i <= 3; i++) {
			t1.tick();
			Time2Test.displayTime("t1 after " + i + " ticks:", t1);
		}
		for(int i = 1; i <= 3; i++) {
			t1.incrementMinute();
			Time2Test.displayTime("t1 after " + i + " incrementMinute(s):", t1);
		}	
		for(int i = 1; i <= 3; i++) {
			t1.incrementHour();
			Time2Test.displayTime("t1 after " + i + " incrementHour(s):", t1);
		}	
		
		t2.tick();
		Time2Test.displayTime("t2 after tick at max value", t2);
	}
}
