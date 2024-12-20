package P2Mbackend.backendp2m.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class RessouceNotFoundException extends RuntimeException{

    public RessouceNotFoundException(String msg){
        super(msg);
    }
}
