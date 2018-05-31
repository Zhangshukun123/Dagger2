package com.example.a18237.dagger2;


import dagger.Component;
import dagger.Subcomponent;

@Subcomponent
public interface HttpFragmentComponent {
    void inject(HttpFragment fragment);
}
