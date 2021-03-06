package com.github.sixro.minihabits.core.infrastructure.text;

import java.util.Date;

public interface DateTimeFormatter {

	String format(Date date, String pattern);

	Date parse(String text, String pattern);

}
