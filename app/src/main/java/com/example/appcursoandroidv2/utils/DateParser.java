package com.example.appcursoandroidv2.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {

    private Date date;

    public DateParser() {
    }

    public DateParser(Date date) {
        this.date = date;
    }

    //Parsea fechas en formato texto introducidas en los EditText
    public long parse(String f) {
        Date date = new Date(-62135769600000L); // 1 de enero del año cero
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            date = sdf.parse(f);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime();
    }

    public String getDateTimeInTextFormat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return dateFormat.format(date);
    }

    public String getDateInTextFormat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

}

