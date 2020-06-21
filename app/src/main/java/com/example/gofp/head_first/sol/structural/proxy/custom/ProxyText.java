package com.example.gofp.head_first.sol.structural.proxy.custom;

import android.util.Log;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProxyText implements TextField {
    private static final String TAG = "ProxyText";
    private static final String FONT_PLACE_HOLDER = "font placeholder";
    private static final String BODY_PLACE_HOLDER = "text placeholder";
    private TextField realText;

    private String font;
    private String body;

    public ProxyText(String font, String body) {
        this.font = font;
        this.body = body;
        this.realText = null;
    }

    @Override
    synchronized public String getFont() {
        if (realText == null) {
            return FONT_PLACE_HOLDER;
        } else {
            return realText.getFont();
        }
    }


    @Override
    synchronized public String getBody() {
        if (realText == null) {
            return BODY_PLACE_HOLDER;
        } else {
            return realText.getBody();
        }
    }

    synchronized private void setRealText() {
        RealText realText = new RealText();
        realText.setFont(font);
        realText.setBody(body);
        this.realText = realText;
    }

    public void loadText(ProxyCallback callback) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        exec.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    setRealText();
                    callback.apply();
                } catch (Exception e) {
                    Log.d(TAG, Objects.requireNonNull(e.getMessage()));
                }
            }
        });
    }
}
