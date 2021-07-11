package br.ufpe.cin.hcs3.igpm.lib.mapper;

import br.ufpe.cin.hcs3.igpm.lib.output.IgpmOutput;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class Mapper{

    private Mapper() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    public static <T> T mapToList(String json){
        Type listType = new TypeToken<List<T>>(){}.getType();
        return GsonSingleton.getInstance().fromJson(json, listType);
    }
}
