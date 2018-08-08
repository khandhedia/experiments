package com.nc.rnd.cast;

import java.util.List;

public class GenericClass<R> {

    public void method(R r)
    {
        if(r instanceof List)
        {
            List<CWAEntity> cwaEntities = (List<CWAEntity>) r;
            System.out.println(cwaEntities.size());
        }
    }

}
