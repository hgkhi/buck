package buck;

/**
 *
 * @author khoi.a.hoang
 */
public class Currency {

    private final String code;

    /**
     * Create a currency object.
     * @see isValid for validation conditions
     * @param code
     * @throws CurrencyException if validation fails
     */
    public Currency(String code) throws CurrencyException {
        this.code = code;
        if (!isValid()) {
            throw new CurrencyException();
        }
    }

    @Override
    public String toString() {
        return code;
    }

    /**
     * A valid currency must be a String
     *  - Exactly 3 character in length
     *  - From range A to Z
     * @return true if it satisfies the conditions
     */
    private boolean isValid() {
        if (code == null || code.length() != 3) {
            return false;
        }
        
        for (char c : code.toCharArray()) {
            if (c < 'A' || c > 'Z') {
                return false;
            }
        }
        
        return true;
    }
}
