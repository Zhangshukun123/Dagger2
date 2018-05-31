package com.example.a18237.dagger2;


import javax.inject.Inject;

class Frodect {

    Prodect prodect;

    @Inject
    Frodect(Prodect prodect) {
        this.prodect = prodect;
    }
}
