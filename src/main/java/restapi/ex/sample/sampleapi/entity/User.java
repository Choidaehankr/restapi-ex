package restapi.ex.sample.sampleapi.entity;


import io.swagger.annotations.ApiParam;
import lombok.Data;

@Data
public class User {
    @ApiParam(value = "사용자 이름", required = false, example = "최대한")
    private String userName;
    @ApiParam(value = "휴대폰 번호", required = false, example = "010-8669-3789")
    private String phoneNumber;
}
