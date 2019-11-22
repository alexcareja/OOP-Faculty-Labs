package com.poo.labvisitor.task1.document;

public class UrlSegment extends PlainTextSegment {

    String description;

    public UrlSegment(String url, String descriprion){
        super(url);
        this.description = descriprion;
    }

    String getDescription() {
        return this.description;
    }

    public void accept(Visitor v){
        v.visit(this);
    }
}
