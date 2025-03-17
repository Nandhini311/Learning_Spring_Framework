package com.fairissac.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDIBusiness {

    @Inject
    CDIDAO cdidao;

    public CDIDAO getCdidao() {
        return cdidao;
    }

    //setter injection
    public void setCdidao(CDIDAO cdidao) {
        this.cdidao = cdidao;
    }

    public int findGreatest(){
        int greatest = Integer.MIN_VALUE;
        int[] data = cdidao.getData();
        for(int value: data){
            if(value > greatest)
                greatest = value;
        }
        return greatest;
    }
}
