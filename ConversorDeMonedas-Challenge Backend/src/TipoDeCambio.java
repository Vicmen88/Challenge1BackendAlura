import java.math.BigDecimal;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public record TipoDeCambio(
        String base_code,
        BigDecimal  EUR,
        BigDecimal  MXN,
        BigDecimal  USD,
        Map<String, BigDecimal> conversion_rates
) {
    public BigDecimal getConversionRate(String currencyCode) {
        return this.conversion_rates.get(currencyCode);
    }
}
