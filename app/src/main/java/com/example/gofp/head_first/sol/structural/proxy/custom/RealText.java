package com.example.gofp.head_first.sol.structural.proxy.custom;

public class RealText implements TextField {
    private String font;
    private String body;

    @Override
    public String getFont() {
        return font;
    }


    @Override
    public String getBody() {
        return body;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
