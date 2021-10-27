package com.alex.exe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dao<T> {
    
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity)
    {
        map.put(id, entity);
    }

    public T get(String id){
        return map.get(id);
    }

    void update(String id, T entity){
        if(map.containsKey(id)){
            map.put(id, entity);
        }
    }

    public List<T> list(){
        List<T> ret = new ArrayList<>();
        ret.addAll(map.values());
        return ret;
    }

    public void delete(String id){
        if(map.containsKey(id)){
            map.remove(id);
        }
    }
}
