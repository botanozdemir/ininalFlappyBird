package com.example.mahmoudreda.simplegame.rest;

//import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
//import org.apache.http.conn.ssl.SSLContexts;
//import org.apache.http.conn.ssl.TrustStrategy;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClientBuilder;


import android.os.AsyncTask;
import android.util.Log;

import com.example.mahmoudreda.simplegame.listener.LoadBalanceListener;
import com.example.mahmoudreda.simplegame.request.LoadBalanceRequest;
import com.example.mahmoudreda.simplegame.response.LoadBalanceResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.util.Date;

import javax.net.ssl.SSLContext;

import static android.content.ContentValues.TAG;

/**
 * Created by botanozdemir on 13.11.2017.
 */

public class RestClient {
    public void loadBalance(final LoadBalanceListener listener, final LoadBalanceRequest loadBalanceRequest) {
        AsyncTask<String, Void, LoadBalanceResponse> asyncTask = new AsyncTask<String, Void, LoadBalanceResponse>() {
            @Override
            protected void onPreExecute() {
                if (listener != null) {
                    listener.loadBalanceConnectionStart();
                }
            }

            @Override
            protected LoadBalanceResponse doInBackground(String... params) {

                try {
                    String url = "https://sandbox-api.ininal.com/v2/transactions/in";
                    JSONObject object = new JSONObject();
                    try {
                        Date date = new Date();
                        long transaction = date.getTime();
                        String trId = String.valueOf(transaction);
                        object.put("cashOfficeId", 1401);
                        object.put("transactionId", trId.substring(0,10));
                        object.put("amount", loadBalanceRequest.getAmount());
                        object.put("barcodeNumber",loadBalanceRequest.getBarcode());

                    } catch (Exception ex) {

                    }

                    try {
                        String message = object.toString();

                        HttpPost request = new HttpPost(url);
                        request.addHeader(new BasicHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1MTA2OTQ2ODUsInN1YiI6IklOSU5BTCIsImlzcyI6IjFkNTZlYmY4OTk1M2UwZDE4YTMxZGUxZjAwNmVkYjMyMTFmYTYwNjVlNGVmOTU5MyIsInNjb3BlIjoiQ0FSRFNfTk9OQU1FX1ZJUlRVQUwsQVNTSUdOX1BFUk1JU1NJT05TLExPR0lOX0RFVkVMT1BFUixSRUFELFdSSVRFLERFTEVURSxFWEVDVVRFLEFETUlOX1JFQUQsQURNSU5fV1JJVEUsQURNSU5fREVMRVRFLEFETUlOX0VYRUNVVEUsQ0hBTk5FTF9SRUFELENIQU5ORUxfV1JJVEUsQ0hBTk5FTF9ERUxFVEUsQ0hBTk5FTF9FWEVDVVRFLE9VVEJPVU5EX1JFQUQsT1VUQk9VTkRfV1JJVEUsT1VUQk9VTkRfREVMRVRFLE9VVEJPVU5EX0VYRUNVVEUsSVNfQ1VTVE9NRVJfRVhJU1RTLE1VTFRJTkVUX0NPTExFQ1RfTU9ORVksTVVMVElORVRfQ09MTEVDVF9NT05FWV9ST0xMQkFDSyxPVVRCT1VORF9BU1NJR05fQ0FSRF9UT19DVVNUT01FUixDQVJEU19WSVJUVUFMX0RBVEFfR0VULENBUkRTX1ZJUlRVQUxfSU5GT19HRVQsQ0FSRFNfVklSVFVBTCxDQVJEU19VU0VSU19HRVQsQ0FSRFNfVFJBTlNBQ1RJT05TX0dFVCxDQVJEU19TVEFUVVNfUFVULENBUkRTX1BPU1QsVFJBTlNBQ1RJT05TX0lOLENBUkRTX1BJTl9HRVQsQ0FSRFNfQkFMQU5DRV9HRVQsQ0FSRFNfR0VULFVTRVJTX0NBUkRTX0dFVCxVU0VSU19HRVQsVVNFUlNfR1NNTlVNQkVSX1BVVCxVU0VSU19PVFBfU0VORCxVU0VSU19PVFBfVkVSSUZZLFVTRVJTX1BPU1QsQ09MTEVDVF9NT05FWSxDT0xMRUNUX01PTkVZX1JPTExCQUNLLFRSQU5TQUNUSU9OU19JTl9DQU5DRUwsVFJBTlNBQ1RJT05TX09VVCxUUkFOU0FDVElPTlNfT1VUX0NBTkNFTCIsImV4cCI6MTUxMDY5ODI4NX0.cLbbnLQ6MvFKyHxNBrRgY7Yvg-9v1ZWDbNAMDzB-pI4"));
                        request.addHeader(new BasicHeader("Content-Type", "application/json"));
                        request.setEntity(new StringEntity(message, "UTF8"));
                        String responseStr = null;
                        SSLContext sslContext = SSLContexts.custom()
                                .loadTrustMaterial(null, new TrustStrategy() {

                                    @Override
                                    public boolean isTrusted(java.security.cert.X509Certificate[] x509Certificates, String s) throws java.security.cert.CertificateException {
                                        return true;
                                    }

                                })
                                .useTLS()
                                .build();

                        CloseableHttpClient client = HttpClientBuilder.create().setSSLSocketFactory(new SSLConnectionSocketFactory(sslContext)).build();
                        HttpResponse e = client.execute(request);
                        org.apache.http.HttpEntity httpEntity = e.getEntity();
                        responseStr = EntityUtils.toString(httpEntity, "UTF-8");

                        JSONObject getLocationsResponseJson = null;
                        getLocationsResponseJson = new JSONObject(responseStr);

                        return null;
                    } catch (Exception e) {
                        Log.e(TAG, "ResourceAccessException during service connection. (getCounties)");
                        return null;
                    }

                } catch (Exception e) {
                    return null;
                }
            }
            @Override
            protected void onPostExecute(LoadBalanceResponse loadBalanceResponse) {
                if (listener != null) {
                    listener.loadBalanceConnectionEnd(loadBalanceResponse);
                }
            }
        };
        asyncTask.execute();
    }

}
