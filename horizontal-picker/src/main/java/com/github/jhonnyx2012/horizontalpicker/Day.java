package com.github.jhonnyx2012.horizontalpicker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Created by jhonn on 28/02/2017.
 */
public class Day {
    private final LocalDate date;
    private boolean selected;
    private String monthPattern = "MMMM yyyy";

    public Day(LocalDate date) {
        this.date = date;
    }

    public String getDay() {
        return String.valueOf(date.getDayOfMonth());
    }

    public String getWeekDay() {
        return date.format(
                DateTimeFormatter.ofPattern("EEE", Locale.getDefault())
        ).toUpperCase();
    }

    public String getMonth() {
        return getMonth("");
    }

    public String getMonth(String pattern) {
        if (!pattern.isEmpty())
            this.monthPattern = pattern;

        return date.format(
                DateTimeFormatter.ofPattern(monthPattern, Locale.getDefault())
        );
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isToday() {
        return date.equals(LocalDate.now());
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isSelected() {
        return selected;
    }
}