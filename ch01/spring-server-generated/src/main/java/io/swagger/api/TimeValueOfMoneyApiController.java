package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.ErrorDetail;
import io.swagger.model.SimpleInterestResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-04-16T13:14:05.797687427Z[GMT]")
@RestController
public class TimeValueOfMoneyApiController implements TimeValueOfMoneyApi {

    private static final Logger log = LoggerFactory.getLogger(TimeValueOfMoneyApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TimeValueOfMoneyApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<SimpleInterestResponse> getSimpleInterest(@NotNull @Parameter(in = ParameterIn.QUERY, description = "is the principal amount" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "principal", required = true) BigDecimal principal
,@NotNull @Parameter(in = ParameterIn.QUERY, description = "is the annual rate of interest" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "interestRate", required = true) BigDecimal interestRate
,@NotNull @Parameter(in = ParameterIn.QUERY, description = "is the time for which principal is invested" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "time", required = true) BigDecimal time
,@Pattern(regexp="^(-|\\+)?(DAY|YEAR)$") @Parameter(in = ParameterIn.QUERY, description = "unit of time" ,schema=@Schema(allowableValues={ "DAY", "YEAR" }
, defaultValue="DAY")) @Valid @RequestParam(value = "unitOfTime", required = false, defaultValue="DAY") String unitOfTime
,@Pattern(regexp="^(-|\\+)?(360|365)$") @Parameter(in = ParameterIn.QUERY, description = "a day/year count convention" ,schema=@Schema(allowableValues={ "360", "365" }
, defaultValue="360")) @Valid @RequestParam(value = "yearCountConvention", required = false, defaultValue="360") BigDecimal yearCountConvention
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SimpleInterestResponse>(objectMapper.readValue("{\n  \"simpleInterest\" : 0\n}", SimpleInterestResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SimpleInterestResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SimpleInterestResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
