package restapi.ex.sample.sampleapi.common.enums;

import io.swagger.annotations.Api;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;
import restapi.ex.sample.sampleapi.common.response.ApiException;

@Getter
@ToString
public enum ExceptionEnum {
    RUNTIME_EXCEPTION(HttpStatus.BAD_REQUEST, "E0001"),
    ACCESS_DENIED_EXCEPTION(HttpStatus.UNAUTHORIZED, "E0002"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "E0003"),

    SECURITY_01(HttpStatus.UNAUTHORIZED, "S0001", "권한이 없습니다."),

    private final HttpStatus status;
    private final String code;
    private String message;
    ExceptionEnum(HttpStatus status, String code) {
        this.status = status;
        this.code = code;
//        throw new ApiException(ExceptionEnum.SECURITY_01);
    }

    ExceptionEnum (HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
