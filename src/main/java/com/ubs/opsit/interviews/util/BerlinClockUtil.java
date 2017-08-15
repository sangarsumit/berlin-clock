/**
 * 
 */
package com.ubs.opsit.interviews.util;

/**
 * <p>
 * Util Class to derive berlin clock time values
 * </p>
 * 
 * @author sumitsangar
 *
 */
public class BerlinClockUtil {

	/**
	 * Method to derive Second String in Berlin Clock
	 * 
	 * @param seconds
	 * @return String
	 */
	public static String deriveSecondsString(int seconds) {

		if (seconds % 2 == 0) {
			return "Y";
		}
		return "O";

	}

	/**
	 * Method to derive first hours line in Berlin Clock
	 * 
	 * @param hours
	 * @return String
	 */
	public static String deriveFirstLineHoursString(int hours) {

		return deriveLineHours(hours / 5);

	}

	/**
	 * Method to derive second hours line in Berlin Clock
	 * 
	 * @param hours
	 * @return String
	 */
	public static String deriveSecondLineHoursString(int hours) {

		return deriveLineHours(hours % 5);

	}

	/**
	 * Method to derive hours line based on hours input
	 * 
	 * @param lineHoursR
	 * @return String
	 */
	private static String deriveLineHours(int lineHoursR) {

		String hoursLine = "";
		for (int i = 0; i < lineHoursR; i++) {
			hoursLine = hoursLine + "R";
		}
		for (int j = 0; j < (4 - lineHoursR); j++) {
			hoursLine = hoursLine + "O";
		}
		return hoursLine;
	}

	/**
	 * Method to derive first minutes line in Berlin Clock
	 * 
	 * @param hours
	 * @return String
	 */
	public static String deriveFirstLineMinutesString(int minutes) {

		return deriveLineMinutes(11, (minutes / 5), true);

	}

	/**
	 * Method to derive first minutes line in Berlin Clock
	 * 
	 * @param hours
	 * @return String
	 */
	public static String deriveSecondLineMinutesString(int minutes) {

		return deriveLineMinutes(4, (minutes % 5), false);

	}

	/**
	 * Method to derive minutes line based on minutes input
	 * 
	 * @param length
	 * @param lineMinutesY
	 * @param replaceY
	 * @return String
	 */
	private static String deriveLineMinutes(int length, int lineMinutesY, boolean replaceY) {

		String minutesLine = "";
		int counter = 0;
		for (int i = 0; i < lineMinutesY; i++) {
			if (replaceY) {
				counter++;
				if (counter % 3 == 0) {
					minutesLine = minutesLine + "R";
				} else {
					minutesLine = minutesLine + "Y";
				}
			} else {
				minutesLine = minutesLine + "Y";
			}

		}
		for (int j = 0; j < (length - lineMinutesY); j++) {
			minutesLine = minutesLine + "O";
		}
		return minutesLine;
	}
}
