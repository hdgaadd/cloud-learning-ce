package com.yjs.cloud.learning.learn.biz.signup.bean;

import com.yjs.cloud.learning.learn.biz.api.member.bean.MemberResponse;
import com.yjs.cloud.learning.learn.biz.signup.enums.SignUpStatus;
import com.yjs.cloud.learning.learn.common.response.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * <p>
 * 报名
 * </p>
 *
 * @author bill.lai
 * @since 2020-08-29
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel
@Data
public class SignUpResponse extends BaseResponse {

    @ApiModelProperty(value = "课程id")
    private Long lessonId;

    @ApiModelProperty(value = "会员ID")
    private Long memberId;

    @ApiModelProperty(value = "报名状态")
    private SignUpStatus status;

    @ApiModelProperty(value = "完成时间")
    private LocalDateTime completedTime;

    @ApiModelProperty(value = "会员")
    private MemberResponse member;

}
