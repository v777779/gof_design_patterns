package com.example.gofp.head_first.sol.creational.singleton;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.creational.singleton.classes.members.double_check.DoubleCheckFactory;
import com.example.gofp.head_first.sol.creational.singleton.classes.members.final_wrapper.FinalWrapperFactory;
import com.example.gofp.head_first.sol.creational.singleton.classes.statics.double_check.LoginMvpPresenterD;
import com.example.gofp.head_first.sol.creational.singleton.classes.statics.lazy_holder.LoginMvpPresenter;

public class Singleton extends BasePattern {
    @Override
    public void main() {

        Systems.out.println("Static Lazy Holder:");
        Systems.out.println(LoginMvpPresenter.getInstance()
                .toString().replaceAll(".*\\.",""));
        Systems.out.println(LoginMvpPresenter.getInstance().toString()
                .replaceAll(".*\\.",""));

        Systems.out.println();

        Systems.out.println("Static DoubleCheck:");
        Systems.out.println(LoginMvpPresenterD.getInstance()
                .toString().replaceAll(".*\\.",""));
        Systems.out.println(LoginMvpPresenterD.getInstance()
                .toString().replaceAll(".*\\.",""));

        Systems.out.println();

        Systems.out.println("Member FinalWrapper Factory:");
        FinalWrapperFactory factory = new FinalWrapperFactory();
        Systems.out.println( factory.getInstance()
                .toString().replaceAll(".*\\.",""));
        Systems.out.println( factory.getInstance().toString()
                .replaceAll(".*\\.",""));

        Systems.out.println();

        Systems.out.println("Member FinalWrapper Factory Different:");
        Systems.out.println( new FinalWrapperFactory().getInstance()
                .toString().replaceAll(".*\\.",""));
        Systems.out.println( new FinalWrapperFactory().getInstance()
                .toString().replaceAll(".*\\.",""));
        Systems.out.println();

        Systems.out.println();


        Systems.out.println("Member DoubleCheck Factory:");
        DoubleCheckFactory factory2 = new DoubleCheckFactory();
        Systems.out.println( factory2.getInstance()
                .toString().replaceAll(".*\\.",""));
        Systems.out.println( factory2.getInstance()
                .toString().replaceAll(".*\\.",""));

        Systems.out.println();

        Systems.out.println("Member DoubleCheck Factory Different:");
        Systems.out.println( new DoubleCheckFactory().getInstance()
                .toString().replaceAll(".*\\.",""));
        Systems.out.println( new DoubleCheckFactory().getInstance()
                .toString().replaceAll(".*\\.",""));


    }


}
