package com.example.gofp.head_first.sol.creational.prototype.classes;

import androidx.annotation.NonNull;

public interface Monster  extends Cloneable{
    void display();

    @NonNull
    Object clone() throws CloneNotSupportedException;
}
