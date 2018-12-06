package org.fkit.converter;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date>
{
    private String string;

    public String getString()
    {
        return string;
    }

    public void setString(String string)
    {
        this.string = string;
    }

    public StringToDateConverter(String string)
    {
        this.string = string;
    }

    public StringToDateConverter()
    {
    }


    @Override
    public Date convert(String s)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat(this.string);


        try
        {
            return dateFormat.parse(s);
        } catch (ParseException e)
        {
            throw new IllegalArgumentException(e);
        }
    }
}
