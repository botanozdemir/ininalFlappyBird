package com.example.mahmoudreda.simplegame.rest;

//import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
//import org.apache.http.conn.ssl.SSLContexts;
//import org.apache.http.conn.ssl.TrustStrategy;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClientBuilder;


/**
 * Created by botanozdemir on 13.11.2017.
 */

public class RestClient {
//    public void loadBalance(final LoadBalanceListener listener, final LoadBalanceRequest loadBalanceRequest) {
//        AsyncTask<String, Void, BaseResponse<LoadBalanceResponse>> asyncTask = new AsyncTask<String, Void, BaseResponse<LoadBalanceResponse>>() {
//            @Override
//            protected void onPreExecute() {
//                if (listener != null) {
//                    listener.loadBalanceConnectionStart();
//                }
//            }
//
//            @Override
//            protected BaseResponse<LoadBalanceResponse> doInBackground(String... params) {
//                BaseResponse<LoadBalanceResponse> loadBalanceResponse = new BaseResponse<LoadBalanceResponse>();
//
//                try {
//
//                    String url = "https://sandbox-api.ininal.com/v2/transaction/in";
//                    JSONObject object = new JSONObject();
//                    try {
//
//                        object.put("cashOfficeId", 1401);
//                        object.put("transactionId", "12345678901");
//                        object.put("amount", 1);
//                        object.put("barcode",loadBalanceRequest.getBarcode());
//
//                    } catch (Exception ex) {
//
//                    }
//
//                    try {
//                        String message = object.toString();
//
//                        HttpPost request = new HttpPost(url);
//                        request.addHeader(new BasicHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1MDk2NzE2MjYsInN1YiI6IklOSU5BTCIsImlzcyI6IjFkNTZlYmY4OTk1M2UwZDE4YTMxZGUxZjAwNmVkYjMyMTFmYTYwNjVlNGVmOTU5MyIsInNjb3BlIjoiQ0FSRFNfTk9OQU1FX1ZJUlRVQUwsQVNTSUdOX1BFUk1JU1NJT05TLExPR0lOX0RFVkVMT1BFUixSRUFELFdSSVRFLERFTEVURSxFWEVDVVRFLEFETUlOX1JFQUQsQURNSU5fV1JJVEUsQURNSU5fREVMRVRFLEFETUlOX0VYRUNVVEUsQ0hBTk5FTF9SRUFELENIQU5ORUxfV1JJVEUsQ0hBTk5FTF9ERUxFVEUsQ0hBTk5FTF9FWEVDVVRFLE9VVEJPVU5EX1JFQUQsT1VUQk9VTkRfV1JJVEUsT1VUQk9VTkRfREVMRVRFLE9VVEJPVU5EX0VYRUNVVEUsSVNfQ1VTVE9NRVJfRVhJU1RTLE1VTFRJTkVUX0NPTExFQ1RfTU9ORVksTVVMVElORVRfQ09MTEVDVF9NT05FWV9ST0xMQkFDSyxPVVRCT1VORF9BU1NJR05fQ0FSRF9UT19DVVNUT01FUixDQVJEU19WSVJUVUFMX0RBVEFfR0VULENBUkRTX1ZJUlRVQUxfSU5GT19HRVQsQ0FSRFNfVklSVFVBTCxDQVJEU19VU0VSU19HRVQsQ0FSRFNfVFJBTlNBQ1RJT05TX0dFVCxDQVJEU19TVEFUVVNfUFVULENBUkRTX1BPU1QsVFJBTlNBQ1RJT05TX0lOLENBUkRTX1BJTl9HRVQsQ0FSRFNfQkFMQU5DRV9HRVQsQ0FSRFNfR0VULFVTRVJTX0NBUkRTX0dFVCxVU0VSU19HRVQsVVNFUlNfR1NNTlVNQkVSX1BVVCxVU0VSU19PVFBfU0VORCxVU0VSU19PVFBfVkVSSUZZLFVTRVJTX1BPU1QsQ09MTEVDVF9NT05FWSxDT0xMRUNUX01PTkVZX1JPTExCQUNLLFRSQU5TQUNUSU9OU19JTl9DQU5DRUwsVFJBTlNBQ1RJT05TX09VVCxUUkFOU0FDVElPTlNfT1VUX0NBTkNFTCIsImV4cCI6MTUwOTY3NTIyNn0.x_UlRjbJvVlsqEyZvXuxrCNuCuiJhOki6H1zDxUseJI"));
//                        request.addHeader(new BasicHeader("Content-Type", "application/json"));
//                        request.setEntity(new StringEntity(message, "UTF8"));
//                        String responseStr = null;
//                        SSLContext sslContext = SSLContexts.custom()
//                                .loadTrustMaterial(null, new TrustStrategy() {
//
//                                    @Override
//                                    public boolean isTrusted(java.security.cert.X509Certificate[] x509Certificates, String s) throws java.security.cert.CertificateException {
//                                        return true;
//                                    }
//
//                                })
//                                .useTLS()
//                                .build();
//
//                        CloseableHttpClient client = HttpClientBuilder.create().setSSLSocketFactory(new SSLConnectionSocketFactory(sslContext)).build();
//                        HttpResponse e = client.execute(request);
//                        org.apache.http.HttpEntity httpEntity = e.getEntity();
//                        responseStr = EntityUtils.toString(httpEntity, "UTF-8");
//
//                        JSONObject getLocationsResponseJson = null;
//                        getLocationsResponseJson = new JSONObject(responseStr);
//
//                        return loadBalanceResponse;
//                    } catch (Exception e) {
//                        Log.e(TAG, "ResourceAccessException during service connection. (getCounties)");
//                        return loadBalanceResponse;
//                    }
//
//                } catch (Exception e) {
//                    return loadBalanceResponse;
//                }
//            }
//            @Override
//            protected void onPostExecute(BaseResponse<LoadBalanceResponse> baseResponse) {
//                if (listener != null) {
//                    listener.loadBalanceConnectionEnd(baseResponse);
//                }
//            }
//        };
//        asyncTask.execute();
//    }

}
