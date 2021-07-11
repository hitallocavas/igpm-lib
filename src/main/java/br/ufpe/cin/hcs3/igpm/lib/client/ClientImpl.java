package br.ufpe.cin.hcs3.igpm.lib.client;

import br.ufpe.cin.hcs3.igpm.lib.mapper.Mapper;
import br.ufpe.cin.hcs3.igpm.lib.output.IgpmOutput;
import jdk.nashorn.internal.parser.JSONParser;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

class ClientImpl<T> implements IClient<T> {
    @Override
    public T doGet(HttpUrl url) throws IOException {
        Request request = new Request.Builder().get()
                .url(url)
                .build();

        Response response = OkHttpClientSingleton.getInstance()
                .newCall(request)
                .execute();

        return Mapper.mapToList(Objects.requireNonNull(response.body()).string());
    }
}
