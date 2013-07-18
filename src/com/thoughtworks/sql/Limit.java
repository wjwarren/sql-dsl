package com.thoughtworks.sql;

import static com.thoughtworks.sql.Constants.*;

/**
 * Implement the SQL "LIMIT" command.
 *
 * "Limit is used to limit your MySQL query results to those that fall within a specified range.
 * You can use it to show the first X number of results, or to show a range from X - Y results."
 *
 * @author Wijnand
 */
public class Limit {

	private int start;
	private int end;

	/**
	 * CONSTRUCTOR
	 * @param start int - The starting point.
	 * @param end int - The duration (how many records to display).
	 */
	public Limit(int start, int end) {
		this.start = start;
		this.end = end;
	}

	/**
	 * CONSTRUCTOR
	 * @param end int - The duration (how many records to display).
	 */
	public Limit(int end) {
		this(0, end);
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return start + COMMA + SPACE + end;
	}

}
