package com.lww.lwwlibrary.retrofit;
import com.lww.lwwlibrary.retrofit.entity.BaseResponseEntity;
import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 日期 2020/04/13 10:07
 * lww
 * 自己构建ApiService类
 */
public interface ApiService {
    String APP_SERVER_BASE_URL = "";

    //登录
//    @POST("appDisUserLoginController.do?toUserLogin")
//    Observable<BaseResponseEntity<UserInfo>> login(@Body RequestBody requestBody);


}
