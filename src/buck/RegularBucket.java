package buck;

/**
 *
 * @author khoi.a.hoang
 */
public class RegularBucket extends AbstractBucket {
    private final Money money;

    public RegularBucket(String bucketId, Money money) {
        super(bucketId);
        this.money = money;
    }

    public Money getMoney() {
        return money;
    }
}
