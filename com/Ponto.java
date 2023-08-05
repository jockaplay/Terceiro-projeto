package com;

public class Ponto {
    float x;
    float y;
    public Ponto(){}
    public Ponto(float x, float y){
        setX(x);
        setY(y);
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }

    public String getPoint(){
        return "("+getX()+","+getY()+")";
    }
}
