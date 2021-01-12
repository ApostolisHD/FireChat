package androidprojectchat.google.com.androidprojectchat.Fragments;

import androidprojectchat.google.com.androidprojectchat.Notifications.MyResponse;
import androidprojectchat.google.com.androidprojectchat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAs8dJbo8:APA91bFNmlzJJl5xcXqqiD3YHtvJqYianZwtt-YZkEVM0Hyqk8bAf-e2xPWuqrNCpmBqM8_bWiFsGBYA9TRbQM8k0w1tSZY3zyOLzOdMIF7qND9wpX9TJx4DgOJHr8dLAr1EKyH-Pt-R"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
