package com.wisestep.urlshortener.util;

import java.util.regex.Pattern;

public class UrlValidatorUtil {
    private static final String URL_REGEX =
            "^(http://|https://)?(www\\.)?[a-zA-Z0-9\\-\\.]+\\.[a-z]{2,}(/\\S*)?$";

    private static final Pattern PATTERN = Pattern.compile(URL_REGEX);

    public static boolean isValid(String url) {
        return PATTERN.matcher(url).matches();
    }
}
