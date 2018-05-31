package com.example.a18237.dagger2;


import dagger.Module;
import dagger.Provides;

@Module
class HttpActivityModule {


    private int size;


    HttpActivityModule(int size) {
        this.size = size;
    }

    @Provides
    OkHttpClient provideOkHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setSize(size);
        return okHttpClient;
    }

    @Provides
    RetrofitManager provideRetrofitManager(OkHttpClient client) {
        return new RetrofitManager(client);
    }


}
