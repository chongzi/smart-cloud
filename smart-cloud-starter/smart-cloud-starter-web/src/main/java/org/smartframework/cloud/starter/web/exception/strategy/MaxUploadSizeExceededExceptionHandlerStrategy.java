package org.smartframework.cloud.starter.web.exception.strategy;

import org.smartframework.cloud.common.pojo.enums.ReturnCodeEnum;
import org.smartframework.cloud.common.pojo.vo.RespHeadVO;
import org.smartframework.cloud.starter.core.business.util.RespHeadUtil;
import org.smartframework.cloud.starter.web.exception.AbstractExceptionHandlerStrategy;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
 * @author liyulin
 * @desc 上传文件大小超过限制异常转换
 * @date 2019/10/29
 */
public class MaxUploadSizeExceededExceptionHandlerStrategy extends AbstractExceptionHandlerStrategy {

    @Override
    public boolean match(Throwable e) {
        return e instanceof MaxUploadSizeExceededException;
    }

    @Override
    public RespHeadVO transRespHead(Throwable e) {
        return RespHeadUtil.ofI18n(ReturnCodeEnum.UPLOAD_FILE_SIZE_EXCEEDED);
    }

}