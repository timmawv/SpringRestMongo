package avlyakulov.timur.SpringRestMongo.exceptions;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class NumberOfPassportAlreadyExists extends ResponseStatusException {

    public NumberOfPassportAlreadyExists(HttpStatusCode status, String reason) {
        super(status, reason);
    }
}
