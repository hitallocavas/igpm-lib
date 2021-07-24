package br.ufpe.cin.hcs3.igpm.lib.caller;

import br.ufpe.cin.hcs3.igpm.lib.client.Client;
import br.ufpe.cin.hcs3.igpm.lib.output.IgpmOutput;
import okhttp3.HttpUrl;

import java.io.IOException;
import java.util.List;

public class IGPMCaller {
    private static final String BASE_URL = "http://api.bcb.gov.br/dados/serie/bcdata.sgs.4175/dados?formato=json";

    private Client<List<IgpmOutput>> client;

    public IGPMCaller(){
        client = new Client<>();
    }

    public List<IgpmOutput> getAll() throws IOException {
        return this.client.doGet(HttpUrl.get(BASE_URL), IgpmOutput[].class);
    }

}
