package com.poo.labvisitor.task1.document;

public class PlainTextSegment extends TextSegment  implements  Visitable{

    public PlainTextSegment(String content) {
        super(content);
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}
