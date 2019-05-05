package com.nc.eventparse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nc.jsonparse.Data1;
import com.symantec.dcs.cloud.platform.integration.adapters.aws.events.jsonschema.acceptvpcpeeringconnection.vpc.AcceptVpcPeeringConnection;

import java.io.IOException;
import java.util.List;

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;

public class EventParser {

    public static String accpetVpcPeeringConnection = "{\n" +
            "    \"eventVersion\": \"1.05\",\n" +
            "    \"userIdentity\": {\n" +
            "        \"type\": \"IAMUser\",\n" +
            "        \"principalId\": \"AIDAI4UZF5R2HJFN6A24G\",\n" +
            "        \"arn\": \"arn:aws:iam::944717288117:user/CWA-Dev1\",\n" +
            "        \"accountId\": \"944717288117\",\n" +
            "        \"accessKeyId\": \"ASIA5X5MJ2K2T5DQOYOH\",\n" +
            "        \"userName\": \"CWA-Dev1\",\n" +
            "        \"sessionContext\": {\n" +
            "            \"attributes\": {\n" +
            "                \"mfaAuthenticated\": \"false\",\n" +
            "                \"creationDate\": \"2019-01-24T14:00:27Z\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"invokedBy\": \"signin.amazonaws.com\"\n" +
            "    },\n" +
            "    \"eventTime\": \"2019-01-24T14:58:39Z\",\n" +
            "    \"eventSource\": \"ec2.amazonaws.com\",\n" +
            "    \"eventName\": \"AcceptVpcPeeringConnection\",\n" +
            "    \"awsRegion\": \"us-east-1\",\n" +
            "    \"sourceIPAddress\": \"199.85.125.84\",\n" +
            "    \"userAgent\": \"signin.amazonaws.com\",\n" +
            "    \"requestParameters\": {\n" +
            "        \"vpcPeeringConnectionId\": \"pcx-0a722a4a62cdfb9ad\"\n" +
            "    },\n" +
            "    \"responseElements\": {\n" +
            "        \"requestId\": \"a446f370-8ed4-4d1b-b3a5-a1ca5db3d39b\",\n" +
            "        \"vpcPeeringConnection\": {\n" +
            "            \"vpcPeeringConnectionId\": \"pcx-0a722a4a62cdfb9ad\",\n" +
            "            \"requesterVpcInfo\": {\n" +
            "                \"ownerId\": \"944717288117\",\n" +
            "                \"vpcId\": \"vpc-030d7d65aa3a531c0\",\n" +
            "                \"cidrBlock\": \"192.168.10.0/24\",\n" +
            "                \"region\": \"us-east-1\",\n" +
            "                \"cidrBlockSet\": {\n" +
            "                    \"items\": [\n" +
            "                        {\n" +
            "                            \"cidrBlock\": \"192.168.10.0/24\"\n" +
            "                        }\n" +
            "                    ]\n" +
            "                },\n" +
            "                \"peeringOptions\": {\n" +
            "                    \"allowEgressFromLocalClassicLinkToRemoteVpc\": false,\n" +
            "                    \"allowEgressFromLocalVpcToRemoteClassicLink\": false,\n" +
            "                    \"allowDnsResolutionFromRemoteVpc\": false\n" +
            "                }\n" +
            "            },\n" +
            "            \"accepterVpcInfo\": {\n" +
            "                \"ownerId\": \"944717288117\",\n" +
            "                \"vpcId\": \"vpc-1b27e561\",\n" +
            "                \"cidrBlock\": \"172.31.0.0/16\",\n" +
            "                \"region\": \"us-east-1\",\n" +
            "                \"cidrBlockSet\": {\n" +
            "                    \"items\": [\n" +
            "                        {\n" +
            "                            \"cidrBlock\": \"172.31.0.0/16\"\n" +
            "                        }\n" +
            "                    ]\n" +
            "                },\n" +
            "                \"peeringOptions\": {\n" +
            "                    \"allowEgressFromLocalClassicLinkToRemoteVpc\": false,\n" +
            "                    \"allowEgressFromLocalVpcToRemoteClassicLink\": false,\n" +
            "                    \"allowDnsResolutionFromRemoteVpc\": false\n" +
            "                }\n" +
            "            },\n" +
            "            \"status\": {\n" +
            "                \"code\": \"provisioning\",\n" +
            "                \"message\": \"Provisioning\"\n" +
            "            },\n" +
            "            \"tagSet\": {}\n" +
            "        }\n" +
            "    },\n" +
            "    \"requestID\": \"a446f370-8ed4-4d1b-b3a5-a1ca5db3d39b\",\n" +
            "    \"eventID\": \"97a89bd9-956c-4ff8-9438-b1dcfc0d7d62\",\n" +
            "    \"eventType\": \"AwsApiCall\",\n" +
            "    \"recipientAccountId\": \"944717288117\"\n" +
            "}";

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(INDENT_OUTPUT);


        AcceptVpcPeeringConnection acceptVpcPeeringConnection = objectMapper.readValue(accpetVpcPeeringConnection, AcceptVpcPeeringConnection.class);
//        List<Data1> response = objectMapper.readValue(payload1, objectMapper.getTypeFactory().constructCollectionType(
//                List.class, Data1.class));


        System.out.println(acceptVpcPeeringConnection);

    }



}
