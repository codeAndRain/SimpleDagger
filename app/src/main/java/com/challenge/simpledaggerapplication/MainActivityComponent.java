package com.challenge.simpledaggerapplication;

import dagger.Component;

/**
 * Step  1: Create a dagger component
 * The component is responsible for telling Dagger where to inject - in this case, inject into the MainActivity
 * .
 * .
 * Step 2 : Build project
 */
@Component
public interface MainActivityComponent {

    void inject(MainActivity activity);
}
