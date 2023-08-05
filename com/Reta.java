package com;


public class Reta {
    float length;
    Ponto p1 = new Ponto(0, 0);
    Ponto p2 = new Ponto(0, 0);
    
    public Reta () {
        float f = (0 - 0);
        float g = (0 - 0);
        setLength(f * f + g * g);
    };
    public Reta (Ponto A) {
        float f = (0 - A.getX());
        float g = (0 - A.getY());
        p1 = A;
        setLength(f * f + g * g);
    };
    public Reta (Ponto A, Ponto B) {
        float f = (B.getX() - A.getX());
        float g = (B.getY() - A.getY());
        p1 = A;
        p2 = B;
        setLength(f * f + g * g);
    }
    private void setLength(float length) {
        this.length = (float) Math.sqrt(length);
    }

    public float getLength() {
        return length;
    }

    public String getStraight() {
        return p1.getPoint() + ", " + p2.getPoint();
    } 
}
