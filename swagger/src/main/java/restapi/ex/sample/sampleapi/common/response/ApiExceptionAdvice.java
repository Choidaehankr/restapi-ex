package restapi.ex.sample.sampleapi.common.response;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import restapi.ex.sample.sampleapi.common.enums.ExceptionEnum;

import javax.servlet.http.HttpServletRequest;
import java.nio.file.AccessDeniedException;
//
//@RestControllerAdvice
//public class ApiExceptionAdvice {
//    @ExceptionHandler({ApiException.class})
//    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final ApiException e) {
//        return ResponseEntity.status(e.getError().getStatus())
//                .body(ApiExceptionEntity.builder()
//                        .errorCode(e.getError().getCode())
//                        .errorMessage(e.getError().getMessage())
//                        .build());
//    }
//
//    @ExceptionHandler({RuntimeException.class})
//    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final RuntimeException e) {
//        e.printStackTrace();
//        return ResponseEntity.status(ExceptionEnum.RUNTIME_EXCEPTION.getStatus())
//                .body(ApiExceptionEntity.builder()
//                        .errorCode(ExceptionEnum.RUNTIME_EXCEPTION.getCode())
//                        .errorMessage(e.getMessage()).build());
//    }
//
//    @ExceptionHandler({AccessDeniedException.class})
//    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final AccessDeniedException e) {
//        e.printStackTrace();
//        return ResponseEntity.status(ExceptionEnum.ACCESS_DENIED_EXCEPTION.getStatus())
//                .body(ApiExceptionEntity.builder()
//                        .errorCode(ExceptionEnum.RUNTIME_EXCEPTION.getCode())
//                        .errorMessage(e.getMessage())
//                        .build());
//    }
//
//    @ExceptionHandler({AccessDeniedException.class})
//    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final AccessDeniedException e) {
//        e.printStackTrace();
//        return ResponseEntity.status(ExceptionEnum.ACCESS_DENIED_EXCEPTION.getStatus())
//                .body(ApiExceptionEntity.builder()
//                        .errorCode(ExceptionEnum.ACCESS_DENIED_EXCEPTION.getCode())
//                        .errorMessage(e.getMessage())
//                        .build());
//    }
//
//    @ExceptionHandler({Exception.class})
//    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final Exception e) {
//        e.printStackTrace();
//        return ResponseEntity.status(ExceptionEnum.INTERNAL_SERVER_ERROR.getStatus())
//                .body(ApiExceptionEntity.builder()
//                        .errorCode(ExceptionEnum.INTERNAL_SERVER_ERROR.getCode())
//                        .errorMessage(e.getMessage())
//                        .build());
//    }
//}

@RestControllerAdvice
public class ApiExceptionAdvice {
    @ExceptionHandler({ApiException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final ApiException e) {
        //e.printStackTrace();
        return ResponseEntity
                .status(e.getError().getStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(e.getError().getCode())
                        .errorMessage(e.getError().getMessage())
                        .build());
    }

    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final RuntimeException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(ExceptionEnum.RUNTIME_EXCEPTION.getStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(ExceptionEnum.RUNTIME_EXCEPTION.getCode())
                        .errorMessage(e.getMessage())
                        .build());
    }

    @ExceptionHandler({AccessDeniedException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final AccessDeniedException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(ExceptionEnum.ACCESS_DENIED_EXCEPTION.getStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(ExceptionEnum.ACCESS_DENIED_EXCEPTION.getCode())
                        .errorMessage(e.getMessage())
                        .build());
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final Exception e) {
        e.printStackTrace();
        return ResponseEntity
                .status(ExceptionEnum.INTERNAL_SERVER_ERROR.getStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(ExceptionEnum.INTERNAL_SERVER_ERROR.getCode())
                        .errorMessage(e.getMessage())
                        .build());
    }
}