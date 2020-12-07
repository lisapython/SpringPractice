package com.lisapra.pra8.others.cache;

import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/**
 * 基于hashMap实现的缓存管理
 */
public class UserCacheManager {

    /**
     * 用户信息缓存
     */
    private static HashMap<String, UserInfo> userList = new HashMap<>();

    /**
     * 保存时间
     */
    private static int liveTime = 60;

    /**
     * 添加用户信息缓存
     * @param sessionId
     * @param userInfo
     * @return
     */
    public static boolean addCache(String sessionId,UserInfo userInfo){
        userList.put(sessionId,userInfo);
        return true;
    }

    /**
     * 删除用户缓存信息
     * @param sessionId
     * @return
     */
    public static boolean delCache(String sessionId){
        userList.remove(sessionId);
        return true;
    }

    /**
     * 获取用户缓存信息
     * @param sessionId
     * @return
     */
    public static UserInfo getCache(String sessionId){
        return userList.get(sessionId);
    }

    /**
     * 清除过期的用户缓存信息
     */
    public static void clearData(){
        Calendar nowTime = Calendar.getInstance();
        nowTime.add(Calendar.MINUTE,-liveTime);
        Date time = nowTime.getTime();
        for(String key : userList.keySet()){
            UserInfo userInfo = userList.get(key);
            if(userInfo.getLogin_time() == null || time.after(userInfo.getLogin_time())){
                userList.remove(key);
            }
        }
    }

}
