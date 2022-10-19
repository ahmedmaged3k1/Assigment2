package com.example.assigment2;

public class CurrencyConverter {
    private Float egyPound ;
    private Float dollar ;

    public Float getEgyPound() {
        return egyPound;
    }

    public void setEgyPound(Float egyPound) {
        this.egyPound = egyPound;
    }

    public Float getDollar() {
        return dollar;
    }

    public void setDollar(Float dollar) {
        this.dollar = dollar;
    }
    public Float convertToDollar(){
       return egyPound/20;

    }
    public Float convertToEgy(){
        return dollar*20;

    }
}
