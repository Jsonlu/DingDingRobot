package cn.jsonlu.service;

import cn.jsonlu.bean.DingDing;
import cn.jsonlu.bean.DingDingText;
import cn.jsonlu.bean.GitLab;
import cn.jsonlu.bean.GitLabCommits;
import com.alibaba.fastjson.JSON;
import okhttp3.*;

import java.io.IOException;

/**
 * Author:JsonLu
 * DateTime:2017/5/5 15:49
 * Email:jsonlu@qq.com
 * Desc:
 */
public class NetService implements BaseService {

    private final MediaType JSONs = MediaType.parse("application/json; charset=utf-8");
    //需要写token
    private final String URL = "https://oapi.dingtalk.com/robot/send?access_token=********";
    private OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Intercept()).build();

    public String req(String postBody) {
        RequestBody body = RequestBody.create(JSONs, postBody);
        Request request = new Request.Builder()
            .url(URL)
            .post(body)
            .build();
        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void reqDD(GitLab param) {
        StringBuffer data = new StringBuffer("项目：");
        data.append(param.getProject().getName() + "\nGroup：");
        data.append(param.getProject().getNamespace() + "\n提交：");
        data.append(param.getUser_name() + "\n分支：");
        data.append(param.getRef().split("refs/heads/")[1] + "\n内容：");
        for (GitLabCommits commits : param.getCommits()) {
            data.append(commits.getMessage());
            if (commits.getModified() != null && commits.getModified().length > 0) {
                data.append("修改:" + JSON.toJSONString(commits.getModified()));
            }
            if (commits.getAdded() != null && commits.getAdded().length > 0) {
                data.append("增加:" + JSON.toJSONString(commits.getAdded()));
            }
            if (commits.getRemoved() != null && commits.getRemoved().length > 0) {
                data.append("删除:" + JSON.toJSONString(commits.getRemoved()));
            }
            data.append("\n详细：" + commits.getUrl());
        }
        DingDing dingDing = new DingDing();
        DingDingText text = new DingDingText();
        text.setContent(data.toString());
        dingDing.setText(text);
        logger.info(req(JSON.toJSONString(dingDing)));
    }
}
