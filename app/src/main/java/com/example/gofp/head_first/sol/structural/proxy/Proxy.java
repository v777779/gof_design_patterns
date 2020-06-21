package com.example.gofp.head_first.sol.structural.proxy;

import android.os.Handler;
import android.os.Looper;

import androidx.lifecycle.MutableLiveData;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.structural.proxy.classes.NonOwnerInvocationHandler;
import com.example.gofp.head_first.sol.structural.proxy.classes.OwnerInvocationHandler;
import com.example.gofp.head_first.sol.structural.proxy.classes.PersonBean;
import com.example.gofp.head_first.sol.structural.proxy.classes.PersonDb;
import com.example.gofp.head_first.sol.structural.proxy.custom.ProxyText;

public class Proxy extends BasePattern {

    @Override
    public void main() {

        Systems.out.println("Java Reflection Proxy Implementation: ");
        Systems.out.println("---------------------------------------------");
        PersonBean joe = PersonDb.getInstance().getPerson("joe");

        PersonBean ownerProxy = OwnerInvocationHandler.getProxy(joe);
        Systems.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        Systems.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            Systems.out.println("Can't set rating from owner proxy");
        }
        Systems.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = NonOwnerInvocationHandler.getProxy(joe);
        Systems.out.println("Name is " + nonOwnerProxy.getName());

        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            Systems.out.println("Can't interests rating from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        Systems.out.println("Rating set from non owner proxy");
        Systems.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

    }

    @Override
    public void main(MutableLiveData<String> body) {
        Systems.out.println();
        Systems.out.println("Custom Proxy Implementation: ");
        Systems.out.println("---------------------------------------------");

        ProxyText proxy = new ProxyText("san-serif", "start text location");

        proxy.loadText(() -> {
            new Handler(Looper.getMainLooper()).post(() -> {
                Systems.out.println("Get from loaded real subject:");
                Systems.out.println(proxy.getFont());
                Systems.out.println(proxy.getBody());
                body.setValue(Systems.out.read());
            });
        });

        Systems.out.println("Start loading from proxy... ");
        Systems.out.println(proxy.getFont());
        Systems.out.println(proxy.getBody());
        body.setValue(Systems.out.read());
    }
}
