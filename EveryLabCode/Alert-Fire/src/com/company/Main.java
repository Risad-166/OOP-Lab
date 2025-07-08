package com.company;

public class Main {

    public static void main(String[] args) {
	Alert [] alert = new Alert[2];
    alert[0] = new FireAlert();
    alert[1] = new SecurityAlert();
    for(int i= 0; i<2; i++){
        alert[i].triggerAlert();
        alert[i].logAlert();
       }

    }
}
