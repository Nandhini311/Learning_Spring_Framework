package com.fairissac.cdi;

import javax.inject.Named;

@Named
public class CDIDAO {

    public int[] getData(){
        return new int[] {5, 89, 100};
    }
    public CDIDAO(){
        System.out.println("CDIDAO class bean is also generated");
    }
}
