package com.nc.rnd;

import org.apache.http.client.utils.URIBuilder;

import java.net.URISyntaxException;

public class URICreate {

    public static void main(String[] args) throws URISyntaxException {
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setPath("/scwa/v1/assets/cwa_iam_users?abc=def");
        uriBuilder.setParameter("account_id", "1");
        uriBuilder.setParameter("region", "global");

        System.out.println(uriBuilder.build().toString());
    }


}
