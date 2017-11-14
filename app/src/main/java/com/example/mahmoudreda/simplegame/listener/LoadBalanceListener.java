package com.example.mahmoudreda.simplegame.listener;

import com.example.mahmoudreda.simplegame.response.LoadBalanceResponse;

/**
 * Created by botanozdemir on 13.11.2017.
 */

    public interface LoadBalanceListener {
        void loadBalanceConnectionStart();
        void loadBalanceConnectionEnd(LoadBalanceResponse loadBalanceResponse);
    }
