package com.example.a18237.dagger2;

import dagger.Component;

@Component(modules = HttpActivityModule.class)
public interface HttpActivityComponent {
    HttpFragmentComponent prodiveHttpFragmentComponent();
}
