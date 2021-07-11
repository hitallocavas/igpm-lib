package br.ufpe.cin.hcs3.igpm.lib.client;

import okhttp3.OkHttpClient;

import static java.util.Objects.isNull;

class OkHttpClientSingleton {
    private static OkHttpClient instance;

    protected static OkHttpClient getInstance() {
        if (isNull(instance)) {
            instance = new OkHttpClient();
        }
        return instance;
    }
}
