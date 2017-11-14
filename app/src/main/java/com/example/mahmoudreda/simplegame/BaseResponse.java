package com.example.mahmoudreda.simplegame;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by botanozdemir on 13.11.2017.
 */

//@JsonIgnoreProperties(ignoreUnknown = true)
//public class BaseResponse<T> {
//
//        @JsonProperty(value = "statusCode")
//        private String statusCode;
//
//        @JsonProperty(value = "errorCode")
//        private String errorCode;
//
//        @JsonProperty(value = "errorDescription")
//        private String errorDescription;
//
//        @JsonProperty(value = "response")
//        private T response;
//
//        @JsonProperty(value = "validationErrors")
//        private List<String> validationErros;
//
//        public static BaseResponse createFailureResponse() {
//            BaseResponse baseResponse = new BaseResponse<>();
//            baseResponse.setStatusCode("FAILURE");
//            return baseResponse;
//        }
//
//        public boolean isSuccessful() {
//            if (statusCode != null && statusCode.equals("SUCCESS")) {
//                return true;
//            }
//            return false;
//        }
//
//        public String getStatusCode() {
//            return statusCode;
//        }
//
//        public void setStatusCode(String statusCode) {
//            this.statusCode = statusCode;
//        }
//
//        public String getErrorCode() {
//            return errorCode;
//        }
//
//        public void setErrorCode(String errorCode) {
//            this.errorCode = errorCode;
//        }
//
//        public String getErrorDescription() {
//            return errorDescription;
//        }
//
//        public void setErrorDescription(String errorDescription) {
//            this.errorDescription = errorDescription;
//        }
//
//        public T getResponse() {
//            return response;
//        }
//
//        public void setResponse(T response) {
//            this.response = response;
//        }
//
//        public List<String> getValidationErros() {
//            return validationErros;
//        }
//
//        public void setValidationErros(List<String> validationErros) {
//            this.validationErros = validationErros;
//        }
//}
