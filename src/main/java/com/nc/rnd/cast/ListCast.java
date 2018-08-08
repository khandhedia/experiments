package com.nc.rnd.cast;

import java.util.Arrays;
import java.util.List;

public class ListCast
{

    public static void main(String[] args) {

        List<CloudTrailEntity> cloudTrailEntityList = Arrays.asList(new CloudTrailEntity(), new CloudTrailEntity());

        GenericClass<List<CloudTrailEntity>> cloudTrailEntityGenericClass = new GenericClass<>();
        cloudTrailEntityGenericClass.method(cloudTrailEntityList);

    }


}
