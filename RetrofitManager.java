package com.example.a18237.dagger2;


class RetrofitManager {

    private OkHttpClient client;

    RetrofitManager(OkHttpClient client) {
        this.client = client;
    }

    OkHttpClient getClient() {
        return client;
    }
}
