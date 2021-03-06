package computer_room.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * 配电监控
 *
 * @author Create by Yin Luo Fei
 * @version 0.1
 * @Time 2019/8/13 14 : 52
 */
public class DistributionBean {
    /**
     * status : 0
     * gallery : DI0
     * name : 配电监控
     */

    private int status;
    private String gallery;
    private String name;

    public static DistributionBean objectFromData(String str) {

        return new Gson().fromJson(str, DistributionBean.class);
    }

    public static DistributionBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), DistributionBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<DistributionBean> arrayDistributionBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<DistributionBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<DistributionBean> arrayDistributionBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<DistributionBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
