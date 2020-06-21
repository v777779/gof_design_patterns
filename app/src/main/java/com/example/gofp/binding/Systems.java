package com.example.gofp.binding;

public class Systems {
    private static class LazyHolder {
        private static final Systems INSTANCE = new Systems();
    }

    public static Systems out = LazyHolder.INSTANCE;
//    private static final String LINE_SEPARATOR = System.getProperty("line_separator");

    private StringBuilder sb;
    private String lineSeparator;

    private Systems() {
        sb = new StringBuilder();
        lineSeparator = System.getProperty("line.separator");
    }

    public void println(Object o) {

        if (o == null) {
            sb.append("null").append(lineSeparator);
        } else {
            sb.append(o.toString()).append(lineSeparator);
        }
    }

    public void println() {
        sb.append(lineSeparator);
    }

    public void print(Object o) {
        if (o == null) {
            sb.append("null");
        } else {
            sb.append(o.toString());
        }
    }

    public void init() {
        sb.setLength(0);
    }

    public String read() {
        return sb.toString();
    }

    public String lineSeparator() {
        return lineSeparator;
    }
}
