package com.poo.labvisitor.task1.document;

public class DocuWikiVisitor implements Visitor{
    private StringBuilder document;

    public StringBuilder getDocument() {
        return this.document;
    }

    public DocuWikiVisitor(){
        document = new StringBuilder();
    }

    public void visit(PlainTextSegment text){
        document.append(text.getContent());
    }

    public void visit(ItalicTextSegment text) {
        document.append("//");
        document.append(text.getContent());
        document.append("//");
    }

    public void visit(BoldTextSegment text){
        document.append("**");
        document.append(text.getContent());
        document.append("**");
    }

    public void visit(UrlSegment text){
        document.append("[[");
        document.append(text.getContent());
        document.append(" |");
        document.append(text.getDescription());
        document.append("]]");
    }
}
