package cn.wk.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wukun on 2019/11/5.
 */
public class OutUser implements IOutUser {
    public Map<String, Object> getBasicInfo() {
        Map<String, Object> basicInfo = new HashMap<String, Object>();
        basicInfo.put("username", "陈蕾");
        basicInfo.put("mobile", "13755919043");
        basicInfo.put("age", 27);
        return basicInfo;
    }

    public Map<String, Object> getJobsInfo() {
        Map<String, Object> jobsInfo = new HashMap<String, Object>();
        jobsInfo.put("jobPosition", "客服");
        jobsInfo.put("wage", "9000");
        return jobsInfo;
    }
}
