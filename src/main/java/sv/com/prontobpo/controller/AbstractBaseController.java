package sv.com.prontobpo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.HashMap;

public class AbstractBaseController {

    public static final String CONTENT = "content";
    public static final String MESSAGE = "message";
    public static final String TIMESTAMP = "timestamp";
    public static final String STATUS = "status";
    public static final String CODE_STATUS = "codeStatus";
    public static final String SUCCESS = "success";
    public static final String STATUS_TEXT = "success";
    public static final String ERRORS = "errors";
    public static final String CODIGO_ERROR = "codigoError";


    public ResponseEntity<?> generateSingleHashMapResponse(Object content, String message, HttpStatus status, Integer codeStatus){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(CODE_STATUS, codeStatus);
        hashMap.put(STATUS, HttpStatus.OK);
        hashMap.put(CONTENT, content);
        hashMap.put(MESSAGE, message);
        hashMap.put(TIMESTAMP, new Date());
        return new ResponseEntity<Object>(hashMap, status);
    }

    public ResponseEntity<?> generateErrorHashMap(String message, HttpStatus status, String codiError, int codeStatus){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(STATUS, status);
        hashMap.put(SUCCESS, false);
        hashMap.put(MESSAGE, message);
        hashMap.put(CODIGO_ERROR, codiError);
        hashMap.put(CODE_STATUS, codeStatus);
        hashMap.put(TIMESTAMP, new Date());
        return new ResponseEntity<Object>(hashMap, status);
    }
}
