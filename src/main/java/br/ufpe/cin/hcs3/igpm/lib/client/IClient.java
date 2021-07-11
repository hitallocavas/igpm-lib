package br.ufpe.cin.hcs3.igpm.lib.client;

import okhttp3.HttpUrl;

import java.io.IOException;

public interface IClient<T> {
    T doGet(HttpUrl url) throws IOException;
}
