package br.com.ferracini.tdc.provider;

import org.junit.jupiter.params.aggregator.ArgumentsAccessor;

public record PostRequestDataTest(
        String scenario,
        String method,
        String path,
        String param,
        Integer statusCode,
        String jsonPath,
        String expectedMessage
) {


    public PostRequestDataTest(ArgumentsAccessor data) {
        this(
                data.getString(0),
                data.getString(1),
                data.getString(2),
                data.getString(3),
                data.getInteger(4),
                data.getString(5),
                data.getString(6));
    }
}
