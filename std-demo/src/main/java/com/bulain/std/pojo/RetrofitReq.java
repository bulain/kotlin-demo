package com.bulain.std.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

@Data
@ApiModel("接口请求")
public class RetrofitReq {
    @ApiModelProperty(value = "请求接口编号")
    private String requestType;
    @ApiModelProperty(value = "请求唯一码")
    private String requestId;
    @ApiModelProperty(value = "请求时间戳")
    private String requestTime;
    @ApiModelProperty(value = "请求系统ID")
    private String systemId;
    @ApiModelProperty(value = "应用身份ID")
    private String userId;
    @ApiModelProperty(value = "应用认证码")
    private String token;
    @ApiModelProperty(value = "请求签名")
    private String signature;
    @ApiModelProperty(value = "请求内容")
    private Map<String, Object> data;
}
