package guru.springframework.msscbrewery.domain;

import guru.springframework.msscbrewery.web.model.v2.BeerStyle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    @Null
    private UUID id;

    @NotBlank
    private String beerName;

    @NotBlank
    private BeerStyle beerStyle;

    @Positive
    private Long upc;

    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;

}
