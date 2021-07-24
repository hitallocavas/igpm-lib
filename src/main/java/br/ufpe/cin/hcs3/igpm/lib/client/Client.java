package br.ufpe.cin.hcs3.igpm.lib.client;

import br.ufpe.cin.hcs3.igpm.lib.mapper.Mapper;
import br.ufpe.cin.hcs3.igpm.lib.output.IgpmOutput;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Client<T> {
    public List<IgpmOutput> doGet(HttpUrl url, Class<IgpmOutput[]> type) throws IOException {
        Request request = new Request.Builder().get()
                .url(url)
                .build();

        Response response = OkHttpClientSingleton.getInstance()
                .newCall(request)
                .execute();

        return Arrays.asList(Mapper.mapToList(Objects.requireNonNull(response.body()).string(), type));
    }
}
