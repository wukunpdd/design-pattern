package cn.wk.adapter;

import java.util.Map;

/**
 * Created by wukun on 2019/11/5.
 */
public class OutUserInfo extends OutUser implements IUserInfo {

    private Map<String, Object> basicInfo = super.getBasicInfo();
    private Map<String, Object> jobsInfo = super.getJobsInfo();

    public String getUsername() {
        return (String)basicInfo.get("username");
    }

    public String getMobile() {
        return (String)basicInfo.get("mobile");
    }

    public Integer getAge() {
        return (Integer)basicInfo.get("age");
    }

    public String getJobPosition() {
        return (String)jobsInfo.get("jobPosition");
    }

    public String getWage() {
        return (String)jobsInfo.get("wage");
    }
}
