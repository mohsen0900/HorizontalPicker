package com.github.jhonnyx2012.horizontalpicker;

import java.time.LocalDate;

/**
 * Created by jhonn on 02/03/2017.
 */
public interface DatePickerListener {
    void onDateSelected(LocalDate dateSelected);
}