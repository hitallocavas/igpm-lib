package br.ufpe.cin.hcs3.igpm.lib.mapper;

import com.google.gson.Gson;

import java.util.Objects;

class GsonSingleton {

    private static Gson instance;

    public static Gson getInstance(){
        if(Objects.isNull(instance)){
            instance = new Gson();
        }
        return instance;
    }
}
