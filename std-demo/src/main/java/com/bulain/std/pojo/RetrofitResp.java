package com.bulain.std.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

@Data
@ApiModel("接口响应")
public class RetrofitResp {
    @ApiModelProperty(value = "响应代码")
    private String code;
    @ApiModelProperty(value = "响应消息")
    private String message;
    @ApiModelProperty(value = "响应内容")
    private Map<String, Object> data;
}
