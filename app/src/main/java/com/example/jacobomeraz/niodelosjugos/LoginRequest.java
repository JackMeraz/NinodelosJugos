package com.example.jacobomeraz.niodelosjugos;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Said on 21/10/2017.
 */

public class LoginRequest extends StringRequest {


    private  static final  String LOGIN_REQUEST_URL="http://10.11.28.91/Login.php";
    private Map<String,String> params;
    public LoginRequest( String user, String pass, Response.Listener<String>listener){
        super(Request.Method.POST, LOGIN_REQUEST_URL,listener,null);

        params= new HashMap<>();

        params.put("user",user);
        params.put("pass",pass);



    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

}
