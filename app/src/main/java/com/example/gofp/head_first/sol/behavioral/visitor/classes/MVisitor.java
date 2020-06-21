package com.example.gofp.head_first.sol.behavioral.visitor.classes;

public interface MVisitor {
    void visit(MenuItem item);

    void visit(Menu menu);

    void visit(Ingredient ingredient);

}
